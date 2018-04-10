package xw.Sort;

/**
 * 选择排序
 */
public class SelectionSort {

    static void SelectionSort(int[] arr){


        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
           if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
           }
        }
    }

    public static void main(String[] args){
        int[] arr = {8,96,23,5,6,43};
        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
        SelectionSort(arr);

        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
    }
}
