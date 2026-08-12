class Solution {
    private Map<Integer, ArrayList<Integer>> preReqMap = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) { 
        int[] state = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++){
            preReqMap.computeIfAbsent(prerequisites[i][0], k -> new ArrayList<>()).add(prerequisites[i][1]);
        }

        for(int i = 0; i < numCourses; i++){
            if(!dfs(i, state)) return false;
        }
        return true;
    }

    boolean dfs(int i, int[] state){
        if(state[i] == 1)
            return false;

        if(state[i] == 2)
            return true;

        state[i] = 1;

        for (int n : preReqMap.getOrDefault(i, new ArrayList<>())){
            if (!dfs(n, state))
                return false;
        }

        state[i] = 2;
        return true;
        
    }
}
