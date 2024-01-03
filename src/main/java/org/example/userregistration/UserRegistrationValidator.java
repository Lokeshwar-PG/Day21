package org.example.userregistration;

public class UserRegistrationValidator {

    public void validateFirstName(String firstName, String firstNameRegEx) throws UserRegistrationException {
        if (!firstName.matches(firstNameRegEx)) {
            throw new UserRegistrationException("Invalid first name");
        }
    }

    public void validateLastName(String lastName, String lastNameRegEx) throws UserRegistrationException {
        if (!lastName.matches(lastNameRegEx)) {
            throw new UserRegistrationException("Invalid last name");
        }
    }

    public void validateEmail(String email, String emailRegEx) throws UserRegistrationException {
        if (!email.matches(emailRegEx)) {
            throw new UserRegistrationException("Invalid email");
        }
    }

    public void validatePhone(String phone, String phoneRegEx) throws UserRegistrationException {
        if (!phone.matches(phoneRegEx)) {
            throw new UserRegistrationException("Invalid phone number");
        }
    }

    public void validatePassword(String password, String passwordRegEx) throws UserRegistrationException {
        if (!password.matches(passwordRegEx)) {
            throw new UserRegistrationException("Invalid password");
        }
    }
}
