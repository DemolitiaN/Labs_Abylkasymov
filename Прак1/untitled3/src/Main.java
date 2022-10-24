import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] numbers = input.nextLine().split(" ");

        int sum = 0;

        int i = 0;


        do {

            sum += Integer.parseInt(numbers[i]);

            i++;

        } while (numbers.length != i);


        System.out.println("The sum of the numbers: " + sum);
        }
    }