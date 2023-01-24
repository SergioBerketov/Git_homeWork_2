public class Statistic {

    public void arithmeticMean(int[] nums) {

        int max = nums[0];
        for(int num : nums) {
            if(max < num) {
                max = num;
            }
        }

        int min = nums[0];
        for(int num : nums) {
            if(min > num) {
                min = num;
            }
        }

        int result = 0;
        for (int m : nums) {
            if (m == max && m == min){
                continue;
            }else {
                result += m;
            }
        }
        System.out.println("Значение среднего арифметического равно: " + result / nums.length);
    }
}
