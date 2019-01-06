package xw.LeetCode;

public class Leet5 {
    public static void main(String[] args) {
        String s = "bb";

        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if(s == null || s.length() == 0){ return "";}
        int start = 0;
        int end = 0;
        int max = 1;
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length - 1; i++){
            int start_temp = i;
            if(chars[start_temp] == chars[start_temp + 1]){
                int end_temp = i + 1;
                while(start_temp >= 0 && end_temp < chars.length && chars[start_temp] == chars[end_temp]){
                    if(end_temp - start_temp + 1 > max){
                        start = start_temp;
                        end = end_temp;
                        max = end_temp - start_temp + 1;
                    }
                    start_temp--;
                    end_temp++;
                }
            }
            start_temp = i;
            int end_temp = i;
            while(start_temp >= 0 && end_temp < chars.length && chars[start_temp] == chars[end_temp]){
                if(end_temp - start_temp + 1 > max){
                    start = start_temp;
                    end = end_temp;
                    max = end_temp - start_temp + 1;
                }
                start_temp--;
                end_temp++;
            }
        }

        return s.substring(start,end+1);
    }


}
