class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> eleMap = new HashMap<>();

        for(int n: nums){
            eleMap.put(n, eleMap.getOrDefault(n, 0)+1);
        }

        PriorityQueue<Integer> minh = new PriorityQueue<>
                                    ((a,b) -> eleMap.get(a) - eleMap.get(b));

        for(int n: eleMap.keySet()){
            minh.offer(n);

            if(minh.size() > k){
                minh.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = minh.poll();
        }

        return result;

    }
}
