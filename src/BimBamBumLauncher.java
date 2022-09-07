import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BimBamBumLauncher {
    private static Map<Integer, String> mapBBB = new TreeMap<>();


    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
            numberList.add(i);
        }
        mapBBB.put(3, "Bim");
        mapBBB.put(5, "Bam");
        mapBBB.put(7, "Bum");
//        doBimBamBumSimple(numberList);
        doBimBamBumBetter(numberList);
    }

    private static void doBimBamBumBetter(List<Integer> numberList) {
        for (Integer number : numberList) {
            boolean dividable = false;
            for (Integer key : mapBBB.keySet()) {
                if (number % key == 0) {
                    System.out.print(mapBBB.get(key));
                    dividable = true;
                }
            }
            if (!dividable) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    private static void doBimBamBumSimple(List<Integer> numberList) {
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
