package xw.LeetCode;

public class Leet6 {
    public static void main(String[] args) {
        String s = "0123456789";
        System.out.println(convert(s,3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            if( i == 0 || i == numRows - 1){
                for(int j = 0; 2 * j * (numRows - 1) + i < s.length(); j++ ){
                    ret.append(s.charAt(2 * j * (numRows - 1) + i));
                }
            }else {
                for(int j = 0; ((2 * j * (numRows - 1)) - i) < s.length(); j++){
                    if(((2 * j * (numRows - 1)) - i) > 0){
                        ret.append(s.charAt((2 * j * (numRows - 1)) - i));
                    }
                    if(((2 * j * (numRows - 1)) + i) < s.length()) {
                        ret.append(s.charAt((2 * j * (numRows - 1)) + i));
                    }
                }
            }
        }
        return ret.toString();
    }

}
