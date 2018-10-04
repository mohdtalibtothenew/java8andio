import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 3, 5, 4);
        Double averageResult = integerList.stream().collect(Collectors.averagingLong(e -> 2*e));
        System.out.println(averageResult);
    }
}
