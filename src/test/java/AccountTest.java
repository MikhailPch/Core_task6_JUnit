import org.junit.jupiter.api.Assertions;
import ru.netology.CreditAccount;
import ru.netology.SimpleAccount;

public class AccountTest {
    SimpleAccount simpleAccount = new SimpleAccount(1000);
    CreditAccount creditAccount = new CreditAccount(0, 1000);
    @org.junit.jupiter.api.Test
    public void testAdd() {
        Assertions.assertTrue(simpleAccount.add(1000));
        Assertions.assertEquals(2000, simpleAccount.getBalance());
        Assertions.assertFalse(creditAccount.add(1000));
        Assertions.assertEquals(0, creditAccount.getBalance());

    }
    @org.junit.jupiter.api.Test
    public void testPay(){
        Assertions.assertTrue(simpleAccount.pay(500));
        Assertions.assertFalse(simpleAccount.pay(1000));
        Assertions.assertEquals(500, simpleAccount.getBalance());
        Assertions.assertFalse(creditAccount.pay(1500));
        Assertions.assertTrue(creditAccount.pay(500));
        Assertions.assertEquals(-500, creditAccount.getBalance());

    }
    @org.junit.jupiter.api.Test
    public void testTransfer(){
        creditAccount.pay(500);
        Assertions.assertTrue(simpleAccount.transfer(creditAccount, 500));
        Assertions.assertFalse(simpleAccount.transfer(creditAccount, 500));
        Assertions.assertTrue(creditAccount.transfer(simpleAccount, 500));
        Assertions.assertFalse(creditAccount.transfer(simpleAccount, 1500));
        Assertions.assertEquals(1000, simpleAccount.getBalance());
        Assertions.assertEquals(-500, creditAccount.getBalance());
    }
}
