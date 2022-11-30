package Interview_Questions;

import java.util.TreeSet;

public class InterviewCodingQuestion_MaxMin {
    public static void main(String[] args) {
        int[] arr = {4, 781, 8, 99, 103, 781};
        int max = getMax(arr);
        System.out.println("Max: " + max); // 781

        int min = getMin(arr);
        System.out.println("Min: " + min); // 4

        int secondMax = secondMax(arr);
        System.out.println("Second max: " + secondMax);

        secondMax = secondMax2(arr);
        System.out.println("Second max 2: " + secondMax);


    }



    public static int secondMax2(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        return treeSet.lower(treeSet.last());
    }

    /**
     * secondMax([4, 781, 8, 99, 103, 781]) -> 103
     */
    public static int secondMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (secondMax < num && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int getMax(int[] nums) {
        // assume first element is max
        int max = nums[0];

        // check assumption
        for (int num : nums) {
            // if there is another value bigger than our assumption
            if (max < num) {
                // update max
                max = num;
            }
        }
        return max;
    }

    public static int getMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
}

