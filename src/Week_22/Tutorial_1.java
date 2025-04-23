package Week_22;
import java.util.Scanner;
public class Tutorial_1 {
    public void calculateMarks(){
        Scanner sc = new Scanner(System.in);
        int totalMarks=0;
        try{
            for (int i = 1; i <= 5; i++) {
                int number = sc.nextInt();
                if (number < 0) {
                    System.out.println("Negative number found. Exiting the loop.");
                    return;
                }
                totalMarks+=number;
            }
        }catch (Exception e){
            System.out.println("Invalid input. Please enter a valid number.");
        }finally {
            sc.close();
        }
        System.out.println("Sum of marks: " + totalMarks);
        int percentage = totalMarks/500*100;
        System.out.println("Percentage: " + percentage + "%");

    }
    public void storeNumArray(){
        int [] numArray = new int[5];
        Scanner sc = new Scanner(System.in);
         try {
            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = sc.nextInt();
            }
            System.out.println("Stored numbers are: ");
            for (int i : numArray) {
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
         try{
             int searchNumber = sc.nextInt();
             System.out.println(numArray[searchNumber]);
         }catch (Exception e){
             System.out.println("Invalid input. Please enter a valid number.");
         }finally {
             sc.close();
         }
    }
        public static void main(String[] args) {
        Tutorial_1 obj = new Tutorial_1();
        obj.calculateMarks();
        obj.storeNumArray();
    }
}