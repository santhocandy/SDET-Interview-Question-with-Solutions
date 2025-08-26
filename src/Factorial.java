import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Factorial {


    public static int factorialA(int number){
        if (number <=0 || number == 1){
            return 1;
        }
        int fact = 1;
        for(int i = 1 ; i <= number; i++){
            fact *= i;
        }
        return fact;
    }

    public static int factorialB(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        return  number * factorialB(number - 1);
    }

    public static Long factorialC(int number){
        long fact = 1;
        for(int i = 2 ; i <= number; i++){
            fact *= i;
        }
        return fact;
    }

    public static BigInteger factorialD(int number){
        if(number ==0 || number == 1) return BigInteger.ONE;

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static long factorialE(int number){
        long fact = LongStream.rangeClosed(1,number)
                .reduce(1,(a,b) -> a * b);
        return fact;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = 6;
        System.out.println(Factorial.factorialA(num)); // int
        System.out.println(Factorial.factorialB(num));  // recursive
        System.out.println(Factorial.factorialC(20)); // long
        System.out.println(Factorial.factorialD(50)); // BigInteger
        System.out.println(Factorial.factorialE(5)); // Java 8/Stream

        int i = 1;
        long fact = 1;
        while(true){
            if(Long.MAX_VALUE / fact <  (i + 1)) {
                break;
            }
            fact *= i;
            i++;
        }
        System.out.println(fact);
        System.out.println(i);
    }
}
