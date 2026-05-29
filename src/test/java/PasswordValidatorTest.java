import org.junit.Test;
import pages.PasswordValidator;

import static org.junit.Assert.*;

public class PasswordValidatorTest {
    @Test
    public void testValidPassword(){
        PasswordValidator validator = new PasswordValidator();
        // Valid password:
        // - Length between 7 and 20
        // - Contains uppercase letter
        // - Contains lowercase letter
        // - Contains special character
        String password = "Test@123";

        assertTrue(validator.isValid(password));
    }
    @Test
    public void testUnsuccessfulLoginWithShortPassword(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Tes@12";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testSuccessfulLoginWithMaximumValidPasswordLength(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Valid@Password1234";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testSuccessfulLoginWithValidComplexPassword(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Login#2024";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testSuccessfulLoginWithExclamationSpecialCharacter(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Test!123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testSuccessfulLoginWithAmpersandSpecialCharacter(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Valid&123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testSuccessfulLoginWithMultipleNumbersInPassword(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Pass@2024";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testSuccessfulLoginWithUppercaseAndLowercaseLetters(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Strong@Password1";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testSuccessfulLoginWithPasswordContainingNoSpaces(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "NoSpace@123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testUnsuccessfulLoginWithPasswordShorterThanEightCharacters(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Tes@12";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithPasswordLongerThanTwentyCharacters(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "VeryLongPassword@12345";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithoutUppercaseLetter(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "test@123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithoutLowercaseLetter(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "TEST@123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithoutNumericDigit(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Test@Password";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testUnsuccessfulLoginWithoutSpecialCharacter(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Test1234";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithSpacesInPassword(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Test @123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertTrue(result);
    }
    @Test
    public void testUnsuccessfulLoginWithoutUppercaseLetterAndSpecialCharacter(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "test1234";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithShortPasswordAndMissingNumber(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "Tes@ab";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithSpacesAndNoLowercaseLetters(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "TEST @123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
    @Test
    public void testUnsuccessfulLoginWithMultipleInvalidPasswordConditions(){
        //Arrange
        PasswordValidator validator = new PasswordValidator();
        String password = "verylongpassword withoutspecial123";

        //Act
        boolean result = validator.isValid(password);

        //Assert
        assertFalse(result);
    }
}
