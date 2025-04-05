
public class BubbleSort {

    public int[] sort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) { //[2,1];
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] a = {2, 11, 6, 1, 91, 4, 0, 27, 4, 93, 57};
        int[] ans = b.sort(a);

        for (int i = 0; i < ans.length; i++) 
            System.out.print(ans[i] + "  ");
        

    }

}
