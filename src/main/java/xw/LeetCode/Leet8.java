package xw.LeetCode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Leet8 {
    private static final Logger logger = LogManager.getLogger(Leet8.class);

    public static int myAtoi(String str) {
        if(str.length() == 0 || str == null){
            return 0;
        }
        int result = 0;
        int negative = 1; //标志正负
        int i = 0; //字符串索引
        int index = 0; //非0数字长度计数
        boolean flag = false; //标志数字从非0开始

        //丢弃无用的开头空格字符
        while (i < str.length() && str.charAt(i) == ' '){
            i++;
        }

        //第一个非空字符为特殊符号 且不为正负号
        if(i < str.length() && ((str.charAt(i) < '0' || str.charAt(i) > '9') && str.charAt(i) != '+' && str.charAt(i) != '-')){
            return 0;
        }
        //第一个非空符号为正负号
        if(i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')){

            if(str.charAt(i) == '-'){
                negative = -1;
            }
            i++;
        }
        // 正负号之后为特殊符号
        if((i < str.length() && (str.charAt(i) < '0' || str.charAt(i) > '9'))){
            return 0;
        }

        // 正负号之后为数字
        while ( i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9') ){
            //刚开始的0跳过
            if(str.charAt(i) != '0'){
                flag = true;
            }
            if(flag){
                int temp = str.charAt(i) - '0';
                if(index >= 10 && negative == 1) return Integer.MAX_VALUE;
                if(index >= 10 && negative == -1) return Integer.MIN_VALUE;
                if ((negative * result > Integer.MAX_VALUE/10 || (negative * result == Integer.MAX_VALUE / 10 && temp > 7)) && negative == 1 ) return Integer.MAX_VALUE;
                if ((negative * result < Integer.MIN_VALUE/10 || (negative * result == Integer.MIN_VALUE / 10 && temp > 8)) && negative == -1) return Integer.MIN_VALUE;
                result = result * 10 +  temp;
                index++;
            }
            i++;
        }

        return negative * result;
    }

    public static void main(String[] args) {
        logger.info(myAtoi("4193 with words"));
    }

}
