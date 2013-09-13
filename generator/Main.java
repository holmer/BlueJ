import java.util.Collections;
import java.util.List;

/**
* Test the generator class.
* @author Uno Holmer
* @version 2013-09-13
*/
public class Main {
    public static void main(String[] arg) {
       
        List<Integer> numbers = 
            CollectionsPlusPlus.generate(
                new IntGenerator(0,1),
                10000);
          
        for ( int i = 1; i <= 1000; i++ ) {
            Collections.shuffle(numbers);
            Collections.sort(numbers);
            System.out.println("sort " + i + " finished");
        }        
    }
}
