package xw.Sort;

public class quickSort {

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

    public static void main(String[] args) {
        int[] arr = {1,425,5,3423,45,5,23};
        QSort(arr,0,arr.length - 1);
        System.out.println();
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
}
