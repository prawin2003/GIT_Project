
public class QuickSort {

    @SuppressWarnings("ManualArrayToCollectionCopy")
    public int[] sort(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }
        int pivot = nums[0];
        int pivotIndx = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > pivot && pivotIndx == -1) {
                pivotIndx = i - 1;
            } else if (nums[i] < pivot && pivotIndx != -1) {
                int temp = nums[i];
                nums[i] = nums[++pivotIndx];
                nums[pivotIndx] = temp;
            } else if (i + 1 == nums.length && pivotIndx == -1) {
                pivotIndx = i;
            }
        }
        nums[0] = nums[pivotIndx];
        nums[pivotIndx] = pivot;
        int[] left = new int[pivotIndx];
        int[] right = new int[nums.length - (pivotIndx + 1)];
        for (int i = 0; i < pivotIndx; i++) {
            left[i] = nums[i];
        }

        int j = 0;
        for (int i = pivotIndx + 1; i < nums.length; i++) {
            right[j++] = nums[i];
        }

        int[] sortedL = sort(left);
        int[] sortedR = sort(right);

        j = 0;
        for (int i = 0; i < left.length; i++) {
            nums[j++] = sortedL[i];
        }
        nums[j++] = pivot;
        for (int i = 0; i < right.length; i++) {
            nums[j++] = sortedR[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] a = {2, 11, 6, 1, 91, 4, 0, 27, 4, 93, 57};
        int[] ans = q.sort(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "  ");
        }

    }
}
