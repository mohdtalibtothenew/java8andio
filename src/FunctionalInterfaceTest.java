//1) Write the following a functional interface and implement it using lambda:

interface FunctionalInterface{
    boolean math(int a,int b);
}
interface Incremented{
    int returnIncremented(int a);
}
interface Concatenate{
    String concatenateString(String a, String b);
}
interface Uppercase{
    String toUpperCase(String a);
}
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = (a,b)-> {
            return a>b ? true:false;

        };
        Incremented incremented = a -> a++;
        Concatenate concatenate = (a, b)->a + b;
        Uppercase uppercase = a-> a.toUpperCase();
        System.out.println("Return greater : "+functionalInterface.math(3,2));
        System.out.println();
        System.out.println("Return Incremented : "+incremented.returnIncremented(3));
        System.out.println();
        System.out.println("Concatenated string : "+concatenate.concatenateString("Mohd"," Talib"));
        System.out.println();
        System.out.println("Upper case string : "+uppercase.toUpperCase("sjgf"));
    }
}
