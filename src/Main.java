import java.util.HashMap;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("c"));
        System.out.println(map.replace(1,"a"));

    }
}