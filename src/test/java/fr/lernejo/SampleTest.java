package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssertAlternative;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void fact_negative() {
        var sample = new Sample();

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> sample.fact(-2))
                .withMessage("N should be positive");
    }

    @Test
    void fact_zero() {
        var sample = new Sample();

        int result = sample.fact(0);
        Assertions.assertThat(result)
                .as("factorielle of zero")
                .isEqualTo(1);
    }

    @Test
    void fact_positive() {
        var sample = new Sample();

        int result = sample.fact(3);
        Assertions.assertThat(result)
                .as("factorielle of Positive number")
                .isEqualTo(6);
    }


    @Test
    void op_ADD() {
        var sample = new Sample();

        int result = sample.op(Sample.Operation.ADD,2,3);
        Assertions.assertThat(result)
                .as("sum of 2 numbers")
                .isEqualTo(5);
    }

    @Test
    void op_MUL() {
        var sample = new Sample();

        int result = sample.op(Sample.Operation.MULT,4,3);
        Assertions.assertThat(result)
                .as("Mult of two number")
                .isEqualTo(12);
    }

}
