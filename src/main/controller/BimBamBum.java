package main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BimBamBum {
    private Map<Integer, String> mapBBB = new TreeMap<>();

    public BimBamBum() {
        mapBBB.put(3, "Bim");
        mapBBB.put(5, "Bam");
        mapBBB.put(7, "Bum");
    }

    public List<String> doBimBamBumBetter(List<Integer> numberList) {
        List<String> listBBB = new ArrayList<>(numberList.size());
        for (Integer number : numberList) {
            StringBuilder stringBuilder = new StringBuilder();
            boolean dividable = false;
            for (Integer key : mapBBB.keySet()) {
                if (number % key == 0) {
//                    System.out.print(mapBBB.get(key));
                    stringBuilder.append(mapBBB.get(key));
                    dividable = true;
                }
            }
            if (!dividable) {
//                System.out.print(number);
                stringBuilder.append(number);
            }
            listBBB.add(stringBuilder.toString());
        }
        return listBBB;
    }

    public void doBimBamBumSimple(List<Integer> numberList) {
        for (Integer number : numberList) {
            boolean dividable = false;
            if (number % 3 == 0) {
                System.out.print("Bim");
                dividable = true;
            }
            if (number % 5 == 0) {
                System.out.print("Bam");
                dividable = true;
            }
            if (number % 7 == 0) {
                System.out.print("Bum");
                dividable = true;
            }
            if (!dividable) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
