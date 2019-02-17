package greedyAlgorithms.Intro;

import java.util.HashSet;
import java.util.Scanner;

public class DifferentSummands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet summands = new HashSet();
        int i = 0;
        while (true) {
            i++;
            if (i * 2 < n) {
                summands.add(i);
                n = n - i;
            } else {
                summands.add(n);
                break;
            }
        }
        System.out.println(summands.size());
        summands.forEach(System.out::println);
    }

}