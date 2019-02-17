package greedyAlgorithms.Intro;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class PerpetualPortfolio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Количество предметов
        int n = scanner.nextInt();
        //Объём рюкзака
        int w = scanner.nextInt();
        int[][] objects = new int[n][2];
        if (n >= 1) {
            for (int i = 0; i < n; i++) {
                // стоимость
                int c = scanner.nextInt();
                //объём предмета
                int wO = scanner.nextInt();
                objects[i][0] = c;
                objects[i][1] = wO;
            }
        }
        Arrays.sort(objects, (o1, o2) -> {
            BigDecimal value1 = BigDecimal.valueOf((double) o1[0] / o1[1]);
            BigDecimal value2 = BigDecimal.valueOf((double) o2[0] / o2[1]);
            return value2.compareTo(value1);
        });
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (w > objects[i][1]) {                //Если помещается — берем
                sum += objects[i][0];
                w -= objects[i][1];
            } else {
                sum += (double) w / objects[i][1] * objects[i][0];    //Иначе берем сколько можно и выходим
                break;
            }
        }
        System.out.println(String.format("%.3f", sum));

    }
}
