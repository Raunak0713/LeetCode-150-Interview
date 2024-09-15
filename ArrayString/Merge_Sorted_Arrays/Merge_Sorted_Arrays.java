package ArrayString.Merge_Sorted_Arrays;

import java.util.Arrays;

public class Merge_Sorted_Arrays {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int lastIndex = nums1.length - 1;
    while (m > 0 && n > 0) {
      if (nums1[m - 1] > nums2[n - 1]) {
        nums1[lastIndex] = nums1[m - 1];
        m--;
      } else {
        nums1[lastIndex] = nums2[n - 1];
        n--;
      }
      lastIndex--;
    }
    while (n > 0) {
      nums1[lastIndex] = nums2[n - 1];
      lastIndex--;
      n--;
    }
  }

  public static void main(String[] args) {
    int[] nums1_case1 = {1, 2, 3, 0, 0, 0};
    int m_case1 = 3;
    int[] nums2_case1 = {2, 5, 6};
    int n_case1 = 3;
    int[] expected_case1 = {1, 2, 2, 3, 5, 6};

    int[] nums1_case2 = {1};
    int m_case2 = 1;
    int[] nums2_case2 = {};
    int n_case2 = 0;
    int[] expected_case2 = {1};

    int[] nums1_case3 = {0};
    int m_case3 = 0;
    int[] nums2_case3 = {1};
    int n_case3 = 1;
    int[] expected_case3 = {1};

    Merge_Sorted_Arrays merger = new Merge_Sorted_Arrays();

    System.out.println();
    merger.merge(nums1_case1, m_case1, nums2_case1, n_case1);
    {
      boolean isCorrect = Arrays.equals(nums1_case1, expected_case1);
      if (isCorrect) {
        System.out.println("Test Case 1: ✅");
      } else {
        System.out.println("Test Case 1: ❌");
      }
      System.out.println("Expected: " + Arrays.toString(expected_case1));
      System.out.println("Actual:   " + Arrays.toString(nums1_case1));
    }
    System.out.println();

    merger.merge(nums1_case2, m_case2, nums2_case2, n_case2);
    {
      boolean isCorrect = Arrays.equals(nums1_case2, expected_case2);
      if (isCorrect) {
        System.out.println("Test Case 2: ✅");
      } else {
        System.out.println("Test Case 2: ❌");
      }
      System.out.println("Expected: " + Arrays.toString(expected_case2));
      System.out.println("Actual:   " + Arrays.toString(nums1_case2));
    }
    System.out.println();

    merger.merge(nums1_case3, m_case3, nums2_case3, n_case3);
    {
      boolean isCorrect = Arrays.equals(nums1_case3, expected_case3);
      if (isCorrect) {
        System.out.println("Test Case 3: ✅");
      } else {
        System.out.println("Test Case 3: ❌");
      }
      System.out.println("Expected: " + Arrays.toString(expected_case3));
      System.out.println("Actual:   " + Arrays.toString(nums1_case3));
    }
    System.out.println();
  }
}
