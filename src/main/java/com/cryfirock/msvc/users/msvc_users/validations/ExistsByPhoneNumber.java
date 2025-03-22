package com.cryfirock.msvc.users.msvc_users.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ExistsByPhoneNumberValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsByPhoneNumber {
    String message() default "Phone number already exists.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
