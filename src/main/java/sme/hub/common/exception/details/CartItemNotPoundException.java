package sme.hub.common.exception.details;

import sme.hub.common.constants.exception.CartExceptionConst;
import sme.hub.common.exception.ApplicationException;

public class CartItemNotPoundException extends ApplicationException {
    public CartItemNotPoundException(String message, int code) {
        super(CartExceptionConst.CART_ITEM_NOT_FOUND_MESSAGE,CartExceptionConst.CART_ITEM_NOT_FOUND_CODE);
    }
}
