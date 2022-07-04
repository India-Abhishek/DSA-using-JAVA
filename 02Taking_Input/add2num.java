import java.util.Scanner; //Importing inbuild Scanner
public class add2num {
    public static void main(String args[]) {
    
        Scanner scan= new Scanner(System.in); //Creating a Scanner which is taking input from system

        int i=scan.nextInt(); // using funcilty of scanner... taking input is as Integer!
        int j=scan.nextInt();

        int sum=i+j; //adding 

        System.out.println("Addition= "+sum);
        
    }
    
}
