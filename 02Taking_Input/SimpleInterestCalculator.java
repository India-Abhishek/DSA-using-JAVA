import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt(); //amount
      int r=s.nextInt();  // percentage
      int t=s.nextInt(); //time

      int si=(a*r*t)/100; //Simple Intrest Formula

      System.out.println("Intrest="+si); //Printing Value
    }
  
}