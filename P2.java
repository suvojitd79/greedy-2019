public class Solution {
    
    public int solve(ArrayList<ArrayList<Integer>> A) {
    
        if(A.size() == 0) return 0;
        
        A.sort((x1,x2)->{return x1.get(0) - x2.get(0);});
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        pq.add(A.get(0).get(1));
        
        int count = 1;
        
        for(int i=1;i<A.size();i++){
            
            if(A.get(i).get(0) < pq.peek()) count++;    
            else{
                pq.poll();
            }
            pq.add(A.get(i).get(1));
 
        }
        
        return count;
    }
     
}
