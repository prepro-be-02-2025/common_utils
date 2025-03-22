package sme.hub.common.exception.details;

import sme.hub.common.constants.exception.CartExceptionConst;
import sme.hub.common.exception.ApplicationException;

public class CartNotPoundException extends ApplicationException {
    public CartNotPoundException() {
        super(CartExceptionConst.CART_NOT_FOUND_MESSAGE, CartExceptionConst.CART_NOT_FOUND_CODE);
    }
}
