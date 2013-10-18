public class PrimeGenerator implements Generator<Integer> {
	private int currentPrime = 1;

	public Integer next() {
	    return currentPrime;
	}
	
	private boolean isPrime(int n) {
	    for ( int f = 2; f < (int)Math.sqrt(n); f += 2)
	        if ( n % f == 0 )
	            return false;
	    return true;
    }
}
