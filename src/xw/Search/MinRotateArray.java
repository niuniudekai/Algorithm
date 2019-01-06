package xw.Search;

/**
 * 旋转数组中最小的数 把数组从最开始的一部分搬移到尾部，称之为旋转数组。如：[1,2,3,4,5,6] -> [4,5,6,1,2,3]，这次的数组还是已经排序好的。
 */
public class MinRotateArray {

    public static int SearchMin(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start != end){

            if(arr[start] >= arr[end]){
                start++;
            }else {
                end--;
            }

        }
        return arr[start];
    }

    public static void main(String[] args){
        int[] arr = new int[]{4,5,7,1,2,3};
        int[] arr2 = new int[]{1,1,1,1,0,1};
        System.out.println(SearchMin(arr));
        System.out.println(SearchMin(arr2));
    }
}
