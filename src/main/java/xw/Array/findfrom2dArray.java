package xw.Array;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class findfrom2dArray {
    static boolean find(int[][] arr, int key){
        boolean find = false;
        int row = 0;
        int colum = arr[0].length - 1;
        while (row < arr.length  && colum >= 0){
            if(arr[row][colum] == key){
                find = true;
                break;
            }else if(arr[row][colum] > key){
                colum--;
            }else {
                row ++;
            }
        }
        return find;
    }
    
    public static void main(String[] args){  
        int[][] arr = {{1,2,8,9,},
                        {2,4,9,12},
                        {4,7,10,13},
                        {6,8,11,15}};
        System.out.println(find(arr,6));
    }
}
