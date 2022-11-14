package lab1Task7;
import java.util.Scanner;
public class lab1 {
        static int calculateFactorial(int n){
            int result = 1;
            for (int i = 1; i <=n; i ++){
                result = result*i;
            }
            return result;
        }

        public static void main(String[] args){
            System.out.println(calculateFactorial(5));
        }
}
