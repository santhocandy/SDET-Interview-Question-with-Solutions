import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharInStringAndFindDuplicate {

    public static void duplicateChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();

//        for (char c : s.toCharArray()){
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }else {
//                map.put(c,1);
//            }
//        }

        for (char c : s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> map1 :  map.entrySet()){
            if(map1.getValue() > 1){
                System.out.println(map1.getKey() + " : "+ map1.getValue());
            }
        }

        System.out.println(" ");
        Set<Character> outputString = map.keySet();

        for (Character c : outputString){
            if(map.get(c) > 1){
                System.out.println(c + " : " + map.get(c));
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        CountCharInStringAndFindDuplicate.duplicateChar("santhoshkumar");

        int []count = new int[26];
        String s = "hellohibro";
        for (char c : s.toCharArray()){
            count[c - 'a']++;
        }

        for (int i = 0 ; i < 26; i++){
            if(count[i] > 1){
                System.out.println((char) (i + 'a') + " : " + count[i]);
            }
        }
    }
}
