import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		System.out.println("Enter Number1");
		number1=scanner.nextInt();
		System.out.println("Enter Number2");
		number2=scanner.nextInt();
		System.out.println("Enter Number3");
		number3=scanner.nextInt();
		if(((number1<number2)&&(number1>number3))||(number1<number3)&&(number1>number2))
			{
			System.out.println("second smallest "+number1);
			}
		else if(((number2<number1)&&(number2>number3))||(number2<number3)&&(number2>number1))
			{
			System.out.println("second smallest "+number2);
			}
		else
			{
			System.out.println("second smallest "+number3);
			}
	}
}
