//27.problem link https://leetcode.com/problems/remove-element/description/
public class RemoveElement {
    public int removeElement(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=target)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
