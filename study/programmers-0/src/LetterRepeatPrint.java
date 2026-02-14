public class LetterRepeatPrint {
    public String mySolution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }

    // char->string + repeat
    public String solution1(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }

    // split + repeat
    public String solution2(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");
        for(int i = 0; i < my_string.length(); i++){
            sb.append(str[i].repeat(n));
        }
        return sb.toString();
    }
}
