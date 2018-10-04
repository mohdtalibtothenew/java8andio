//Question 4
import java.util.Arrays;
import java.util.List;

public class NumbersSum {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 3, 5, 4);
        System.out.println(integerList.stream().filter(e-> e>5).reduce(0, (a,b)-> a+b));
    }
}
