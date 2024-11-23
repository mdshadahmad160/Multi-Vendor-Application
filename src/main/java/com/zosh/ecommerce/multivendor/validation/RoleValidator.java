package com.zosh.ecommerce.multivendor.validation;

import com.zosh.ecommerce.multivendor.util.Roles;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

@Component
public class RoleValidator implements ConstraintValidator<ValidRole,String> {
    private final List<String> allowedRoles = Arrays
            .stream(Roles.values())
            .map(Roles::getValue)
            .toList();

    @Override
    public boolean isValid(String role, ConstraintValidatorContext context) {
        return role != null && allowedRoles.contains(role);
    }
}
