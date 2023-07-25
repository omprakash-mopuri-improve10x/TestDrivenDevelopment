package omprakash.tdd.templerun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTest {

    private ByteArrayOutputStream byteArrayOutputStream;

    @BeforeEach
    private void setup() {
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenWidthMinusOne_throwsInvalidWidthException() {
        assertThrows(SpikePit.InvalidSpikePitWidthException.class, () -> new SpikePit(-1),
                "SpikePit width should be 0 to 100");
    }

    @Test
    public void givenWidth101_throwsInvalidWidthException() {
        assertThrows(SpikePit.InvalidSpikePitWidthException.class, () -> new SpikePit(101),
                "SpikePit width should be 0 to 100");
    }

    @Test
    public void givenWidth100_whenTrapCalled_displayTrappingMessage() throws Exception {
        SpikePit spikePit = new SpikePit(100);
        Player player = new Player("Name");
        spikePit.trap(player);
        assertEquals("SpikePit" + " trapped" + "Name" + " inside! it is " + 100 + " meters wide",
                byteArrayOutputStream.toString().trim());
    }

    @Test
    public void whenTrapCalled_reduceHealth() throws Exception {
        SpikePit spikePit = new SpikePit(100);
        Player player = new Player("Name");
        spikePit.trap(player);
        assertEquals(50, player.getHealth());
    }
}
