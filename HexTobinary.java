import java.util.*;


public class HexTobinary {
  public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);

        int binary [] = new int[100];
        int index=0;
        int num= sc.nextInt();
        while(num!=0){
          int remainder= num % 2;
          binary[index]=remainder;
          num/=2;
          index++;
        }
        System.out.println("BINARY NUMBER IS:");

        for(int i=index-1;i>=0; i--)
        {
          System.out.print(binary[i]);
        }
        

    }
    
}
