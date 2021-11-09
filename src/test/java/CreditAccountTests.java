import Accounts.CreditAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreditAccountTests {
    CreditAccount sut = new CreditAccount("sut",0);

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
        int ammount = 1;
        var expected = RuntimeException.class;

        //assert
        assertThrows(expected,
                //act
                () -> sut.addMoney(ammount));
    }
}
