class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i =0;
        int j = numbers.length-1;
        int sum=0;


        int arr[]=new int[2];

        while(i<j)
        {
            sum=numbers[i]+numbers[j];
            if (target==sum)
            {
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }

            else if(target<sum)
            {
                j--;
            }

            else
            {
                i++;
            }
        }

        return null;
    }
}