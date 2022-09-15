package test.controller;

import main.controller.BimBamBum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BimBamBumTest {

    private static List<Integer> numberList = new ArrayList<>();
    private static BimBamBum bbb;
    private static List<String> bbbResult;

    @BeforeAll
    static void setUp() {
        for (int i = 1; i <= 1000; i++) {
            numberList.add(i);
        }
        bbb = new BimBamBum();
        bbbResult = bbb.doBimBamBumBetter(numberList);
    }

    @Test
    void bbbTest1() {
        String expected = "1";
        String actual = bbbResult.get(1-1);
        System.out.println("Result for 1: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void bbbTest3() {
        String expected = "Bim";
        String actual = bbbResult.get(3-1);
        System.out.println("Result for 3: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void bbbTest5() {
        String expected = "Bam";
        String actual = bbbResult.get(5-1);
        System.out.println("Result for 5: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void bbbTest7() {
        String expected = "Bum";
        String actual = bbbResult.get(7-1);
        System.out.println("Result for 7: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void bbbTest15() {
        String expected = "BimBam";
        String actual = bbbResult.get(15-1);
        System.out.println("Result for 15: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void bbbTest210() {
        String expected = "BimBamBum";
        String actual = bbbResult.get(210-1);
        System.out.println("Result for 210: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void bbbTest1000() {
        String expected = "Bam";
        String actual = bbbResult.get(1000-1);
        System.out.println("Result for 1000: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        int expected = 1000;
        int actual = bbbResult.size();
        System.out.println("List size: "+ bbbResult.size());
        assertEquals(expected, actual);
    }
}