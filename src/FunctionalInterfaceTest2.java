//Question 2

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest2 {
    public static void main(String[] args) {
//predicate
        Predicate<Integer> isNumberOdd = (n) -> (n%2 != 0) ? true : false;
        System.out.println("is number is odd "+isNumberOdd.test(11));


        Predicate<Character> isCharacter = (c) -> (c == 'y') ? true : false;
        System.out.println("is character is y "+isCharacter.test('z'));

        //Function
        BiFunction<Integer, Integer, Integer> addingTwoInteger = (x, y) -> x+y;
        System.out.println("Adding two number is "+addingTwoInteger.apply(15,16));

        BiFunction<Integer, Integer, Integer> addingSquareOfTwoNumber =
                (x,y) -> (x*x)+(y*y);
        System.out.println("Adding square of two number "+
                addingSquareOfTwoNumber.apply(15,43));

        //Supplier
        Supplier<Integer> integerSupplier = () -> 32;
        System.out.println(integerSupplier.get());

        Supplier<Double> doubleSupplier = () -> 3.14;
        System.out.println(doubleSupplier.get());

        //Consumer
        Consumer consumer = (s) -> System.out.println(s);
        consumer.accept("kuch bhi");


    }
}
