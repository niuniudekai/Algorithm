package xw.Array;

import java.util.Iterator;

/**
 * 给定一幅有N*N矩阵表示的图像，其中每个像素的大小为4字节，编写一个方法，将图像旋转90度。不占用额外的存储空间能否做到？
 */
public class Rotating {
    static int[][] rotating(int[][] arr){
        for(int floor = 0; floor < arr.length / 2; floor++){
            int first = floor;
            int last = arr.length - 1 - floor;
            for (int i = first; i < last; i++){

                int offset = i - first;

                //保存上
                int top = arr[first][i];

                //左到上
                arr[first][i] = arr[last - offset][first];

                //下到左
                arr[last - offset][first] = arr[last][last - offset];

                //右到下
                arr[last][last - offset] = arr[i][last];

                //上到右
                arr[i][last] = top;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printInt(arr);
        arr = rotating(arr);
        printInt(arr);
    }

    /**遍历二维数组*/
    static void printInt(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print("[");
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] < 10) {
                    System.out.print(" " + arr[i][j] + ",");
                }else {
                    System.out.print(arr[i][j] + ",");
                }
            }
            System.out.println("]");
        }
        System.out.println();
    }
}
