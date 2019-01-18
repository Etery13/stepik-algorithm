package greedyAlgorithms.Intro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CoverSectionsWithPoints {

    static ArrayList<BigInteger> numberOfPointsInSections(BigInteger[][] sections) {
        ArrayList<BigInteger> points = new ArrayList<>();
        return points;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[][] sections = new BigInteger[n][2];
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                BigInteger start = scanner.nextBigInteger();
                BigInteger finish = scanner.nextBigInteger();
                if (start.compareTo(BigInteger.ZERO) > 0 && finish.compareTo(start) > 0) {
                    sections[i][0] = start;
                    sections[i][1] = finish;
                }
            }
        }
        System.out.println("Отрезки после ввода: ");
        Arrays.asList(sections).forEach(System.out::println);
        Arrays.sort(sections, (o1, o2) -> {
            BigInteger finishO1 = o1[1];
            BigInteger finishO2 = o2[1];
            return finishO1.compareTo(finishO2);
        });
        System.out.println("Отрезки после сортировки: ");
        Arrays.asList(sections).forEach(System.out::println);
        ArrayList<BigInteger> points = numberOfPointsInSections(sections);
        System.out.println(points.size());
        System.out.println(points);
    }
}
