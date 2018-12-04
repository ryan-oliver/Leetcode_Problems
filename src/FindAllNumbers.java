import java.util.ArrayList;
import java.util.List;

public class FindAllNumbers {

    public static void main(String[] args) {
        int[] list = {4,3,2,7,8,2,3,1};
        System.out.print(findDisappearedNumbers(list).toString());
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
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
