package xw.Array;

/**
 * 压缩字符串 "aaabbccddaaa" -> "a3b2c2d2a3",如果字符串没有变短 则保持原样
 */
public class Compress {

    static String compress(String str){

        char test = str.charAt(0);
        StringBuffer result = new StringBuffer();
        int count = 1;

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == test){
                count++;
            }

            if(str.charAt(i) != test || i == str.length() - 1){
                result.append(test + String.valueOf(count));
                test = str.charAt(i);
                count = 1;
            }
        }


        if(result.toString().length() == str.length()){
            return str;
        }else {
            return result.toString();
        }

    }

    public static void main(String[] args){
        String str = "aabbccdd";
        System.out.println(compress(str));
    }
}
