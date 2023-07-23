package omprakash.tdd.templerun;

import omprakash.tdd.templerun.Coin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoinTest {

    @Test
    public void givenMinusOne_throwsInvalidCoinValueException() {
        assertThrows(Coin.InvalidCoinValueException.class,
                () -> new Coin(-1),
                "Coin value should be between 0 to 100");
    }

    @Test
    public void given101_throwsInvalidCoinValueException() {
        assertThrows(Coin.InvalidCoinValueException.class, () -> new Coin(101), "Coin value should be between 0 to 100");
    }

    @Test
    public void given10_whenGetValueCalled_thenReturn10() throws Coin.InvalidCoinValueException {
        assertEquals(10, new Coin(10).getValue());
    }

    @Test
    public void given20_whenGetValueCalled_thenReturn20() throws Coin.InvalidCoinValueException {
        assertEquals(20, new Coin(20).getValue());
    }
}

