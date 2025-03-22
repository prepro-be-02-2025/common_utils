package sme.hub.common.constants.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductExceptionConst {
    public static final int PRODUCT_NOT_FOUND_CODE = 404301;
    public static final String PRODUCT_NOT_FOUND_MESSAGE = "Product not found";

    public static final int PRODUCT_CATEGORY_NOT_FOUND_CODE = 404302;
    public static final String PRODUCT_CATEGORY_NOT_FOUND_MESSAGE = "Product category not found";

    public static final int PRODUCT_IMAGE_INVALID_CODE = 400303;
    public static final String PRODUCT_IMAGE_INVALID_MESSAGE = "Invalid product image format";

    public static final int PRODUCT_ALREADY_EXISTS_CODE = 400304;
    public static final String PRODUCT_ALREADY_EXISTS_MESSAGE = "Product already exists";
}
