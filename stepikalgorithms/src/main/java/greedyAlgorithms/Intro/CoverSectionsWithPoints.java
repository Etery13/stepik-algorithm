package greedyAlgorithms.Intro;

import java.math.BigInteger;
import java.util.*;

public class CoverSectionsWithPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[][] sections = new BigInteger[n][2];
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                BigInteger start = scanner.nextBigInteger();
                BigInteger finish = scanner.nextBigInteger();
                sections[i][0] = start;
                sections[i][1] = finish;
            }
        }
        //System.out.println("Отрезки после ввода: " + Arrays.deepToString(sections));
        Arrays.sort(sections, (o1, o2) -> {
            BigInteger entry1 = o1[1];
            BigInteger entry2 = o2[1];
            int result;
            if (entry1 == null && entry2 == null) {
                return 0;
            }
            if (entry1 == null) {
                return 1;
            }
            if (entry2 == null) {
                return -1;
            }
            result = o1[1].compareTo(o2[1]);
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
            while (k < n - 1 && sections[j][1] != null && sections[k + 1][0] != null && sections[j][1].compareTo(sections[k + 1][0]) >= 0) {
                k++;
            }
            points.add(sections[j][1]);
            j = k + 1;
        }
        points.removeIf(Objects::isNull);
        System.out.println(points.size());
        points.forEach(e -> {
            if (e != null) {
                System.out.println(e);
            }
        });
    }
}
