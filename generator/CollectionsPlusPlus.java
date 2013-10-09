import java.util.List;
import java.util.LinkedList;

public class CollectionsPlusPlus {

    public static <T> List<T> generate(Generator<T> generator, int n) {
        List<T> l = new LinkedList<T>();
        
        for ( int i = 0; i < n; i++ ) 
            l.add(generator.next());
            
        return l;
    }
}
