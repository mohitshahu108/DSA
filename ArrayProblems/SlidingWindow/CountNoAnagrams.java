package ArrayProblems.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * CountNoAnagrams
 */
public class CountNoAnagrams {
    public static boolean contains(char c, char[] txt) {
        int n = txt.length;
        for (int i = 0; i < n; i++) {
            if (txt[i] == c) {
                txt[i] = '1';
                return true;
            }
        }
        return false;
    }

    int search(String pat, String txt) {
        // code here
        int n = txt.length();
        int m = pat.length();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char ch[] = pat.toCharArray();
            int cnt2 = 0;
            for (int j = i; j < i + m && j < n; j++) {
                if (!contains(txt.charAt(j), ch)) {
                    break;
                } else {
                    cnt2++;
                    if(cnt2 == m){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }



// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        int i=0,j=0;
        int k=pat.length();
        int n=txt.length();
        
        for(int t=0;t<k;t++){
            map.put(pat.charAt(t),map.getOrDefault(pat.charAt(t),0)+1);
        }
        // System.out.println(map);
        int count=map.size();
        
        while(j<n){
            
            //calculation
            if(map.containsKey(txt.charAt(j))){
                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
                if(map.get(txt.charAt(j)) == 0) count--;
            }
            if(j-i+1<k) j++;
            else if(j-i+1 == k){
                
                //extract ans
                if(count==0) ans++;
                //chevck before moving
                if(map.containsKey(txt.charAt(i))){
                   map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                   if(map.get(txt.charAt(i)) == 1) count++;
                }
                
                //sliding the window
                i++;
                j++;
            }
            
        }
        return ans;
    }
    
}

    // solution can be optimized by sliding window
    // and using hashmap instead char array
    int searchOp(String pat, String txt) {
        int n = txt.length();
        int k = pat.length();
        int i = 0, j = 0;
        int cnt = 0;
        
        Map<Character, Integer> pmap = new HashMap<>();
        for (int c = 0; c < k; c++) {
            char ch = pat.charAt(c);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }
        int cmap = pmap.size();
        
        while (j < n) {
            char ch = txt.charAt(j);
            Integer val = pmap.get(ch);
            if (val != null && val != 0) {
                val--;
                if (val == 0) {
                    cmap--;
                }
                pmap.put(ch, val);
            }
        
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (cmap == 0) {
                    cnt++;
                }
        
                char pch = txt.charAt(i);
                Integer v = pmap.get(pch);
                if (v != null) {
                    v++;
                    if (v > 0) cmap++;
                    pmap.put(pch, v);
                }
        
                i++;
                j++;
            }
        }
        return cnt;
    }
}