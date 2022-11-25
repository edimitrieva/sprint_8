import org.example.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String string;
    private final boolean expectedResult;

    public AccountTest(String string, boolean expectedResult) {
        this.string = string;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"ТимотиШаламе", false},
                {" ТимотиШаламе", false},
                {"ТимотиШаламе ", false},
                {"Т имоти Шаламе", false},
                {"Т м", false},
                {"Тимоти ШаламеСтодвадцатьпятый", false}
        };
    }

    @Test
    public void checkAccount() {
        Account account = new Account(string);
        Assert.assertEquals(expectedResult, account.checkNameToEmboss());
    }

}
