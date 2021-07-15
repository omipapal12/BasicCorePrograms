import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println("Enter the power no:-");
       Scanner sc = new Scanner(System.in);
       int b = sc.nextInt();
        int a = 2;
        System.out.println(Math.pow(a, b));  // return a^b
    }
}
