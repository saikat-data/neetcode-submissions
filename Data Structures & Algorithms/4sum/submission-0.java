class Solution {
 public List<List<Integer>> fourSum(int[] nums, int target) {
 Arrays.sort(nums);
//List<List<Integer>> ans = new ArrayList<>();
 Set<List<Integer>> set = new HashSet<>();
for (int i = 0; i < nums.length - 3; i++) {
for (int j = i + 1; j < nums.length - 2; j++) {
for (int k = j + 1; k < nums.length - 1; k++) {
for (int m = k + 1; m < nums.length; m++){
if ((long)nums[i] + nums[j] + nums[k] + nums[m] == target) {
set.add(Arrays.asList(
nums[i],
nums[j],
nums[k],
nums[m]
));
                        }
                }
                    }
                }
            }
        
        
   return new ArrayList<>(set);     
    }
}