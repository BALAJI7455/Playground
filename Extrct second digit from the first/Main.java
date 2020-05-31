import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number,second_digit;
      number = in.nextInt();
      second_digit = number;
      while(second_digit >=100)
      {
        second_digit = second_digit/10;
      }
      second_digit = second_digit%10;
      System.out.println(second_digit);
	}
}