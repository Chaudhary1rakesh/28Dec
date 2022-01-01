//Write a head recursion code to print only EVEN elements in decreasing order starting from user-defined input N.
	//example: N = 76 
    // Output: 76,74,72,70,68,66......2
import java.util.Scanner;
 public class Decr_recur {
    
    public static void dec(int n){
        if(n<=1)
        {
            return ;
       }
       
       System.out.print(n+",");
       dec(n-2);
       
    }
    


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:");
    int x=sc.nextInt();
    dec(x);
   
}
 }
 
