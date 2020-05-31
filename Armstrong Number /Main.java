import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
       int number = in.nextInt();
      int c=0 ,a,temp;
      temp = number;
      while(number>0)
      {
        a=number%10;
        number = number/10;
        c = c+(a*a*a);
      }
      if(temp==c)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
    }
}
