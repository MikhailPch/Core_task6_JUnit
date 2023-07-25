import org.junit.jupiter.api.Assertions;
import ru.netology.CreditAccount;
import ru.netology.SimpleAccount;

public class AccountTest {
    SimpleAccount simpleAccount = new SimpleAccount(1000);
    CreditAccount creditAccount = new CreditAccount(-500, 1000);

    @org.junit.jupiter.api.Test
    public void testSimpleAccountAdd() {

        Assertions.assertTrue(simpleAccount.add(1000));
        Assertions.assertEquals(2000, simpleAccount.getBalance());
    }

    @org.junit.jupiter.api.Test
    public void testSimpleAccountPay() {

        Assertions.assertTrue(simpleAccount.pay(500));
        Assertions.assertFalse(simpleAccount.pay(2000));
        Assertions.assertEquals(500, simpleAccount.getBalance());
    }

    @org.junit.jupiter.api.Test
    public void testSimpleAccountTransfer() {

        Assertions.assertTrue(simpleAccount.transfer(creditAccount, 500));
        Assertions.assertFalse(simpleAccount.transfer(creditAccount, 1500));
        Assertions.assertEquals(500, simpleAccount.getBalance());
    }
}
