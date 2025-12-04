import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class Funcy {

    
    public static void main(String[] args) {
        List<Integer>integerList= Arrays.asList(1,2,3,4,8,8,8,8);
        integerList.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);

    }
}
