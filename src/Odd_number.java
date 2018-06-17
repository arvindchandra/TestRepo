import java.util.Scanner;

public class Odd_number {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS:");
		int n = s.nextInt();
		if(n % 2 != 0) {
			System.out.println("Weird" + n);
		}else if((n % 2 == 0) && (n >= 2 && n <= 5)) {
				System.out.println("Not weird");
			}
		
		else if((n % 2 == 0) && (n >= 6 && n <= 20)) {
				System.out.println("Weird");
			}
		
		else if((n % 2 == 0 ) && (n > 20)) {
				System.out.println("Not Wired");
			}
		}
		
		
		
		
	}

