package xw.Sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    static void BubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){  
        int[] arr = {8,96,23,5,6,43};
        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
        BubbleSort(arr);

        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();


    }
}
