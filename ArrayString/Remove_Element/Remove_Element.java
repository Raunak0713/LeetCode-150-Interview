package ArrayString.Remove_Element;

import java.util.Arrays;

public class Remove_Element {

  public int removeElement(int[] nums, int val) {
    int k = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    int[] nums_case1 = {3, 2, 2, 3};
    int val_case1 = 3;
    int[] expected_case1 = {2, 2};

    int[] nums_case2 = {0, 1, 2, 2, 3, 0, 4, 2};
    int val_case2 = 2;
    int[] expected_case2 = {0, 1, 4, 0, 3};

    Remove_Element remover = new Remove_Element();

    System.out.println();
    int k_case1 = remover.removeElement(nums_case1, val_case1);
    {
      boolean isCorrect = k_case1 == expected_case1.length &&
                          Arrays.equals(Arrays.copyOfRange(nums_case1, 0, k_case1), expected_case1);
      if (isCorrect) {
        System.out.println("Test Case 1: ✅");
      } else {
        System.out.println("Test Case 1: ❌");
      }
      System.out.println("Expected: " + Arrays.toString(expected_case1));
      System.out.println("Actual:   " + Arrays.toString(Arrays.copyOfRange(nums_case1, 0, k_case1)));
    }
    System.out.println();

    int k_case2 = remover.removeElement(nums_case2, val_case2);
    {
      boolean isCorrect = k_case2 == expected_case2.length &&
                          Arrays.equals(Arrays.copyOfRange(nums_case2, 0, k_case2), expected_case2);
      if (isCorrect) {
        System.out.println("Test Case 2: ✅");
      } else {
        System.out.println("Test Case 2: ❌");
      }
      System.out.println("Expected: " + Arrays.toString(expected_case2));
      System.out.println("Actual:   " + Arrays.toString(Arrays.copyOfRange(nums_case2, 0, k_case2)));
    }
    System.out.println();
  }
}
