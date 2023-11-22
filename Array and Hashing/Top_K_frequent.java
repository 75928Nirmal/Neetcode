class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> ls = new ArrayList<Map.Entry<Integer,Integer>>(mp.entrySet());

        Collections.sort(ls,new Comparator<Map.Entry<Integer,Integer>>()
        {
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer>o2)
            {
                if(o1.getValue()==o2.getValue())
                    return o2.getKey()-o1.getKey();
                else
                    return o2.getValue()-o1.getValue();    
            }
        });
        
        int[] result = new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=ls.get(i).getKey();
        }

        return result;

    }
}