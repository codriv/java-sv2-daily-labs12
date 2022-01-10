package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    Running running = new Running();
    Path path = Path.of("src/test/resources/running.csv");

    @Test
    void test() {
        assertEquals(41.2, running.getFullDistance(12, 2021));
    }

}