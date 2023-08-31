import java.util.*;
//2. write a java program to convert Dollar into Rupees
public class DolarToRupees {
    public static void main(String[] args) {
        
    
    double dolar;
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter Dolar ");
    dolar=sc.nextDouble();

    double Rupees = dolar * 82.65 ;

    System.out.println("Converted into Indian Ruppes :"+Rupees);

    }
    
}
