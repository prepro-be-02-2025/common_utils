package sme.hub.common.constants.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartExceptionConst {
    public static final int CART_NOT_FOUND_CODE = 404101;
    public static final String CART_NOT_FOUND_MESSAGE = "Cart not found";

    public static final int CART_ITEM_NOT_FOUND_CODE = 404102;
    public static final String CART_ITEM_NOT_FOUND_MESSAGE = "Cart item not found";

    public static final int CART_EMPTY_CODE = 400103;
    public static final String CART_EMPTY_MESSAGE = "Cart is empty";

    public static final int CART_ITEM_MAX_QUANTITY_EXCEEDED_CODE = 400104;
    public static final String CART_ITEM_MAX_QUANTITY_EXCEEDED_MESSAGE = "Maximum allowed quantity exceeded for this item";
}
