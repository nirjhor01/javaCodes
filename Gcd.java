import java.util.Scanner;
public class Gcd {

    public static void main(String[] args) {

    	//Lets take two numbers 55 and 121 and find their GCD
        //int num1 = 55, num2 = 121, gcd = 1;
        int gcd=1;
        Scanner sc = new Scanner(System.in);
         int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
      
    }
    

}
