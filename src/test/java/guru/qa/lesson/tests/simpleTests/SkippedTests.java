package guru.qa.lesson.tests.simpleTests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {

    @Test
    @Disabled
    public void test00() {
        assertTrue(false);
    }

    @Test
    @Disabled
    public void test01() {
        assertTrue(false);
    }

    @Test
    @Disabled("Some reason")
    public void test02() {
        assertTrue(false);
    }
}
