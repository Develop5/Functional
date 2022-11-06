package exercisegroupingfunctional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

// https://www.youtube.com/watch?v=TG67kq7WUEo

public class Sample {
    // we will put a name into a bucket with the score for that name as label
    // Stream's collect has a way to group based on buckets
    public static Map<Integer, List<String>> groupByScores(
            Map<String, Integer> scores ) {
        return scores.keySet()
                .stream()
                .collect(groupingBy(scores::get));
                // we provide the label for the bucket
        // reduce
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
