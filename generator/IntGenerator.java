
public class IntGenerator implements Generator<Integer> {
	private int value;
	private int increment;
	
	public IntGenerator( int startValue, int increment ) {
		value = startValue;
		this.increment = increment;
	}

	public Integer next() {
	    int v = value;
	    value += increment; 
	    return v;
	}
}
