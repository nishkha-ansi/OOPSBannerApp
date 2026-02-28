
import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("Salary: INR " + salary);
        System.out.println("Bonus: INR " + bonus);
        System.out.println("Total Income: INR " + totalIncome);

        input.close();
    }
}