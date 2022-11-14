package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @DisplayName("split test case")
    @Test
    void split() {
        List<String> actual = Arrays.asList("1,2".split(","));
        assertThat(actual).contains("1","2");
        assertThat(actual).containsExactly("1","2");
    }
}
