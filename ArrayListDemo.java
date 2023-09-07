import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<String> Fname=new ArrayList<String>();
        ArrayList<String> Lname=new ArrayList<String>();
         ArrayList<String> fullname=new ArrayList<String>();


           Fname.add(sc.nextLine());
           Lname.add(sc.nextLine());
           
           fullname.addAll(Fname);
           fullname.addAll(Lname);
           System.out.println(fullname);




        
    }
}
