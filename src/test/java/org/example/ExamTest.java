package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExamTest {
    @ParameterizedTest(name = "#{index} - из {0} вычитаем {1}, ожидаем {2}")
    @CsvSource({"5, 2, 3", "12, 7, 5", "0, 3, -3"})
    @DisplayName("Проверка вычитания")
    @Tag("param_diff")
    void diff1(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.diff(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"5, 2, 7", "12, 7, 19", "0, 3, 3"})
    @DisplayName("Проверка сложения")
    @Tag("param_summ")
    void summ1(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}
