package greedyAlgorithms.Intro;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CoverSectionsWithPoints {

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
        //System.out.println("Отрезки после ввода: " + Arrays.deepToString(sections));
        Arrays.sort(sections, (o1, o2) -> {
            int result = o1[1].compareTo(o2[1]);
            if (result != 0) {
                return result;
            } else {
                return o1[0].compareTo(o2[0]);
            }
        });
        //System.out.println("Отрезки после сортировки: " + Arrays.deepToString(sections));
        Set<BigInteger> points = new HashSet<>();
        int j = 0;
        while (j < n) {
            int k = j;
            while (k < n - 1 && sections[j][1].compareTo(sections[k + 1][0]) > 0) {
                k++;
            }
            points.add(sections[j][1]);
            j = k + 1;
        }
        System.out.println(points.size());
        System.out.println(points);
    }
}
