package com.gtrxone;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int fNum = (int) (firstNumber * 1000);
        int sNum = (int) (secondNumber * 1000);
        return fNum == sNum;
    }
}
