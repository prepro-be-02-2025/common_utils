package sme.hub.common.constants.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotiExceptionConst {
    public static final int NOTIFICATION_NOT_FOUND_CODE = 404501;
    public static final String NOTIFICATION_NOT_FOUND_MESSAGE = "Notification not found";

    public static final int NOTIFICATION_TEMPLATE_NOT_FOUND_CODE = 404502;
    public static final String NOTIFICATION_TEMPLATE_NOT_FOUND_MESSAGE = "Notification template not found";

}
