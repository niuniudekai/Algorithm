package xw.Sort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Arrays;
import java.util.Stack;

public class quickSort {

    /**递归*/
    static void QSort(int[] arr,int low ,int high){
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int key = arr[low];
        while(i < j){
            while(i < j && arr[j] >= key){
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= key){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = key;
        QSort(arr, low, i - 1);
        QSort(arr,i + 1, high);
    }

    /**非递归*/
    static void QSort2(int[] arr,int low, int high){
        Stack<Integer> stack = new Stack<>();
        if(low < high){
            stack.push(high);
            stack.push(low);
            while (!stack.isEmpty()){
                int l = stack.pop();
                int h = stack.pop();
                int dex = Quick(arr,l,h);
                if (l < dex - 1){
                    stack.push(dex - 1);
                    stack.push(l);
                }
                if (h > dex + 1){
                    stack.push(h);
                    stack.push(dex + 1);
                }
            }
        }
    }

    static int Quick(int[] arr, int low, int high){
        int key = arr[low];
        while (low < high){
            while (low < high && arr[high] >= key){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= key){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = key;
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,425,5,3423,45,5,23};
        QSort2(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
