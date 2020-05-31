import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
       int sum = addNumbers(n);
        System.out.println(sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
      
    
}