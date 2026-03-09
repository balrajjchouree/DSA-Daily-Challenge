class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }

        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
        boolean mergeSomething = true;

        while(mergeSomething){
            mergeSomething = false;

            List<int[]> tempList = new ArrayList<>();

            while(!intervalList.isEmpty()){
                int[] current = intervalList.remove(0); 
                boolean isMerged = false;

                for(int i = 0; i < intervalList.size(); i++){
                    int[] other = intervalList.get(i);

                    if(Math.max(current[0], other[0]) <= Math.min(current[1], other[1])){
                        current = new int[]{Math.min(current[0], other[0]), Math.max(current[1], other[1])};
                        intervalList.remove(i);
                        isMerged = true;
                        mergeSomething = true;
                        break;
                    }
                }
                tempList.add(current);
            }
            intervalList = tempList;
        }

        return intervalList.toArray(new int[intervalList.size()][]);
    }
}