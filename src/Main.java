import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[]integers= new Integer[]{1,2,3,4,5,6,7,8,9};
        System.out.println(  Stream.of(integers).filter(a -> a % 2 == 0).map(a -> a * a).max(Comparator.comparing(Integer::intValue)));
    }
}