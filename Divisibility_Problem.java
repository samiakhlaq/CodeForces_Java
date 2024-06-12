// Problem: 1328A - Divisibility Problem
import java.util.Scanner;
public class Divisibility_Problem
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int t = sc.nextInt();
            for (int i =0; i<t; i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println((b-a%b)%b);
            }
        }
    }
}