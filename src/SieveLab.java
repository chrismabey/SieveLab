import java.util.Scanner;
import java.text.DecimalFormat;

public class SieveLab {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound  ===>>  ");
		final int MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		System.out.println("Primes between 1 and " + MAX);
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[]) {

		for (int k = 1; k <= primes.length - 1; k++) {
			primes[k] = true;

			for (int x = 2; x <= Math.sqrt(primes.length); x++) {
				if (k % x == 0 && x != k) {
					primes[k] = false;
				}
			}
		}

	}

	public static void displayPrimes(boolean primes[]) {
		DecimalFormat dec = new DecimalFormat("#0000");
		for (int k = 2; k <= primes.length - 1; k++) {
			if (primes[k] == true) {
				System.out.print(dec.format(k) + " ");
			}

		}
	}
}
