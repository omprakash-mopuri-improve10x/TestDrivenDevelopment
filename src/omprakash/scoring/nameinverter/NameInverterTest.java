package omprakash.scoring.nameinverter;

import omprakash.scoring.nameinverter.NameInverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NameInverterTest {

    private NameInverter nameInverter = new NameInverter();

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnsEmpty() {
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    @Test
    public void givenSingleWord_returnsSingleWord() {
        String invertedName = nameInverter.invertName("first");
        assertEquals("first", invertedName);
    }

    @Test
    public void givenSingleWordWithTrialingSpaces_returnsSingleWord() {
        String invertedName = nameInverter.invertName("first     ");
        assertEquals("first", invertedName);
    }

    @Test
    public void givenSingleWordWithSpaces_returnsSingleWord() {
        String invertedName = nameInverter.invertName("    first     ");
        assertEquals("first", invertedName);
    }

    @Test
    public void givenFirstLast_returnsLastFirst() {
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last first", invertedName);
    }

    @Test
    public void givenHonorifics_returnsInvertedName() {
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last first", invertedName);
    }

    @Test
    public void givenPostNominals_returnsInvertedName() {
        String invertedName = nameInverter.invertName("first last Phd.");
        assertEquals("last first Phd.", invertedName);
    }

    @Test
    public void givenMorePostNominals_returnsInvertedName() {
        String invertedName = nameInverter.invertName("first last Phd. MSc.");
        assertEquals("last first Phd. MSc.", invertedName);
    }
}