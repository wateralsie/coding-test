import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
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
}