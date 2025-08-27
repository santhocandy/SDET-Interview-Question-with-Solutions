public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int digit = String.valueOf(number).length();
        int sum = 0;

        while (number > 0){
            int rem = number % 10;
            sum += (int) Math.pow(rem,digit);
            number /= 10;
        }

        if (temp == sum){
            System.out.println("The Number : "+ temp+" is Armstrong");
        }else {
            System.out.println("The Number is :" +temp+" not Armstrong");
        }

    }
}
