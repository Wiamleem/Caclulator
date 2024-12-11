import java.util.Scanner;

public class Main {
   static double Result;
    public static void addition(double n1,double n2){
          Result = n1 + n2;
        System.out.println("your result is : " + Result);
    }
    public static void subtract(double n1,double n2){
          Result = n1 - n2;
        System.out.println("your result is :" + Result);
    }
    public static void multiply(double n1,double n2){
        Result = n1 * n2;
        System.out.println("your result is :" + Result);
    }
    public static void divide(double n1,double n2){
        if(n2==0 ){
            System.out.println("DIVIDE BY 0");
        return;
        }
        double Result = n1 / n2;
        System.out.println("your result is  :" + Result);

    }
    public static void power(double n1,double n2){
        int operation2;

        System.out.println("1power to 2");

        double result = (double) Math.pow(n1, n2);
        System.out.println("your result is :"+ result);
    }
    public static void square_root (double n1,double n2) {
        if (n1 <= 0) {
            System.out.println("Error 404 ");

        } else {
            double sqrtResult1 = Math.sqrt(n1);
            double sqrtResult2 = Math.sqrt(n2);

            System.out.println("first number your result is" + sqrtResult1);
            System.out.println("second number your result is " + sqrtResult2);
        }
    }
        static void factorial(double n1,double n2){
            if(n1 <= 0) {
                System.out.println("Error 404");
            }else{
                long factorial=1,factorial2=1;
                for(int i=1; i<=n1;i++){
                    factorial *=i;
                }
                for(int i=1; i<=n2;i++) {
                    factorial2 *=i;
                }
                System.out.println("your result is : " + factorial);
                System.out.println("your result is : " + factorial2);
            }
        }



    public static void main (String[] args) {
        int operation;
        double n1,n2;

        do {
            System.out.println("1-add\n 2-subtract\n 3-multiply\n 4-divide\n 5-power\n 6-square_root\n 7-factorial\n0-exit");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter your first number");
            n1 = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter your second number");
            n2 = sc2.nextInt();
            Scanner ch = new Scanner(System.in);
            System.out.print("choose your operation ");
            operation = ch.nextInt();

            if(operation == 0) {
                System.out.println("exiting...");
                break; //exit the loop if operation is 0
            }

            int Result = 0;
            switch (operation) {
                case 1:
                    addition(n1,n2);
                    break;
                case 2:
                    subtract(n1,n2);
                    break;
                case 3:
                    multiply(n1,n2);
                    break;
                case 4:
                    divide(n1,n2);
                    break;
                case 5:
                    power(n1,n2);
                    break;
                case 6:
                    square_root(n1,n2);
                    break;
                case 7:
                    factorial(n1,n2);
                    break;
                case 0:
                    System.out.println(" try again <3 ");
                    break;

                default:
                    System.out.println("entrer operation iss not valid try again");
            }
        } while (operation != 0);
    }
}
