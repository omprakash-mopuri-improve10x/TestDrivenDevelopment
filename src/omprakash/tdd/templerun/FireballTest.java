package omprakash.tdd.templerun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FireballTest {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenMinusOne_throwsInvalidFireballException() {
        assertThrows(Fireball.InvalidFireballSpeedException.class,
                () -> new Fireball(-1),
                "Fireball speed should be between 0 to 100");
    }

    @Test
    public void given101_throwsInvalidFireballException() {
        assertThrows(Fireball.InvalidFireballSpeedException.class,
                () -> new Fireball(101),
                "Fireball speed should be between 0 to 100");
    }

    @Test
    public void given10_whenGetSpeedMethodCalled_thenReturn10() throws Fireball.InvalidFireballSpeedException, Obstacle.InvalidObstacleDamageException {
        Fireball fireball = new Fireball(10);
        assertEquals(10, fireball.getSpeed());
    }

    @Test
    public void whenRollMethodCalled_displayRollingMessage() throws Fireball.InvalidFireballSpeedException, Obstacle.InvalidObstacleDamageException {
        Fireball fireball = new Fireball(30);
        fireball.roll();
        assertEquals("Fireball is rolling with 30 speed", outputStream.toString().trim());
    }
}
