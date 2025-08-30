package Input;
import java.util.Scanner;
public class inputOutput {
    public static  void main(String[] args){
         Scanner input = new Scanner(System.in);
         String hello = input.nextLine();
         int number = input.nextInt();
         float price = input.nextFloat();
         System.out.println(hello + " " + number + " " + price);
    }
}
