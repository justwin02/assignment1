import java.util.Scanner;

public class helloworld{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many Hello Worlds do you want? ");
		int num = scanner.nextInt();

		while(num > 0){
			System.out.println("Hello World");
			num--;
		}
		
		scanner.close();
	}
}
		