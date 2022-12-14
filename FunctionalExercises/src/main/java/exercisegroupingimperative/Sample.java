package exercisegroupingimperative;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Sample {
    // name1->score1, name2->score2, name3->score1
    // Then:
    // score1 includes: name1 and name
    // and score2 includes: name2
    public static Map<Integer, List<String>> groupByScores(
            Map<String, Integer> scores ) {
        Map<Integer, List<String>> byScores = new HashMap<>();
        for(String name: scores.keySet()) {
            int score = scores.get(name);

            List<String> names = new ArrayList<>();
            if(byScores.containsKey(score))
                names = byScores.get(score);
            names.add(name);
            byScores.put(score, names);
        }
        return byScores;
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Jack", 12);
        scores.put("Jill", 15);
        scores.put("Tom", 11);
        scores.put("Darla", 15);
        scores.put("Nick", 15);
        scores.put("Nancy", 11);

        System.out.println(groupByScores(scores));

    }
}
