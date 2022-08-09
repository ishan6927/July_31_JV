import java.util.Scanner;

public class calci {
    public static void main(String[] args){
        int operator_f=0 , first_num=0, second_num=0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Select the operator + * - /");
        operator_f = scnr.next().charAt(0);
        System.out.println("Enter the first number");
        first_num = scnr.nextInt();
        System.out.println("Enter the first number");
        second_num = scnr.nextInt();

        switch(operator_f){
            case '+':
            sum_m(first_num, second_num);
            break;
            case '*':
            multiply_f(first_num, second_num);
            break;
            case'/':
            division_d(first_num, second_num);
            break;
            case'-':
            subtraction_s(first_num, second_num);
            break;
            default:


        }
    }
    static void sum_m(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    static void multiply_f(int a, int b){
        int result = a*b;
        System.out.println(result);
    }
    static void division_d(int a, int b){
        int result = a/b;
        System.out.println(result);
    }
    static void subtraction_s(int a , int b){
        int result = a-b;
        System.out.println(result);
    }
}

