import java.util.HashMap;

public class OccurrencesInString {
    public HashMap<String, Integer> occurrencesInString(String value){
        // seperate word by word
        String [] arr = value.split("\\s+");

        // store occurrences by word
        HashMap<String, Integer> map = new HashMap<>();
        for (String word: arr) {
            word = word.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}