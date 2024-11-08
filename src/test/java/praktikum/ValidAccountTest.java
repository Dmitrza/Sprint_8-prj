package praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ValidAccountTest {

    @Parameterized.Parameter
    public String name;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Timothee Shalame"},
                {"Ivan Petrov"},
        };
    }

    @Test
    @DisplayName("Check valid account name")
    public void validAccountName() {
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }
}
