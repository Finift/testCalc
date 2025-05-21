package org.example;

public class Calc {

    public int summ(int a, int b){ //это метод
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        //System.out.printf("Сумма %d и %d равна %d\n",a, b, result); //форматированный вывод, у него нет перевода на сл.строку,
        // в отличии от верхнего метода, ппоэтому добавляем либо пустой System.out.println(),
        // либо \n
        //System.out.println("Сумма " + a + " и " + b + " равна " + result);
        return result;
    }

    public int diff(int a, int b){
        int result;
        result = a - b;
        System.out.printf("Разность %d и %d равна %d\n", a, b, result);
        return result;
    }
}
