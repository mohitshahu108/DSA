package ArrayProblems.Easy;

/**
 * FindMaxFlip
 */
public class FindMaxFlip {

    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
        // 0 1 0 0 1 0
        // take w size 1 for first 
        // more to next num and if zero 
        // then flip by one 
        // else move forward
        // all m overs record w size as max 
        // reset m and move complete w to

        int mxf = m;
        int mcv = 0;
        int mCount = 0;
        int i =0;

        while(i < n){
            if(vehicle[i] == 0 && mxf > 0){
                mxf--;
                mCount++;
                i++;
            }else if (vehicle[i] == 1){
                mCount++;
                i++;
            } else {
                if(mCount > mcv){
                    mcv = mCount;
                }
                mCount = 0;
                mxf = m;
            }
        }
        if(mCount > mcv){
            mcv = mCount;
        }
    return mcv;
    }
    public static void main(String[] args) {
       int[] v = {0, 1, 0, 0, 1, 0};
       int i = traffic(3, 1, v);
       System.out.println("i" + i);
    }
}