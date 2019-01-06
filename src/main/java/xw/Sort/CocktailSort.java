package xw.Sort;

/**
 * 鸡尾酒排序
 */
public class CocktailSort {
    
    static void CocktailSort(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right ){
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--){
                if (arr[i] < arr[i - 1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            left++;
        }
    }
    public static void main(String[] args){
        int[] arr = {8,96,23,5,6,43};
        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
        CocktailSort(arr);

        for(int a :arr){
            System.out.print(a + ",");
        }
        System.out.println();
    }
}
