import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        if (name.matches("[A-Za-z ]+")) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }

        sc.close();
    }
}
