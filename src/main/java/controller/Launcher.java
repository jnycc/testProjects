package controller;

import controller.BimBamBum;

import java.util.*;

public class Launcher {


    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
            numberList.add(i);
        }
        BimBamBum bbb = new BimBamBum();
        List<String> bbbResult = bbb.doBimBamBumBetter(numberList);
        for (String item : bbbResult) {
            System.out.println(item);
        }
//        bbb.doBimBamBumSimple(numberList);

    }


}
