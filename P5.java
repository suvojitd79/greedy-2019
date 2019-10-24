public class Solution {
    
    class Job{
        int profit, deadline;
        Job(int p,int d){
            this.profit = p;
            this.deadline = d;
        }
    }
    
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
    
        ArrayList<Job> jobs = new ArrayList(); 
    
        for(int i=0;i<A.size();i++) jobs.add(new Job(B.get(i), A.get(i)));
        
        Collections.sort(jobs, new Comparator<Job>(){
            
            @Override
            public int compare(Job x,Job y){
                return y.profit - x.profit;
            }
            
        });
        
        int[] profit = new int[Collections.max(A)];
        Arrays.fill(profit, -1);
        
        for(Job job:jobs){
            
            int i = job.deadline - 1;
            while(i >= 0 ){
                
                if(profit[i] == -1){
                    
                    profit[i] = job.profit;
                    break;
                }
                i--;
            }
            
            
        }
        
        int profit_sum = 0;
        
        for(int x:profit){
            
            if(x != -1){
                profit_sum += x;
            }
            
        }
        
        return profit_sum;
        
    }
}
