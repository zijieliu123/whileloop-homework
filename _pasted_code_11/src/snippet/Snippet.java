package snippet;

import java.util.Scanner;
public class Snippet {
	private Scanner in = new Scanner(System.in);

	public void getnum() {
		System.out.println("set a minimum number");
		int num1 = in.nextInt();
		System.out.println("set a max number");
		int num2 = in.nextInt();
		//definit infinit
		while (num1 < num2) {
			num1 ++;
			System.out.println(num1++);
		}
		
		
	}
	
	public void doubles() {
		System.out.println("choose first double");
		double base = in.nextDouble();
		System.out.println("choose second double");
		double coefficient = in.nextDouble();
		
		double expo = Math.pow(base, coefficient);
		double maxpo = Math.pow(base, coefficient + 5);
		// definit infinit
		while (expo <= maxpo) {
			expo = Math.pow(base, coefficient + 1);
			System.out.println(expo);
		}
		
	}
	
	public void perfectsquare() {
		int thesquared = in.nextInt();
		double addup = 0;
		// definit finit
		while (addup * addup != thesquared) {
			addup ++;
		}
		if ((addup * 10) % 10 == 0) {
			System.out.println(addup);
		
		}
		else {
			System.out.println("no square root");
		}

	}
}


