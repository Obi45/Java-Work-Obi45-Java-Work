import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testThatNegativeNumber_balanceWillRemainUnchange(){
        Account myAccount = new Account();
        myAccount.depositCash(-50_000);
        assertEquals(0,myAccount.getBalance());
    }
    @Test
    public void testThatWhenYouDepositPositiveNumber_balanceWillChange(){
        Account myAccount = new Account();
        myAccount.depositCash(2_000);
        assertEquals(2_000, myAccount.getBalance());
    }
    @Test
    public void testThatWhenIDepositTwiceThe_balanceChanges(){
        Account myAccount = new Account();
        myAccount.depositCash(4_000);
        myAccount.depositCash(2_000);
        assertEquals(6_000, myAccount.getBalance());
    }

    }
