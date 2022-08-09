import java.util.Scanner;
class Armastrong{
    public static void main(String[] args) {
    int number, Original_number =0, Count, result=0; 
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the number to be checked");
    number = scnr.nextInt();
    Original_number = number;
    while(number != 0)
    {
            Count = number%10;
            result+= Math.pow(Count, 3);
            number/= 10;
            System.out.println(Count);
    }
    if(result == Original_number){
        System.out.println("Nymber is Armstrong");
    }
    else
    {
        System.out.println("Number is not Armstrong");
    }
    scnr.close();
    }
}