import java.util.Scanner;
public class MarksProcessor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        try {
            for (int i=0;i< 5;i++){
                System.out.println("Enter the mark" + (i+1)+ ":" );
                marks[i] = input.nextInt();
            }
            System.out.println("First mark: "+marks[0]);
            int subjectCount = 5;
            int sum = 0;
            for (int mark: marks){
                sum+=mark;
            }
            System.out.println("Sum: "+sum);
            double average = (double) sum / 5;
            System.out.println("Average: "+average);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("error");
        }finally {
            System.out.println("prcessing");
        }
    }
}