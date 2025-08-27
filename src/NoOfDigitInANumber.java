public class NoOfDigitInANumber {
    public static int digit(int number){
        int length = 0;
        if(number < 0){
            number = number * -1;
        }
        if(number == 0){
            number = 1;
        }
        while (number > 0){
            number /= 10;
            length++;
        }

        return length;
    }
    public static void main(String[] args) {
        int n = 123456;
        int a = 1234;
        System.out.println(String.valueOf(n).length());
        System.out.println(NoOfDigitInANumber.digit(n));
        System.out.println(NoOfDigitInANumber.digit(a));
        System.out.println(NoOfDigitInANumber.digit(-818));
        System.out.println(NoOfDigitInANumber.digit(0));
        System.out.println(NoOfDigitInANumber.digit(1));
    }
}
