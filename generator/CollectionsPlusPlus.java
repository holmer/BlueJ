import java.util.List;
import java.util.ArrayList;

public class CollectionsPlusPlus {

    public static <T> List<T> generate(Generator<T> generator, int n) {
        ArrayList<T> l = new ArrayList<T>(n);
        
        for ( int i = 0; i < n; i++ ) 
            l.add(generator.next());
            
        return l;
    }
}
