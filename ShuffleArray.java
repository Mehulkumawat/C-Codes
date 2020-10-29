package coding;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] result = shuffleTheArray(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 });
        System.out.println(Arrays.toString(result));

    }

    public static int[] shuffleTheArray(int[] nums) {
        int length = nums.length;
        int n = length / 2;
        int[] result = new int[length];
        
        // Handling even case
        int j = 0;
        for(int i = 0 ; i < length; i = i + 2) {
            result[i] = nums[j++];
        }

        // Handling odd case
        int k = n;
        for(int i = 1; i < length; i = i + 2) {
            result[i] = nums[k++];
        }

        // for (int i = 0; i < length; i++) {

        //     if (i % 2 == 0) {
        //         result[i] = nums[i - k];
        //         k++;
        //     } else {
        //         result[i] = nums[i + n - j];
        //         j++;
        //     }
        // }

        return result;

    }

    

}
