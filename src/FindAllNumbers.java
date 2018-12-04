import java.util.ArrayList;
import java.util.List;

/* Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array. */

public class FindAllNumbers {

    // Test method
    public static void main(String[] args) {
        int[] list = {4,3,2,7,8,2,3,1};
        System.out.print(findDisappearedNumbers(list).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int[] list = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length && nums[i] > 0)
                list[nums[i]]++;
        }
        for (int i = 1; i < list.length; i++) {
            if (list[i] == 0)
                answer.add(i);
        }
        return answer;
    }
}

