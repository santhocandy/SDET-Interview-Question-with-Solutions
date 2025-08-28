
public class ReverseString {


    public static String reverse(String str){
        StringBuilder stringBuilder  = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static String reverseStr(String str){
        char[] nstr = str.toCharArray();
        int n = str.length();
        for(int i = 0 ; i < n / 2; i++){
           char temp = nstr[n - i - 1];
           nstr[n - i -1] = nstr[i];
           nstr[i] = temp;
        }

        return new String(nstr);
    }

    public static String reverseString(String str){
        char [] st = str.toCharArray();

        int left =  0, right = st.length - 1;

        while (left < right){
            char temp = st[left];
            st[left] = st[right];
            st[right] = temp;
            left++;
            right--;
        }
        return new String(st);
    }

    public static String reverseString1(String s){

        char ch;
        String nstr = "";
        for (int i = 0 ; i < s.length(); i++){
            ch = s.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }

    public static String reverseString2(String str){

        String reverse = "";
        char ch;

        for (int i = str.length() - 1; i >= 0 ; i--){
            ch  = str.charAt(i);
            reverse = reverse + ch;
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverse("santhoshkumar"));
        System.out.println(ReverseString.reverseStr("Helloworld"));
        System.out.println(ReverseString.reverseString("Thisistheend"));
        System.out.println(ReverseString.reverseString1("hsohtnas si ym"));
        System.out.println(ReverseString.reverseString2("hola coma estash!"));
    }
}
