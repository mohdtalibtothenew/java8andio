//Question 3
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,2,3,4,3,9,8,9);
        System.out.println(list.stream().filter(e->e%2==0)
                .collect(Collectors.toList()));

    }
}
