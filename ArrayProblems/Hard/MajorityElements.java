package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElements {
     public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(!l.contains(nums[i])){
                int count = 0;
                for (int j = 0; j < n; j++) {
                   if(nums[j] == nums[i]){
                    count++;
                   } 
                }
                if(count > Math.floor(n/3)){
                    l.add(nums[i]);
                }
            }
        }

        return l;
    }

    // [3,2,3]
    public List<Integer> optimaList(int[] nums){
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        if(n==0) return l;  
        if(n==1){
            l.add(nums[0]);
            return l;
        }

        int count1 = 0;
        int count2 = 0;
        int can1 = nums[0];
        int can2 = nums[1];
        
        for(int i =0; i < n; i++){
        //    if(count1== 0){
        //         can1 = nums[i];
        //    } else if(nums[i]==can1){
        //     count1++;
        //    }else if(v)
        }

        return l;
    } 


}
