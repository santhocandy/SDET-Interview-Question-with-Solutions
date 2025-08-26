import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {

    public static int reverse1(int number){
        int rev = 0,rem;

        while (number > 0){
            rem = number % 10;
            rev = rev * 10 + rem;
            number /=10;
        }
        return rev;
    }

    public static int reverse2(int number){
        StringBuilder str = new StringBuilder(String.valueOf(number)).reverse();
        return Integer.parseInt(str.toString());
    }

    public static int reverse3(int number){
        char []c = String.valueOf(number).toCharArray();
        int len = c.length;
        for (int i = 0 ; i < len/2; i++){
            char temp = c[i];
            c[i] = c[len - i - 1];
            c[len-i-1] = temp;
        }

        return Integer.parseInt(new String(c));
    }

    public static int reverse4(int n, int rev){
        if (n == 0){
            return rev;
        }
        return reverse4(n / 10 , n % 10 + rev * 10 );
    }

    public static int reverse5(int number){
        int reverse = 0;
        Stack<Integer> rev = new Stack<>();
        while (number > 0){
            rev.push(number % 10);
            number /= 10;
        }

        while (!rev.isEmpty()){
            reverse = reverse * 10 + rev.pop();
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 123456;

        int n = String.valueOf(number).length();

        System.out.println(ReverseNumber.reverse1(number));

        System.out.println(ReverseNumber.reverse2(number));

        System.out.println(ReverseNumber.reverse3(number));

        System.out.println(ReverseNumber.reverse4(number,0));

        System.out.println(ReverseNumber.reverse5(number));
    }
}
