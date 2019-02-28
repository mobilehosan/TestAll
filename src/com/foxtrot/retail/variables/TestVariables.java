package com.foxtrot.retail.variables;

public class TestVariables implements Showable{

/*
•	Примитивы (byte, short, int, long, char, float, double, boolean)
•	Циклы и ветвления (if, else, switch, case, default, while, do, break, continue, for)
•	Исключения (try, catch, finally, throw, throws)
•	Области видимости (private, protected, public)
•	Объявление \ Импорт (import, package, class, interface, extends, implements, static, final, void, abstract, native)
•	Создание \ Возврат \ Вызов (new, return, this, super)
•	Многопоточность (synchronized, volatile)
•	instanceof, enum, assert, transient, strictfp, const, goto
*/

    byte goto1 = 1;          // •	byte (целые числа, 1 байт, [-128, 127])
    short shortVar = 1000;           // •	short (целые числа, 2 байта, [-32768, 32767])

    int $irntVar = 100_000;            // •	int (целые числа, 4 байта, [-2 147 483 648, 2147483647])
    long _longVsdfgar = 1000000000;   // •	long (целые числа, 8 байт, [-922372036854775808,922372036854775807])

    char charVar = 'D';              // •	char (символ Unicode, 2 байта, [0, 65536])
    char charVar1 = '\u1230';

    float floatVar = 123.32f;        // •	float (вещественные числа, 4 байта)
    double doubleVar = 213.23234;    // •	double (вещественные числа, 8 байт)

    boolean booleanVar ;       // •	boolean (значение истина/ложь, используется int, зависит от JVM)


    boolean booleanVarFalse = false;

    String hello = "Hello World!";
    String world = "Hello World!";


    @Override
    public void showTest() {


//    if (1==2) {
//        System.out.println("true");
//    }
//    else {
//        System.out.println("false");
//    }
        System.out.println((byte)32766);
        System.out.println((byte)-32767);
        System.out.println((byte)130);
        System.out.println((byte)131);
        System.out.println((byte)132);
        System.out.println((byte)133);
        System.out.println((byte)-130);
        System.out.println((byte)12237L ); /// !!!!!!!!! LONG

        //System.out.println((1==2)?"true":"false");

//        byte b1 = 127;
//        byte b2 = 127;
//
//        int b3 = b1 + b2;
//
//        int i1 = 2147483647;
//        int i2 = 2147483647;
//
//        int i3 = i1 + i2;
//
//        System.out.println(i3);
//
//        System.out.println(charVar1);
//        //System.out.println(byteVar2323);
//        System.out.println(shortVar);
//        //System.out.println($intVar);
//        //System.out.println(_longVar);
//        System.out.println(charVar);
//        System.out.println(floatVar);
//        System.out.println(doubleVar);
//        System.out.println(booleanVar);

//
//        if (hello == world) {
//            System.out.println("Так оно и есть!!!");
//        }

//        String s1 = "Hello World!";
//        String s2 = "Hello World!";
//        String s3 = new String("Hello World!");
//
//        if (s1 == s2) {
//            System.out.println("s1 == s2");
//        }
//
//        if (s2 == s3) {
//            System.out.println("s2 == s3");
//        } else {
//            System.out.println("s2 != s3");
//        }
//
//        Integer a = 127;
//        Integer b = 127;
//        if (a == b) {
//            System.out.println("a == b");
//        }
//
//        Integer aa = 128;
//        Integer bb = 128;
//        if (aa == bb) {
//            System.out.println("aa == bb");
//        } else {
//            System.out.println("aa != bb");
//        }


        // Преобразования типов для оберток
        /*
        1.	типы совместимы (например — оба целочисленные)
        2.	размер «принимающего» типа больше чем у того, который преобразуется (так называемое «преобразование с расширением»)
        */

        /*

        1.	byte, short, char в выражениях всегда повышаются до int
        2.	если в выражении участвует тип long — то именно к этому типу будет приведён результат
        3.	если в выражении участвует float — то результат приводится к float
        4.	если один из операндов имеет тип double — то к этому типу будет приведён весь результат
        5.	при выборе между длиной и возможностью сохранить дробную часть — будет выбрана дробная часть

        */



    }

}
