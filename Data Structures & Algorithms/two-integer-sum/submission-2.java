class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 
        
    //     HashMap <Integer , Integer> indices = new HashMap<>();

    //     for(int i = 0 ; i < nums.length ; i++){
    //         indices.put(nums[i],i);
    //     }

    //      for(int i = 0 ; i < nums.length ; i++){
    //         int dif = target - nums[i];

    //         if(indices.containsKey(dif) && indices.get(dif) != i){
    //             return new int [] {i, indices.get(dif)};
    //         }

    //      }   
    //     return new int[0];
    // }

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i = 0 ; i < nums.length ; i++){
        int num = nums[i];
        int dif = target - num ;

        if(map.containsKey(dif)){
            return new int[] {map.get(dif) , i};
        }
        map.put(num,i);
    }

    return new int[0];
}
}