import Accounts.Account;
import Accounts.CheckingAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingAccountTests {
    static CheckingAccount sut = new CheckingAccount("sut", 50000);
    CheckingAccount sut2 = new CheckingAccount("sut2", 4000);

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("Tests completed");
    }

    @Test
    public void testPay() {
        //arrange
        int ammount = 60000;
        String expected = "Не хватает средств для платежа";

        //act
        String result = sut.pay(ammount);

        //assert
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testTransfer(Account account, int amount, String expected) {
        //act
        String result = sut2.transfer(account, amount);

        //arrange
        assertEquals(expected, result);
    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of(sut, 3000, "1000"), Arguments.of(sut, 6000, "Не хватает средств для перевода"));
    }
}
