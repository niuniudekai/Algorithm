package xw.LeetCode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Leet7 {
    private static final Logger logger = LogManager.getLogger(Leet7.class);

    public static int reverse(int x) {

        int result = 0;

        while ( x != 0){
            int temp = x % 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            result = result * 10 + temp;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        logger.info(reverse(12333333));
    }
}
