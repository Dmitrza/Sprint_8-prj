package praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class InvalidAccountTest {

    @Parameterized.Parameter
        public String name;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {" Timothe Shalame"},
                {" Timothe Shalame "},
                {"Timothe Shalame "},
                {"TimotheShalame"},
                {"Tim Shalam Ee"},
                {"Ti"},
                {"Timoteeeeee Shalemeenmnmjkiopas"}
        };
    }

    @Test
    @DisplayName("Check invalid account name")
    public void invalidAccountName() {
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

}
