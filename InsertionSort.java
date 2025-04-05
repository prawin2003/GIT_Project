
public class InsertionSort {

    public int[] sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];

            for (int j = i - 1; j >= -1; j--) {//{11,2 , 6, 1, 91, 4, 0, 27, 4, 93, 57
                if (j==-1||nums[j] < cur) {
                    nums[j + 1] = cur;
                    break;
                }
                nums[j + 1] = nums[j];
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        InsertionSort in = new InsertionSort();
        int[] a = {2, 11, 6, 1, 91, 4, 0, 27, 4, 93, 57};
        int[] ans = in.sort(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "  ");
        }

    }
}
