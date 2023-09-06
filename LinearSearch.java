import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();

        int [] arr=new int[size];



        for(int i=0;i <size ;i++){
            System.out.println("Enter Element of array");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter Element to be search");
        int element=sc.nextInt();
       boolean flag=false;
       
        for(int j=0;j <size ;j++){
            if(arr[j]==element){
               
                System.out.println("Element present at index :"+j);
                flag=true;
            break; 
        
    }
                
         }

         if(!flag){
            System.out.println(element+"Element not Present in Array");
         }
            
        



    
        
    }
}
