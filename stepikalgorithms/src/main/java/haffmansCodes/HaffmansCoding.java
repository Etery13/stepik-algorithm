package haffmansCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HaffmansCoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Map<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (frequencies.containsKey(string.charAt(i))) {
                frequencies.replace(string.charAt(i), frequencies.get(string.charAt(i)) + 1);
            } else {
                frequencies.put(string.charAt(i), 1);
            }
        }
        System.out.println(frequencies);
    }
}
