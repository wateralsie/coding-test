public class Main {
    public static void main(String[] args) {
        NotCompletedPlayer ncp = new NotCompletedPlayer();
        
        // TODO: 파일로 입력받도록
        String[] participants = {"leo", "kiki", "eden"};
        String[] completions = {"eden", "kiki"};

        String answer = ncp.mySolution(participants, completions);
        System.out.println(answer);
    }
}