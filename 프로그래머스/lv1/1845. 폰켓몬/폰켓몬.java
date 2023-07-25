import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;


class Solution {
    public int solution(int[] nums) {
        int num = nums.length/2;
        
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new); 
        
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        int setsize = set.size();
        
        
        if(num < setsize)
            return num;
        else
        return setsize;
    }
}