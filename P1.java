import java.util.stream.*;
public class Solution {
    
    public int candy(ArrayList<Integer> A) {
        
        int[] ans = new int[A.size()];
        Arrays.fill(ans, 1);
        
        for(int i=1;i<A.size();i++){
            
            if(A.get(i) > A.get(i-1)) ans[i] = ans[i-1] + 1;
            
        }
        
        
        for(int i=A.size()-2;i>=0;i--){
            
            if(A.get(i) > A.get(i+1)) ans[i] = Math.max(ans[i], ans[i+1] + 1);
            
        }
        
        return IntStream.of(ans).sum();
    }
}
