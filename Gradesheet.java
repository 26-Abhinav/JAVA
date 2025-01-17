import java.util.Scanner;
public class Gradesheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.println("Enter Subject 1 Name: ");
        String subject1 = scanner.nextLine();

        System.out.println("Enter Subject 1 Grade: ");
        String grade1 = scanner.nextLine();

        System.out.println("Enter Subject 2 Name: ");
        String subject2 = scanner.nextLine();

        System.out.println("Enter Subject 2 Grade: ");
        String grade2 = scanner.nextLine();

        System.out.println("Enter Subject 3 Name: ");
        String subject3 = scanner.nextLine();

        System.out.println("Enter Subject 3 Grade: ");
        String grade3 = scanner.nextLine();

        // Display grade sheet
        System.out.println("\n================= GRADE SHEET =================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentID);
        System.out.println("------------------------------------------------");
        System.out.println("Subject               | Grade");
        System.out.println("----------------------|------");
        System.out.printf("%-22s | %-4s%n", subject1, grade1);
        System.out.printf("%-22s | %-4s%n", subject2, grade2);
        System.out.printf("%-22s | %-4s%n", subject3, grade3);
        System.out.println("================================================");
    }
}
