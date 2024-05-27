// Problem : 705A - Hulk
import java.util.Scanner;
public class Hulk {
    public static void express (int n)
    {
        int i = 0;
        while(i<n)
        {
            if (i%2 == 0)
            {
                System.out.print("I hate ");
            }
            else{
                System.out.print("I love ");
            }
            if(i<n-1)
            {
                System.out.print("that ");
            }
            else{
                System.out.print("it");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            express(n);
        }
    }
}
