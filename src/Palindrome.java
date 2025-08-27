public class Palindrome {

    public static boolean palindrome_function(int num){

        if(num < 0 || (num %  10 == 0 && num !=0 )){
            return false;
        }
        int temp = num;
        int sum = 0;
        while (num > 0){
            int rem  = num % 10;
            sum = sum *  10 + rem;
            num/=10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {

        System.out.println(Palindrome.palindrome_function(12345));
        System.out.println(Palindrome.palindrome_function(321));
        System.out.println(Palindrome.palindrome_function(7337));
        System.out.println(Palindrome.palindrome_function(369));
        System.out.println(Palindrome.palindrome_function(242));
        System.out.println(Palindrome.palindrome_function(58585));
    }
}
