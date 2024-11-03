package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class RightAccountTest {

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
    public void rightAccountName() {
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }
}
