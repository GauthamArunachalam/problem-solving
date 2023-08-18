package blind75;

import utils.InputDataReader;

public class CountingBits {

    public static int[] countBits(int n){
        int ans[] = new int[n+1];
        for(int i=1;i<n+1;i++){
            ans[i] = 1 + ans[i & (i-1)];
        }
        return ans;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int n = inputDataReader.readSingleInt();
        int ans[] = countBits(n);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
