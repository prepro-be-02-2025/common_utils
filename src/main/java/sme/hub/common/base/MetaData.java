package sme.hub.common.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaData {
    private String requestId;
    private int code;
    private String message;

    private Integer page;
    private Integer site;
    private Integer total;

//    List<Object> errors;

}
