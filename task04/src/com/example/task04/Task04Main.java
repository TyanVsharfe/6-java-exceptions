package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(getSeason(5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            throw new MyException(String.format("monthNumber %d is invalid, month number should be between 1..12",monthNumber));
        else if (monthNumber >= 3 && monthNumber < 6)
            return "весна";
        else if (monthNumber >= 6 && monthNumber < 9)
            return  "лето";
        else if (monthNumber >= 9 && monthNumber < 12)
            return  "осень";
        else
            return "зима";
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

}