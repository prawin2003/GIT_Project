
public class SelectionSort {

    public int[] sort(int[] nums) {
        for (int i = 0; i < nums.length;i++) {
            int min = nums[i];
            int minIndx = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndx = j;
                }
            }
            nums[minIndx] = nums[i];
            nums[i] = min;
        }

        return nums;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] a = {2, 11, 6, 1, 91, 4, 0, 27, 5, 93, 57};
        int[] ans = s.sort(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "  ");
        }

    }
}
