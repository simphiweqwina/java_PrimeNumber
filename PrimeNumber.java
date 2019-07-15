import java.util.Scanner;

class PrimeNumber{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//instatiate class
		PrimeNumber pm = new PrimeNumber();
		//prompt number
		System.out.print("Enter any Integer number");

		//print result
		pm.printResult(sc.nextInt());

	}

	public void printResult(int num){
		boolean prime = false;

		for (int i=2; i < (num/2) ; i++ ) {
			if (num%i == 0) {
				prime = true;
				System.out.print(num+" is a prime number: ");
				i = num;
			}

		}

		if (prime == false) {
			System.out.print(num+" is not a prime number");
		}


	}
}