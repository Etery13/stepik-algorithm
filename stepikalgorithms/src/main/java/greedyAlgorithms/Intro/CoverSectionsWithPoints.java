package greedyAlgorithms.Intro;

import java.math.BigInteger;
import java.util.*;

public class CoverSectionsWithPoints {

    static ArrayList<BigInteger> numberOfPointsInSections(BigInteger[][] sections) {
        ArrayList<BigInteger> points = new ArrayList<BigInteger>();
        return points;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[][] sections;
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                BigInteger start = scanner.nextBigInteger();
                BigInteger finish = scanner.nextBigInteger();
                if (start.compareTo(BigInteger.ZERO) > 0 && finish.compareTo(start) > 0) {
                }
            }
        }
        ArrayList<BigInteger> points = numberOfPointsInSections(sections);
        System.out.println(points.size());
        System.out.println(points);
    }
}
