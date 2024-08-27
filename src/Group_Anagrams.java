import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());

            }
            map.get(key).add(str);

        }
    System.out.println(new ArrayList<>(map.values()));
    }
}
