package xw.Array;

import java.util.Iterator;

/**
 * 给定一幅有N*N矩阵表示的图像，其中每个像素的大小为4字节，编写一个方法，将图像旋转90度。不占用额外的存储空间能否做到？
 */
public class Rotating {
    static int[][] rotating(int[][] arr){
        int floor = 1;
        while(floor < arr.length / 2){

            //当前层每行有多少元素
            int length = arr.length - (floor - 1)*2;

            for(int i = 0; i < length; i++) {

                int ex = arr[floor - 1][i];

                //左->上
                arr[floor - 1][i] = arr[i][floor - 1];


                //下->左
                arr[i][floor - 1] = arr[arr.length - floor][i];


                //右->下
                arr[arr.length - floor][i] = arr[length - i][arr.length - floor];
//
//
//                //上->右
//                arr[floor][arr.length - i] = ex;

            }
            floor++;
        }
        return arr;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
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

        arr = rotating(arr);

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
    }
}
