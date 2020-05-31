import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number,remainder,sum = 0;
      number = in.nextInt();
      
      while(number >0)
      {
        remainder = number%10;
        sum = sum+remainder;
        number = number/10;
      }
      System.out.println(sum);
	}
}