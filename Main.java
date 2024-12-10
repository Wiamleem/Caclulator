import java.util.Scanner;
import javax.swing.*;
public class Calcul {

    public static void main (String[] args){
        int operation,n1,n2;

        do {
            System.out.println("1-Add\n 2-Subtract\n 3-Multiply\n 4-Divide\n 5-Exponnontiation\n 6-Square\n 7-Factorial");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter your first number");
            n1 = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter your second number");
            n2 = sc2.nextInt();
            Scanner ch = new Scanner(System.in);
            System.out.print("choose your operation ");
            operation = ch.nextInt();

            int Result = 0;
            switch (operation) {
                case 1:
                    Result = n1 + n2;
                    System.out.println("your result is : " + Result);
                    break;
                case 2:
                    Result = n1 - n2;
                    System.out.println("your result is :" + Result);
                    break;
                case 3:
                    Result = n1 * n2;
                    System.out.println("your result is :" + Result);
                    break;
                case 4:
                    Result = n1 / n2;
                    System.out.println("your result is  :" + Result);
                    break;
                case 5:
                    int operation2;

                    System.out.println("1power to 2");

                    int result = (int) Math.pow(n1, n2);
                    System.out.println("your result is :"+ result);

                    break;
                case 6:
                    int operation3;
                    System.out.println("1square,2square\n choose ");


                case 0:
                    System.out.println("none valid ");
                    break;

                default:
                    System.out.println("entrer operation iss not valid try again");
            }
        } while (operation != 0);
    }
}
