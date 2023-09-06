import java.util.Scanner;
public class Stack {

    int stack[] =new int[3];
    int top =-1;

    boolean isEmpty(){

        return top==-1;
    }

    void push(int data){

        if(top==stack.length-1){

          System.out.println("stack is overflow");
        }
        else{
            stack[++top]=data;
        }

        
    }

    void pop(){

        if(isEmpty()){
            System.out.println("Stack is underflow ");
        }
        else{
             stack[top--]=0;
        }

       

    }

    int  peek(){
        if(!isEmpty()){
            return stack[top];
        }
        else{
           
            return  -1;
        }

        

    }

    void printStack(){
        if(!isEmpty()){
    
        for(int i=0;i<top;i++){
            System.out.print(stack[i]+" ");  }
       System.out.println();
            
        }

        System.out.println("stack is empty");
      

    
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        Stack stack =new Stack();
       

        while(true){

            System.out.println("1)push\n2)pop\n3)peek\n4)print stack");
            int choice=sc.nextInt();

            switch(choice){
                case 1:System.out.println("enter element to be push into stack");
                stack.push((sc.nextInt()));
                break;

                case 2:stack.pop();
                break;

                case 3: System.out.println("peek :"+stack.peek());
                break;

                case 4:stack.printStack();

                default :
                    System.out.println("invalid choice");
                    break;


            }

        }
        









    }



    
}
