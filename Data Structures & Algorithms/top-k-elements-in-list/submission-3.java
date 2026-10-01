class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> eleMap = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue((a,b) -> eleMap.get(b) - eleMap.get(a));
        int result[] = new int[k];

        int capacity = 0;
        for(int n: nums){
            eleMap.put(n, eleMap.getOrDefault(n, 1) + 1);
        }

        for(int n: eleMap.keySet()){
            q.add(n);
        }

        for(int i = 0; i < k ;i++){
            result[i] = q.poll();
        }
        
        return result;
    }
}
