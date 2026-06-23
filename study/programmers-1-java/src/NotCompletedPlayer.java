import java.util.HashMap;
import java.util.Map;

public class NotCompletedPlayer {
    public String mySolution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();

        for (String p: participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        for (String c: completion) {
            if (participantMap.containsKey(c)) {
                participantMap.put(c, participantMap.get(c) - 1);
            }
        }
        for (String name: participantMap.keySet()) {
            if (participantMap.get(name) > 0) {
                answer = name;
                break;
            }
        }

        return answer;
    }

    public String refactoredSolution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();

        for (String name: participant) participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        for (String name: completion) participantMap.put(name, participantMap.get(name) - 1);

        for (String name : participantMap.keySet()) {
            if (participantMap.get(name) > 0) {
                answer = name;
                break;
            }
        }
        return answer;
    }
}
