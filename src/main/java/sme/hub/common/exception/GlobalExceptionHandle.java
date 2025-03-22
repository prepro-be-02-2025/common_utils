package sme.hub.common.exception;

import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import sme.hub.common.base.BaseException;
import sme.hub.common.base.BaseResponse;
import sme.hub.common.exception.details.CartItemNotPoundException;
import sme.hub.common.exception.details.CartNotPoundException;

@AllArgsConstructor
@ControllerAdvice
public class GlobalExceptionHandle extends BaseException {

    @ExceptionHandler(ApplicationException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<BaseResponse> handleApplicationException(ApplicationException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(BaseResponse.fail(1, ex.getMessage()));
    }

    @ExceptionHandler(CartNotPoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<BaseResponse> handleCartNotFound(CartNotPoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(BaseResponse.fail(ex.getCode(), ex.getMessage()));
    }

    @ExceptionHandler(CartItemNotPoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<BaseResponse> handleCartItemNotFound(CartItemNotPoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(BaseResponse.fail(ex.getCode(), ex.getMessage()));
    }
}
