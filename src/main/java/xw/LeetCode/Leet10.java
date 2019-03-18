package xw.LeetCode;

public class Leet10 {
    public boolean isMatch(String s, String p) {
        int index1 = 0;
        int index2 = 0;
        int indexQ = 1;
        for(;index2 < p.length(); index2++){
            if(isEqual(s,index1,p,index2)){
                index1++;
                index2++;
            }
        }
        return true;
    }
    static boolean isEqual(String s, int index1, String p, int index2){
        return (s.charAt(index1) == p.charAt(index2));
    }
    public static void main(String[] args) {


    }
}
