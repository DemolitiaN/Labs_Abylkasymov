import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер масссива - ");
        Scanner per = new Scanner(System.in);
        int i = per.nextInt();
        System.out.println(i);
        System.out.println("Введите" + i + "переменных - ");
        int[] mas = new int[i];
        int su = 0;
        for (int p = 0; p < i; p++) {
            mas[p] = per.nextInt();
            su = su + mas[p];
        }
        float sr = (float) su/i;
        System.out.println("Сумма чисел в массиве - " + su);
        System.out.println("Ср.Значение чисел в массиве - " + sr);
    }
}