import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num 1");
        int a = in.nextInt();
        System.out.println("enter num 2");
        int b = in.nextInt();
        System.out.println("Sum = " + a + b);
    }
}
