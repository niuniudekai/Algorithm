package xw.Sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        //将最小的依次放入temp中
        if(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        //把左边剩余的依次放入temp中
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //把右边剩余的依次放入temp中
        while(j <= high){
            temp[k++] = arr[j++];
        }

        // 把新数组中的数覆盖arr数组
        for(int h = 0; h < temp.length; h++){
            arr[low + h] = temp[h];
        }
    }
    static void mergeSort(int[] arr, int low, int high){
        int mid = (low + high)/2;
        if(low < high){
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
}
