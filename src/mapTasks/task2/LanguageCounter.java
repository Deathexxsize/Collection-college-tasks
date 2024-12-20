package mapTasks.task2;

import java.util.HashMap;
import java.util.Map;

public class LanguageCounter {
    public static Map<String, Integer> langCounter (String[] languages ) {

        Map<String, Integer> sortLang = new HashMap<>();

        for (String language : languages) {
            if (sortLang.containsKey(language)) {
                int currentCount = sortLang.get(language);
                sortLang.put(language, currentCount + 1);
            } else {
                sortLang.put(language, 1);
            }
        }
        return sortLang;
    }
}
