Brute froce approach
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        
      for(int i=0;i<nums.length-1;i++){
          for(int j=i+1;j<nums.length;j++){
              if(nums[i]==nums[j]){
                  flag=true;
                  return flag;
              }
              else continue;
          }
      }
            
            return flag;   
            }
        
    }









Using Sorting

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                flag = true;
                break;
            }
            
               
            }
        return flag;
    }
}

Time Complexity - O(n)

Using HashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
       
       HashMap<Integer ,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(m.containsKey(nums[i])){
               return true;
           } 
            else m.put(nums[i],i);
            
        }
        return false;
            }
        
    }

Using HashSet - Best optimised solution
  

class Solution {
    public boolean containsDuplicate(int[] nums) {
       
      HashSet<Integer> dup = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(dup.contains(nums[i])) return true;
            else dup.add(nums[i]);
        }
        return false;
            }
        
    }

