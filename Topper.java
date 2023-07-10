package Topper;
import java.util.Scanner;

public class Topper {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a=0;
         int b=0;
         while(n>0){
             int digit=n%10;
             if(digit%2!=0){
                 a=a+digit;
             }
             else{
                 b=digit;
             }
             n=n/10;
         }
         if((a-b)==0){
             System.out.println("true");
         }
         else{
             System.out.println("False");
         }

	}

}
