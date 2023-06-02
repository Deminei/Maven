import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Writing assertions for exceptions")
class ExceptionAssertionTest {

    @Test
    @DisplayName("Should not throw an exception")
    void shouldNotThrowException() {
        String message = assertDoesNotThrow(() -> { return "Hello World!"; } );
        assertEquals("Hello World!", message);
    }
}
