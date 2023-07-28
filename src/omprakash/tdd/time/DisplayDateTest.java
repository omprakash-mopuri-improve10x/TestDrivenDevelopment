package omprakash.tdd.time;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DisplayDateTest {

    private DisplayDate displayDate = new DisplayDate();

    @Test
    public void nothing() {

    }

    /*@Test
    public void givenMinusOne_throwsInvalidMillisException() {
        assertThrows(DisplayDate.InvalidTimestampException.class, () -> displayDate.getDisplayDate(-1));
    }

    @Test
    public void givenMinusTen_throwsInvalidMillisException() {
        assertThrows(DisplayDate.InvalidTimestampException.class, () -> displayDate.getDisplayDate(-10));
    }*/

    @Test
    public void given0_thenDisplay01Jan1970() throws DisplayDate.InvalidTimestampException {
        assertEquals("01 Jan 1970", displayDate.getDisplayDate(0));
    }

    @Test
    public void given10_thenDisplay01Jan1970() throws DisplayDate.InvalidTimestampException {
        assertEquals("01 Jan 1970", displayDate.getDisplayDate(10));
    }

    @Test
    public void given100000000_thenDisplay02Jan1970() throws DisplayDate.InvalidTimestampException {
        assertEquals("02 Jan 1970", displayDate.getDisplayDate(100000000));
    }

    @Test
    public void given100000_thenDisplay02Jan1970() throws DisplayDate.InvalidTimestampException {
        assertEquals("21 Feb 2143", displayDate.getDisplayDate(5463767467778l));
    }

    @Test
    public void given169028050309_thenDisplay25July2023() throws DisplayDate.InvalidTimestampException {
        assertEquals("11 May 1975", displayDate.getDisplayDate(169028050309l));
    }

    @Test
    public void given1690280503093_thenDisplay25July2023() throws DisplayDate.InvalidTimestampException {
        assertEquals("25 Jul 2023", displayDate.getDisplayDate(1690280503093l));
    }
}
