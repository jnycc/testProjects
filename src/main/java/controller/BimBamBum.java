package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lombok.val;

public class BimBamBum {
    private Map<Integer, String> mapBBB = new TreeMap<>(Map.of(
            3, "Bim",
            5, "Bam",
            7, "Bum"));

    public BimBamBum() {
    }

    public List<String> doBimBamBumBetter(List<Integer> numberList) {
        val listBBB = new ArrayList<String>(numberList.size());
        for (val number : numberList) {
            val stringBuilder = new StringBuilder();
            boolean divisible = false;
            for (val key : mapBBB.keySet()) {
                if (number % key == 0) {
//                    System.out.print(mapBBB.get(key));
                    stringBuilder.append(mapBBB.get(key));
                    divisible = true;
                }
            }
            if (!divisible) {
//                System.out.print(number);
                stringBuilder.append(number);
            }
            listBBB.add(stringBuilder.toString());
        }
        return listBBB;
    }

    public List<String> doBimBamBumBetterWithoutLombok(List<Integer> numberList) {
        final List<String> listBBB = new ArrayList<>(numberList.size());
        for (final Integer number : numberList) {
            final StringBuilder stringBuilder = new StringBuilder();
            boolean divisible = false;
            for (final Integer key : mapBBB.keySet()) {
                if (number % key == 0) {
//                    System.out.print(mapBBB.get(key));
                    stringBuilder.append(mapBBB.get(key));
                    divisible = true;
                }
            }
            if (!divisible) {
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
