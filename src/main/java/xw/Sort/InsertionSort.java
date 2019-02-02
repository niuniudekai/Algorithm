package xw.Sort;

/**
 * 插入排序
 */
public class InsertionSort {

    /**
     * 插入排序
     * @param arr 输入数组
     * @param order 顺序 1为升序 0为降序
     */
    static void insertionSort(int arr[],int order){

        for (int i = 1; i < arr.length; i++)
        {
            int get = arr[i];
            int j = i - 1;
            while (j >= 0 && ((order == 1) ? (arr[j] > get):(arr[j] < get)))
            {
                 arr[j + 1] = arr[j];
                 j--;

            }
            arr[j + 1] = get;
        }
    }

    /**
     * 对比两个输入参数的大小
     * @param a 输入参数1
     * @param b 输入参数2
     * @return boolean 如果a > b 返回true,反之返回false
     */
    static boolean compare(int a,int b){
            System.out.println(a + ">" + b + "?");
            System.out.println(a > b);
            return a > b;

    }
    public static void main(String[] args){

        int[] arr = {8,96,23,5,6,43};
        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
        insertionSort(arr,1);

        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();

        insertionSort(arr,0);

        for(int a :arr){
            System.out.print(a + ",");
        }

    }
}
