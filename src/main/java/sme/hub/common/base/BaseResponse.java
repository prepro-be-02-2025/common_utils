package sme.hub.common.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.domain.Page;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {

    MetaData metaData;
    private T data;

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(
                MetaData.builder().code(200)
                        .message("success")
                        .build(),
                data
        );
    }

    public static <T> BaseResponse<T> success(T data, String message) {
        return new BaseResponse<>(
                MetaData.builder()
                        .code(200)
                        .message(message)
                        .build(),
                data);
    }

    public static <T> BaseResponse<T> fail(int code, String message) {
        return new BaseResponse<>(
                MetaData.builder()
                        .code(code)
                        .message(message)
                        .build(),
                null);
    }

}
