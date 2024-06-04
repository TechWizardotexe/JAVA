import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter Operator");
            char c = sc.next().trim().charAt(0);

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                System.out.println("Enter num 1");
                int a = sc.nextInt();
                System.out.println("Enter num 2");
                int b = sc.nextInt();

                if (c == '+') {
                    ans = a + b;
                }
                if (c == '-') {
                    ans = a - b;
                }
                if (c == '*') {
                    ans = a * b;
                }
                if (c == '/') {
                    ans = a / b;
                }
                if (c == '%') {
                    ans = a % b;
                }
            } else if (c == 'x' || c == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }

            System.out.println(ans);

        }
    }
}