package ArrayString.Merge_Sorted_Arrays;

import java.util.Arrays;

public class Merge_Sorted_Arrays {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Take Last Index
    int  lastIndex = nums1.length - 1;

    // Merge in Reverse Order
    while(m > 0 && n > 0){
      if(nums1[m-1] > nums2[n-1]){
        nums1[lastIndex] = nums1[m-1];
        m--;
      }
      else{
        nums1[lastIndex] = nums2[n-1];
        n--;
      }
      lastIndex--;
    }

    // Fill nums1 with remaining elements from num2 
    while(n > 0){
      nums1[lastIndex] = nums2[n-1];
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
    checkResult(nums1_case1, expected_case1, 1);
    System.out.println();
    merger.merge(nums1_case2, m_case2, nums2_case2, n_case2);
    checkResult(nums1_case2, expected_case2, 2);
    System.out.println();
    merger.merge(nums1_case3, m_case3, nums2_case3, n_case3);
    checkResult(nums1_case3, expected_case3, 3);
    System.out.println();
  }

  public static void checkResult(int[] actual, int[] expected, int testCaseNumber) {
    boolean isCorrect = Arrays.equals(actual, expected);
    if (isCorrect) {
      System.out.println("Test Case " + testCaseNumber + ": ✅");
    } else {
      System.out.println("Test Case " + testCaseNumber + ": ❌");
    }
    System.out.println("Expected: " + Arrays.toString(expected));
    System.out.println("Actual:   " + Arrays.toString(actual));
    }
}