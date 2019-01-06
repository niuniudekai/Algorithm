package xw.Array;

/**
 * 题目：不使用额外的数据结构，确定字符串中所有的字符是否全都不同
 */
public class IsAllDifferent {

    static boolean isAllDifferent(String str){

        if(str.length() > 256){
            return false;
        }

        boolean[] char_set = new boolean[256];

        for(char a: str.toCharArray()){
            int test = a;
            if(char_set[test]){
                return false;
            }
            char_set[test] = true;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "acde123456";
        System.out.println("str中所有的字符是全不同的吗  " + isAllDifferent(str));

    }
}
