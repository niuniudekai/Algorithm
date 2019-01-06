package xw.LeetCode;

public class Leet4 {

    public static void main(String[] args) {
        int[] nums1 = {1,3,4,9};
        int[] nums2 = {5,9,11,17};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    /*
    * 寻找两个有序数组的中位数
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int m = nums1.length;
        int n = nums2.length;

        if(m > n){
            int[] temps = nums1; nums1 = nums2; nums2 = temps;
            int temp = m; m = n; n = temp;
        }

        int iStart = 0;
        int iStop = m;
        int midLength = (m + n + 1) / 2;

        while (iStart <= iStop) {

            int i = (iStart + iStop) / 2;
            int j = midLength - i;

            if (i > iStart && nums1[i - 1] > nums2[j]) {
                iStop = i - 1;
            } else if (i < iStop && nums2[j - 1] > nums1[i]) {
                iStart = i + 1;
            } else {
                int maxLeft = 0;
                if (i == 0) { maxLeft = nums2[j-1]; }
                else if (j == 0) { maxLeft = nums1[i-1]; }
                else { maxLeft = Math.max(nums1[i-1], nums2[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = nums2[j]; }
                else if (j == n) { minRight = nums1[i]; }
                else { minRight = Math.min(nums2[j], nums1[i]); }

                result = (maxLeft + minRight) / 2.0;
                return result;
            }

        }
        return result;
    }
}
