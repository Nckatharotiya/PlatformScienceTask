package com.test.platformsciencetask;

import java.util.ArrayList;
import java.util.List;

public class DriverJobAssignmentUtil {

    public static int[][] getDriverShipmentMatrix(MainModel mainModel) {
        double[][] scoreMatrix = new double[mainModel.getDriversList().size()][mainModel.getShipmentsList().size()];
        for (int i = 0; i < mainModel.getDriversList().size(); i++) {
            String driver = mainModel.getDriversList().get(i);
            for (int j = 0; j < mainModel.getShipmentsList().size(); j++) {
                String address = mainModel.getShipmentsList().get(j);
                String trimDriverName = trimSpace(driver);
                double score = address.length() % 2 == 0 ? getNumberOfVowels(trimDriverName) * 1.5 : getNumberOfConsonants(trimDriverName);
                double newScore = getLengthWithCommonFactors(trimDriverName, address) ? score * 1.5 : score;
                scoreMatrix[i][j] = 100 - newScore;
            }
        }

        HungarianAlgorithm ha = new HungarianAlgorithm(scoreMatrix);
        return ha.findOptimalAssignment();
    }

    private static int getNumberOfVowels(String driver) {
        int sum = 0;
        driver = driver.toLowerCase();
        for (int i = 0; i < driver.length(); i++) {
            char ch = driver.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                sum++;
        }
        return sum;
    }

    private static int getNumberOfConsonants(String driver) {
        return driver.length() - getNumberOfVowels(driver);
    }

    private static boolean getLengthWithCommonFactors(String trimName, String address) {
        String trimAddress = trimSpace(address);

        List<Integer> nameFactor = getFactorsBesides1(trimName);
        List<Integer> addressFactor = getFactorsBesides1(trimAddress);

        for (int addressBesFactor : addressFactor) {
            for (int nameBesFactor : nameFactor) {
                if (addressBesFactor == nameBesFactor)
                    return true;
            }
        }
        return false;
    }

    private static String trimSpace(String string) {
        return string.replaceAll("\\s+", "");
    }

    private static List<Integer> getFactorsBesides1(String string) {
        List<Integer> besidesFactorList = new ArrayList<>();
        for (int i = 2; i < string.length(); i++) {
            if (string.length() % i == 0)
                besidesFactorList.add(string.length() % i);
        }
        return besidesFactorList;
    }
}
