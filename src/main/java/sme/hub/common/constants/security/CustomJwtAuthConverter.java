package sme.hub.application.auth;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.util.Assert;

import java.util.*;

public class CustomJwtAuthConverter  implements Converter<Jwt, AbstractAuthenticationToken> {
    private Converter<Jwt, Collection<GrantedAuthority>> jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();

    public final AbstractAuthenticationToken convert(Jwt jwt) {
        Collection<GrantedAuthority> authorities = (Collection)this.jwtGrantedAuthoritiesConverter.convert(jwt);

        return new JwtAuthenticationToken(jwt, this.converter(jwt), this.getPreferredUsername(jwt));
    }
    public Collection<GrantedAuthority> converter(Jwt jwt) {

        Map<String, Object> realmAccess = jwt.getClaim("realm_access");

        if(realmAccess == null) {
            throw new RuntimeException("Realm is null");
        }
        Collection<String> roles = (Collection<String>) realmAccess.get("roles");
        if(roles == null) {
            throw new RuntimeException("Roles is null");
        }
        Set<GrantedAuthority> authorities = new HashSet<>();
        for(String role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role));
        }
        return authorities;
    }
    public String getPreferredUsername(Jwt jwt) {
        return jwt.getClaim("preferred_username").toString();
    }
}
