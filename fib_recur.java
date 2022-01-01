import java.util.Scanner;
 public class fib_recur {
     public static int Fib(int n)
     {
       if(n==1||n==2)
         {
             return 1;
         }
         
         //System.out.print(Fibbonacci(n-1)+" "+Fibbonacci(n-2));
        return Fib(n-1)+Fib(n-2);
        
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
             System.out.print(", "+Fib(i));
        }
      
       
    }
    
}
