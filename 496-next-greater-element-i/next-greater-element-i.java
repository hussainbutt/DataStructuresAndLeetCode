class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        Stack<Integer> st = new Stack<Integer>();
        int[] ans = new int[(nums1.length)];

        for(int i = nums2.length-1; i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                System.out.println("pop");
                st.pop();
                
            }
            if(st.isEmpty()){
                 
                st.push(nums2[i]);
                System.out.println("Stack Top: "+ st.peek());
                hm.put(nums2[i],-1);
                System.out.println("hashed by cond1: "+ hm.get(nums2[i]));
               
                continue;
            }

            else if(st.peek()>nums2[i]){      
                System.out.println("Stack Top: "+ st.peek());       
                hm.put(nums2[i], st.peek());
                st.push(nums2[i]);
                System.out.println("hashed by cond2: "+hm.get(nums2[i]));
                
                continue;
            }
           
            
        }
            for(int i = 0; i<nums1.length; i++){
                System.out.println(i);
                ans[i] = hm.get(nums1[i]);
            }
            return ans;
        }
    }
