package variables;

public class PrimeNumbers {

	

	public static void main(String[] args) {
		int number = 10;
		int startNumber = 10;
		int endNumber = 50;
		isPrime(number);
	//	allPrime(number);
	//	betweenPrime(startNumber, endNumber);
	}

	public static void isPrime(int number) {
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(number + " is not a prime numner");
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println(number + " is a prime number");
		}
	}

	public static void allPrime(int number) {
		for (int i = 2; i <=  number; i++) {
			boolean newprime = true;
			for (int j = 2; j <= i/2; j++) {
				if (i%j==0) {
					newprime =false;
					break;
				}
			}
			if (newprime) {
				System.out.print(i +" ");
			}
		}
	}

	public static void betweenPrime(int startNumber, int endNumber) {
		for (int i = startNumber; i <= endNumber; i++) {
			boolean newPrime=true;
			for (int j = 2; j < i/2; j++) {
				if (i%j==0) {
					newPrime = false;
					break;
				}
			}
			if (newPrime) {
				System.out.print(i +" ");
			}
		}
		
	}
}
