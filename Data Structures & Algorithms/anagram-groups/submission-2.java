class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = String.valueOf(chars);

            List<String> list;
            if(resultMap.containsKey(str)){
                list = resultMap.get(str);
            } else {
                list = new ArrayList<>();
            }
            list.add(s);
            resultMap.put(str, list);
        }

        for(String l: resultMap.keySet()){
            result.add(resultMap.get(l));
        }

        return result;

    }
}
