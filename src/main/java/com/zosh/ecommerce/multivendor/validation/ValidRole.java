package com.zosh.ecommerce.multivendor.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RoleValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidRole {
    String message() default "Invalid role";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
