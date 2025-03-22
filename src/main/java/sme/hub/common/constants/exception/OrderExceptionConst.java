package sme.hub.common.constants.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderExceptionConst {
    public static final int ORDER_NOT_FOUND_CODE = 404201;
    public static final String ORDER_NOT_FOUND_MESSAGE = "Order not found";

    public static final int ORDER_ITEM_NOT_FOUND_CODE = 404202;
    public static final String ORDER_ITEM_NOT_FOUND_MESSAGE = "Order item not found";

    public static final int ORDER_CANNOT_BE_UPDATE_CODE = 400203;
    public static final String ORDER_CANNOT_BE_UPDATE_MESSAGE = "Order cannot be update";

    public static final int ORDER_CANNOT_BE_CANCELLED_CODE = 400204;
    public static final String ORDER_CANNOT_BE_CANCELLED_MESSAGE = "Order cannot be cancelled";

    public static final int ITEM_IS_OUT_OF_STOCK_CODE = 400205;
    public static final String ITEM_IS_OUT_OF_STOCK_MESSAGE = "Item is out of stock";

}
