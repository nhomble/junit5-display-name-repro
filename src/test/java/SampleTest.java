import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @ParameterizedTest(name = "{0} '' {1}")
    @CsvSource(value = {
            "1,1",
            "1,2"
    })
    void withApostrophe(int x, int y){
        assertEquals(y, x);
    }

    @ParameterizedTest(name = "{0} {1}")
    @CsvSource(value = {
            "1,1",
            "1,2"
    })
    void plainAndSimple(int x, int y){
        assertEquals(y, x);
    }
}
