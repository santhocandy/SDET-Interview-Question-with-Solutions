public class ReverseAWordInString {

    public static String reverseWord(String s){

        String []st = s.split(" ");
        String reverseString  = "";
        for (int i = 0; i < st.length; i++){
            String word = st[i];
            char ch;
            String nstr = "";
            for (int j = 0 ; j < word.length(); j++){
                ch = word.charAt(j);
                nstr = ch + nstr;
            }
            reverseString = reverseString + nstr + " ";
        }
        return reverseString;
    }

    public static void main(String[] args) {
       String output =  ReverseAWordInString.reverseWord("hello sir how are you");
        System.out.println(output);
    }
}
