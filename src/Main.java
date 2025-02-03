import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<String> items = Arrays.asList("Java", "Python", "C++", "JavaScript");
        List<Character> charts = new ArrayList<>();
        for (String item : items) {
            for (char ch : item.toCharArray()) {
                charts.add(ch);
            }
        }


        int num = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : charts) {

            num = num + map.getOrDefault(ch, 0);
            map.put(ch, num);
            num = 1;
        }
        System.out.println(map);

    }
}