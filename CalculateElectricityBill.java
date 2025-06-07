import java.util.Scanner;
public class CalculateElectricityBill{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the power used in terms of units");
        int n=snr.nextInt();
        int sum=0;
        if(n>=0&&n<=100){
            sum=n*5;
	    System.out.println("The total bill is :");
            System.out.println(sum);
        }
        if(n>=101&&n<=200){
            sum=n*10-500;
            System.out.println("The total bill is :");
            System.out.println(sum);
        }
        if(n>=201&&n<=300){
            sum=n*15-1500;
	    System.out.println("The total bill is :");
            System.out.println(sum);
        }
    }
}