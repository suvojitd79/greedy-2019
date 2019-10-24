public class Solution {
    
    class Activity{
        int start, end;
        Activity(int s,int e){
            this.start = s;
            this.end = e;
        }
        
    }
    
    
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
    
    
        if(A.size()==0) return 0;
    
        
        ArrayList<Activity> ac = new ArrayList();
        for(int i=0;i<A.size();i++) ac.add(new Activity(A.get(i), B.get(i)));
        Collections.sort(ac, new Comparator<Activity>(){
            
            @Override
            public int compare(Activity x,Activity y){
                return x.end - y.end;
            }
            
        });
        
        
        ArrayList<Activity> ans = new ArrayList();
        ans.add(ac.get(0));
        
        for(int i=1;i<ac.size();i++){
            
            Activity a = ans.get(ans.size()-1);
            
            if(a.end <= ac.get(i).start){
                ans.add(ac.get(i));
            }
            
        }
        
        return ans.size();
    }
    
    
}


