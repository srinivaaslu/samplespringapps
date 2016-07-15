package com.mkyong.customer.validator;

import com.mkyong.customer.model.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by 205025 on 6/6/2016.
 */
public class CustomerValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "required.userName", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address",
                "required.address", "Field name is required.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
                "required.password", "Field name is required.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword",
                "required.confirmPassword", "Field name is required.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sex",
                "required.sex", "Field name is required.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "favNumber",
                "required.favNumber", "Field name is required.");

        ValidationUtils.rejectIfEmptyOrWhitespace(
                errors, "javaSkills", "required.javaSkills", "Field name is required.");

        Customer cust = (Customer)object;
        if(!(cust.getPassword().equals(cust.getConfirmPassword()))){
            errors.rejectValue("password", "notmatch.password");
        }

        if(cust.getFavFramework().length==0){
            errors.rejectValue("favFramework", "required.favFrameworks");
        }

        if("NONE".equals(cust.getCountry())){
            errors.rejectValue("country", "required.country");
        }
    }
}
