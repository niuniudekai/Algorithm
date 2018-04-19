package xw.Search;

/**
 * 二分查找
 */
public class BinarySearch {

    /*返回key在数组arr中的位置*/
    public static Integer BinarySearch(int[] arr, Integer key){
        if(arr == null || arr.length <= 0 || key == null){
            return null;
        }

        return Search(arr, 0, arr.length - 1,key);
    }

    public static Integer Search(int[] arr, int low, int high, int key){


        if(low <= high) {
            int mid = (low + high)/2;

            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] > key) {
                return Search(arr, low, mid - 1, key);
            }else{
                return Search(arr, mid + 1, high, key);
            }

        }
        return null;
    }


    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 5, 9, 15, 26, 47, 60};

        for (int i = 1; i < 10; i++) {
            Integer result = BinarySearch(arr, i);
            if (result != null) {
                System.out.println(i+ "存在于数组arr的" + result + "位置");
            }
        }

    }
}
