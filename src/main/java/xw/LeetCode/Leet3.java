package xw.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Leet3 {

    public static int lengthOfLongestSubstring(String s) {
        if( s == null || s.length() == 0){
            return 0;
        }
        int result = 0; //结果
        int max = 0; //临时表示当前最长
        Map<Character,Integer> dic = new HashMap<Character, Integer>();//作为字典map

        char[] ss = s.toCharArray();//切割String成char数组
        //遍历数组
        for(int index = 0; index < ss.length; index++){
            if(!dic.containsKey(ss[index])){
                //字典中不存在的就是还没有重复的，max+1,并将当前字符以及当前字符所在的索引作为value加入字典，map
                max++;
                dic.put(ss[index],index);
            }else{
                //当前字符在字典存在，代表出现重复
                //对比得出结果
                result = result > max ? result:max;
                //跳转到上一个该字符的位置
                index = dic.get(ss[index]);
                //清空字典
                dic = new HashMap<Character, Integer>();
                //max置0
                max = 0;
            }
        }

        return result > max ? result:max;
    }


    public static void main(String[] args) {
         System.out.println(lengthOfLongestSubstring("absjkadkjahfioahf"));
    }
}
