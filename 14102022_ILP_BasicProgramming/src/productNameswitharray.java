import java.util.Scanner;

public class productNameswitharray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String productName[]= new String[5];
		int i = 0;
		for(i=0;i<5;i++)
		{
			productName[i] = scanner.nextLine();
			
		}
		//productName[0] = scanner.nextLine();
		//productName[1] = scanner.nextLine();
		//productName[2] = scanner.nextLine();
		//productName[3] = scanner.nextLine();
		//productName[4] = scanner.nextLine();
		
		//System.out.println(productName[0]);
		//System.out.println(productName[1]);
		//System.out.println(productName[2]);	
		//System.out.println(productName[3]);
		//System.out.println(productName[4]);
		
		for(i=0;i<5;i++)
		{
			System.out.println(productName[i]);
		}

	}

}
