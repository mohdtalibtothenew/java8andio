//Question 6
// Find the first even number in the integer list which is greater than 3.
import java.util.Arrays;
import java.util.List;
public class FirstEven
{
    public static void main(String[] args)
    {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Entered list is "+numbers1);
        System.out.println("First number greater than 3 and is even :"+numbers1.stream().filter(i->i>3).filter(e->e%2==0).findFirst());
    }
}



