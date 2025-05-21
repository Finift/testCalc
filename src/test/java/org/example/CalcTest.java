package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)  // не даст тесту проходить больше, чем 10 секунд
    //@Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
        //сообщение будет выведено, если результат сравнения false
    }


    @DisplayName("Проверка суммирования 2")
    @Timeout(10)  // не даст тесту проходить больше, чем 10 секунд
    @RepeatedTest(10)  //повторения теста, если он нестабильный, чтобы поймать
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
        //сообщение будет выведено, если результат сравнения false
    }

    @ParameterizedTest(name = "#{index} - cложение {0} и {1}, ожидаем {2}")
    //то, что в скобках - чисто для удобства отображения результатов, {0} - нулевая переменная в методе
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3")
    @Timeout(10)  // не даст тесту проходить больше, чем 10 секунд
    @Tag("param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
        //сообщение будет выведено, если результат сравнения false

    }


}