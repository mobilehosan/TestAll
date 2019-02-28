package com.foxtrot.retail.variables;


public class TestCyclesAndIfAndSwitch implements Showable {

    long _longVar = 1_000_000_000;
    boolean booleanVar = true;
    boolean booleanVarFalse = false;

    private void doTestIf(){
        if ( true ) {
            System.out.println("only if = "+booleanVar);
        }

        if ( _longVar > 10 ) {
            System.out.println("if and else = "+booleanVar);
        } else {
            System.out.println("if and else = "+booleanVarFalse);
        }
    }

    private void doTestFor(){
        /*
        *for (Начальное значение переменной; Логическое выражение с переменной (условие выполнения цикла); Действие над переменной, после выполнения тела цикла) {
              Операторы, которые будут выполнять цикл при условии, что логическое выражение - true;
         }
        * */
//        int j = 0;
//
//        for (int i = 0; i <= 100 ; i++, j-- ) {
//            if (i == 10) {
//                continue;
//            }
//
//            System.out.println("i = "+i);
//            if (i == 20) {
//                break;
//            }
//            System.out.println("i = "+i);
//        }

//        int i = 0;
//        for (; i <= 100 ; i++) {
//            System.out.println("i = "+i);
//        }
//
//        int j = 0;
//        for (; j <= 100 ;) {
//            System.out.println("j = "+j);
//            j++;
//        }
        // бесконечный цикл
//        for (;;) {
//            System.out.println("!!!");
//        }
    }

    private void doTestWhile(){
        int a=0;

        while(a < 10) {
            a++;
            System.out.println("a="+a);
        }

        int k = 0;
        do {
            k++;
            System.out.println("k="+k);
        } while (k<10);
    }

    private void doTestSwitch(){
        // SWITCH !!!

        switch(4){
            case 0:
            case 1:
                System.out.print(1);
                break;
            case 4:
                System.out.print(4);
                break;
            case 2:
                System.out.print(2);

            default:
                System.out.print(0);
                break;
        }
    }

    @Override
    public void showTest() {
       // doTestIf();
       // doTestFor();
       // doTestWhile();
       doTestSwitch();

    }


}
