import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static ArrayList<Integer> fibnacci(int number){
        ArrayList<Integer> fibnum  = new ArrayList<>();

        if(number <=0) return fibnum;

        int first = 0,second = 1, next;
        fibnum.add(first);

        if (number == 1) return fibnum;

        fibnum.add(second);

        for(int i = 2 ; i < number; i++){
            next = first + second;
            first = second;
            second = next;
            fibnum.add(next);
        }

        return new ArrayList<>(fibnum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();

        int[] arr = new int[number];

        arr[0] = 0;
        arr[1] =1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i = 2; i < number; i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Fibonacci.fibnacci(number));
    }
}
