package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.HashMap;

public class totolSubArraywithXORK {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int XR = 0;
        int count = 0;

        map.put(0, 1);
        for (int i = 0; i < A.size(); i++){
          XR = XR ^ A.get(i);
          int x  = XR ^ B;
          if(map.containsKey(x)) {
            count += map.get(x);
          }
          map.put(XR, map.getOrDefault(XR, 0) + 1);
        }
        return count;
    }
}
