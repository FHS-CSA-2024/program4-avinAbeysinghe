//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4{
    public static void main(String[] args){
        int num1, num2, num3, num4, sum;
        Scanner enter = new Scanner(System.in);
        
        System.out.println("Enter a 3 digit num: ");
        num1 = enter.nextInt();
        System.out.println("Enter another 3 digit num: ");
        num2 = enter.nextInt();
        System.out.println("Enter another 3 digit num: ");
        num3 = enter.nextInt();
        System.out.println("Enter your last 3 digit num: ");
        num4 = enter.nextInt();
        
        sum = num1 + num2 + num3 + num4;
        double avg = (double) sum / 4;
        System.out.println("The sum of the 4 nums is: " + sum);
        System.out.println("The average of the 4 nums is: " + avg);
    }
}
//Paste console output below:
/*
Enter a 3 digit num: 
475
Enter another 3 digit num: 
821
Enter another 3 digit num: 
369
Enter your last 3 digit num: 
562
The sum of the 4 nums is: 2227
The average of the 4 nums is: 556.75


*/
