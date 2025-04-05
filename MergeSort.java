
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        int j =0;
        for (int i = mid; i < nums.length; i++) {
            right[j++] = nums[i];
        }
        int[] sortedL = sort(left);
        int[] sortedR = sort(right);

        nums = merge(sortedL, sortedR);

        return nums;
    }

    public int[] merge(int[] left, int[] right) {
        int[] nums = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while (i<left.length&&j<right.length) { 
            if(left[i]<right[j])
                nums[k++]=left[i++];
            else
                nums[k++]=right[j++];
        }
        while (i<left.length){
            nums[k++]=left[i++];
        }
        while (j<right.length){
            nums[k++]=right[j++];
        }
        return nums;
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] a = {2, 11, 6, 1, 91, 4, 0, 27, 4, 93, 57};
        int[] ans = m.sort(a);
        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "  ");
        }

    }

}
