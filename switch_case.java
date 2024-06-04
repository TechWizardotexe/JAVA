import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("king");
                break;
            case "apple":
                System.out.println("red");
                break;
            default:
                System.out.println("invalid");
        }
    }

}
