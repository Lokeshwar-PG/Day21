import org.example.userregistration.UserRegistrationException;
import org.example.userregistration.UserRegistrationValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationExceptionTest {
    UserRegistrationValidator exceptionDemo = new UserRegistrationValidator();

    @Test
    public void testFirstName() throws UserRegistrationException {
        exceptionDemo.validateFirstName("Lokesh", "[A-Z]{1}[a-z]{2,}");
    }

    @Test
    public void testLastName() throws UserRegistrationException {
        exceptionDemo.validateLastName("Kumar", "[A-Z]{1}[a-z]{2,}");
    }

    @Test
    public void testEmail() throws UserRegistrationException{
        exceptionDemo.validateEmail("abc.lokesh@bl.com", "abc[.A-Za-z0-9_+-]*@[a-z0-9]+.[a-z]+[.a-z]*");
    }

    @Test
    public void testPhone() throws UserRegistrationException {
        exceptionDemo.validatePhone("91 9677595842", "\\d{1,3}\\s\\d{10}");
    }

    @Test
    public void testPassword() throws UserRegistrationException {
        exceptionDemo.validatePassword("Lokesh@98", "([A-Z]+[a-z]*[@_][0-9]+)");
    }

    @ParameterizedTest
    @CsvSource({"abc.lokesh@gmail.com, true", "abc@@.com, false"})
    public void testAllEmail(String email, boolean expected) throws UserRegistrationException {
        exceptionDemo.validateEmail(email, "abc[.A-Za-z0-9_+-]*@[a-z0-9]+.[a-z]+[.a-z]*");
    }

}
