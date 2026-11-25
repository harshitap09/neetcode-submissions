class Solution {
    public int calculateNoOfZero(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) num++;
        }
        return num;
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        int noOfZero = calculateNoOfZero(nums);
        
        //edge case 1
        if (noOfZero >= 2) {
            Arrays.fill(output,0);
        }

        //edge case 2
        else if (noOfZero == 1) {
            int prod = 1;
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) index = i;
                else prod *= nums[i];
            }
            Arrays.fill(output,0);
            output[index] = prod;            
        }

        //general case
        else { 
            int prefix = 1;
            int postfix = 1;
            for (int i = 0; i < n; i++) {
                output[i] = prefix;
                prefix *= nums[i];
            }

            for (int i=n-1; i>=0; i--) {
                output[i] *= postfix;
                postfix *= nums[i];
            }
        }

        return output;
    }
}  
