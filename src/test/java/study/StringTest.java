package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

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

    @DisplayName("substring test case")
    @Test
    void substring() {
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }
    @DisplayName("charAt test case")
    @Test
    void charAt() {
        char actual = "abc".charAt(2);
        assertThat(actual).isEqualTo("c");
    }

    @DisplayName("charAt fail test case")
    @Test
    void failCharAt() {
        assertThatThrownBy(() -> {
            char actual = "abc".charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }

}
