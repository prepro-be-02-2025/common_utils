package sme.hub.common.constants.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentExceptionConst {
    public static final int PAYMENT_INFORMATION_NOT_FOUND_CODE = 404401;
    public static final String PAYMENT_INFORMATION_NOT_FOUND_MESSAGE = "Payment information not found";

    public static final int PAYMENT_METHOD_NOT_FOUND_CODE = 404402;
    public static final String PAYMENT_METHOD_NOT_FOUND_MESSAGE = "Payment method not found";

    public static final int PAYMENT_INVALID_AMOUNT_CODE = 400403;
    public static final String PAYMENT_INVALID_AMOUNT_MESSAGE = "Invalid payment amount";

    public static final int PAYMENT_CARD_EXPIRED_CODE = 400404;
    public static final String PAYMENT_CARD_EXPIRED_MESSAGE = "Payment card is expired";

    public static final int PAYMENT_INSUFFICIENT_FUNDS_CODE = 400405;
    public static final String PAYMENT_INSUFFICIENT_FUNDS_MESSAGE = "Insufficient funds for payment";

    public static final int PAYMENT_TRANSACTION_DECLINED_CODE = 400406;
    public static final String PAYMENT_TRANSACTION_DECLINED_MESSAGE = "Payment transaction was declined";

    public static final int PAYMENT_TIMEOUT_CODE = 408407;
    public static final String PAYMENT_TIMEOUT_MESSAGE = "Payment has expired";

}
