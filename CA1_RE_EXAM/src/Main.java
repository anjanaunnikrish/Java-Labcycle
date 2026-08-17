import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String visitor_name,visit_date,employee_name;
        int number;

        System.out.print("Enter the visitor name: ");
        visitor_name = input.nextLine();

        System.out.print("Enter the visit date: ");
        visit_date = input.nextLine();

        System.out.print("Host employee name: ");
        employee_name = input.nextLine();

        System.out.print("Enter the pass number: " );
        number = input.nextInt();

        System.out.println();
        System.out.println("Visitors Pass");
        System.out.println("Visitor Name: " + visitor_name);
        System.out.println("Visitor Date: " + visit_date);
        System.out.println("Employeee Name: " + employee_name);
        System.out.println("Pass Number: " + number);






    }
}