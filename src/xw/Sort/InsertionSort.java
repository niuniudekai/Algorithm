package xw.Sort;

/**
 * 插入排序
 */
public class InsertionSort {

    static void InsertionSort(int arr[]){

        for (int i = 1; i < arr.length; i++)
        {
            int get = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > get)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = get;
        }
    }

    public static void main(String[] args){
        int[] arr = {8,96,23,5,6,43};
        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
        InsertionSort(arr);

        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
    }
}
