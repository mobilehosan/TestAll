package com.foxtrot.retail.variables;

public class TestClass {

// for
// ?

    public static void main(String[] args) {
        //System.out.println("Hello Ритейловцы!");
        //Showable test = new TestVariables();
        int algorithm = 3;
        Showable test = null;
        switch(algorithm){
            case 1:
                test = new TestVariables();
            case 2:
                test = new TestCyclesAndIfAndSwitch();
            case 3:
                test = new TestAdditionalVar();
        }

        test.showTest();
        //test.showTest();
    }

//  Зарезервированные слова.
/*
•	Примитивы (byte, short, int, long, char, float, double, boolean)
•	Циклы и ветвления (if, else, switch, case, default, while, do, break, continue, for)
•	Исключения (try, catch, finally, throw, throws)
•	Области видимости (private, protected, public)
•	Объявление \ Импорт (import, package, class, interface, extends, implements, static, final, void, abstract, native)
•	Создание \ Возврат \ Вызов (new, return, this, super)
•	Многопоточность (synchronized, volatile)
•	instanceof, enum, assert, transient, strictfp, const, goto

не используются: const, goto
*/

}
