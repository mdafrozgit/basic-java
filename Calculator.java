import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double ans=0;
        boolean run=true;
        System.out.println("Hi, I'm a calculator. I perform simple calculations");
        while(run){
            System.out.print("Enter the operator to perform calculations : ");
            char operator = sc.next().trim().charAt(0);
            if(operator == '+' || operator =='-' || operator =='*' || operator =='/' || operator =='%'){
                System.out.print("Enter two numbers : ");
                Double a=sc.nextDouble();
                Double b=sc.nextDouble();
                switch(operator){
                    case '+':
                        ans=a+b;
                        break;
                    case '-':
                        ans=a-b;
                        break;
                    case '*':
                        ans=a*b;
                        break;
                    case '/':
                        ans=a/b;
                        break;
                    case '%':
                        ans=a%b;
                        break;
                    default:
                        System.out.println("invalid operator");
                }
                System.out.println("your answer is : "+ans);
            }else{
                System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue : Press 'Y' to continue otherwise 'N'");
            char in=sc.next().trim().charAt(0);
            if(in=='Y' || in=='y'){
                run = true;
            }else if(in=='N' || in=='n' ) {
                System.out.println("No probs,Thank You!");
                run = false;
            }
        }
    }
}
