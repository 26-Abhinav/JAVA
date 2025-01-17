import java.util.Scanner;
public class nameandaddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String Name = scanner.nextLine();

        System.out.print("Enter your Address:");
        String Address = scanner.nextLine();

        System.out.println("Your name is:"+ Name);
        System.out.println("Your address is:"+ Address);
    }
}