package xw.QString;

/**
 * 判断字符串1重组后能否变成字符串2
 */
public class CheckSame {
    static boolean checkSame(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        int[] str1_char = new int[256];
        int[] str2_char = new int[256];

        for(int i = 0; i < str1.length(); i++){
            int char1 = str1.charAt(i);
            int char2 = str2.charAt(i);

            str1_char[char1]++;
            str2_char[char2]++;
        }

        for(int i = 0; i < str1_char.length; i++){
            if(str1_char[i] != str2_char[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String str1 = "2334";
        String str2 = "3322";
        System.out.println("str1可以重组为str2吗： " + checkSame(str1, str2) );
    }
}
