package com.foxtrot.retail.variables;

public class TestAdditionalVar implements Showable{
    @Override
    public void showTest() {
        int i = 10;
        System.out.println(i++);
        System.out.println(i);
        i = 10;
        System.out.println(++i);
        System.out.println(i);
    }
}
