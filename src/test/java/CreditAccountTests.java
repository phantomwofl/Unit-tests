import Accounts.CreditAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditAccountTests {
    CreditAccount sut = new CreditAccount("sut",-5000);

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("Tests completed");
    }

    @Test
    public void testAddMoney() {
        //arrange
        int ammount = 1000;

        //assert
        assertDoesNotThrow(
                //act
                () -> sut.addMoney(ammount));
    }
}
