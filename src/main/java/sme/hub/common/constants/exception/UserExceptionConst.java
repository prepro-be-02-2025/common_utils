package sme.hub.common.constants.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserExceptionConst {
    public static final int USER_NOT_FOUND_CODE = 404001;
    public static final String USER_NOT_FOUND_MESSAGE = "User not found";

    public static final int USER_ALREADY_EXISTS_CODE = 400002;
    public static final String USER_ALREADY_EXISTS_MESSAGE = "User already exists";

    public static final int INVALID_USER_CREDENTIALS_CODE = 401003;
    public static final String INVALID_USER_CREDENTIALS_MESSAGE = "Invalid username or password";

    public static final int USER_ACCESS_DENIED_CODE = 403004;
    public static final String USER_ACCESS_DENIED_MESSAGE = "User does not have permission";

    public static final int USER_TOKEN_EXPIRED_CODE = 401005;
    public static final String USER_TOKEN_EXPIRED_MESSAGE = "Authentication token has expired";

    public static final int USER_NOT_ACTIVE_CODE = 403006;
    public static final String USER_NOT_ACTIVE_MESSAGE = "User account is not active";
}

