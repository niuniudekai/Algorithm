package xw.LeetCode;

public class Leet9 {
    public static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }
        int length = 0;
        int y = x;
        while(y > 0){
            y /= 10;
            length++;
        }
        System.out.println("mid: " + length / 2);
        for(int i = 0; i < length / 2; i++){
            int front = getNum(x,length - i - 1);
            int back = getNum(x,i);
            if( front != back){
                return false;
            }
        }
        return true;
    }

    static int getNum(int x, int num){
        return (x / (int)Math.pow(10,num)) % 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(122221));
    }
}
