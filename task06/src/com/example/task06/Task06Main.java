package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        System.out.print(methods[2].getMethodName());
    }
}