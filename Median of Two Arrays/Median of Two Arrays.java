class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int a = nums1.length;
    int b = nums2.length;
    int c = a + b;
    int[] nums3 = new int[c];

    int i=0, j=0, k=0;

        while (i<=a && j<=b) {
            if (i == a) {
                while(j<b) nums3[k++] = nums2[j++];
                break;
            } else if (j == b) {
                while (i<a) nums3[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        if (c%2==0) 
        return (float)(nums3[c/2-1] + nums3[c/2])/2;
        else return nums3[c/2];
    }
}