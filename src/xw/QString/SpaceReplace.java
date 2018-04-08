package xw.QString;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 将字符数组中的空格 转换为%20,假设字符数组足够大，已知字符数组中非空字符的长度
 * 假设字符数组拥有这三个字符{'1','2','3'}，也就是说 这个非空字符的长度为3，但它的长度不止3
 */
public class SpaceReplace {
    static char[] spaceSeplace(char[] space, int length){

        char[] result = new char[space.length];

        Queue<Character> queue = new LinkedList<Character>();

        int j = 0;

        for(int i = 0; i < length; i++){
            if(space[i] != ' '){
                System.out.println("space["+ i +" ]" + "=" + space[i]);
                queue.add(space[i]);
            }else{
                while (!queue.isEmpty()){
                    result[j++] = queue.poll();
                }
                result[j++] = '%';
                result[j++] = '2';
                result[j++] = '0';
            }
        }

        while (!queue.isEmpty()){
            result[j++] = queue.poll();
        }

        return result;
    }


    public static void main(String[] args){
        char[] acc = new char[30];
        acc[0] = 'a';
        acc[1] = 'b';
        acc[2] = 'c';
        acc[3] = ' ';
        acc[4] = 'd';
        acc[5] = ' ';
        acc[6] = ' ';
        acc[7] = 'e';

        char[] result = spaceSeplace(acc,8);

        for (char a : result){
            System.out.print(a);
        }
    }

}
