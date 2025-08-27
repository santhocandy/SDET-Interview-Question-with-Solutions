public class SumOfDigit {
    public static void main(String[] args) {
        int a = 78943;

        int sum = 0;
        for (char ch : String.valueOf(a).toCharArray()){
            sum+= ch - '0';
        }
        System.out.println(sum);
        sum = 0;

        while (a  > 0){
            int digit = a % 10;
            sum += digit;
            a/=10;
        }
        System.out.println(sum);
    }
}
