class Solution {
    // majority element.
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int maxfreq=0;
        int maxfreqnum=-1;
        Map<Integer,Integer>counts=new HashMap<>();
        for(int num:nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: counts.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();

           
                
                if(freq>maxfreq){
                    maxfreq=freq;
                    maxfreqnum=num;
                    
                }
                
            }
            return maxfreqnum;

            

        }
        
       
     
 }


