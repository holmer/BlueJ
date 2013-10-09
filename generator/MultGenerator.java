public class MultGenerator implements Generator<Integer> {
	private int currentValue;
	private int increment;
	
	public MultGenerator( int startValue, int increment ) {
		currentValue = startValue;
		this.increment = increment;
	}

	public Integer next() {
	    int v = currentValue;
	    increment--;
	    currentValue += increment; 
	    return v;
	}
}