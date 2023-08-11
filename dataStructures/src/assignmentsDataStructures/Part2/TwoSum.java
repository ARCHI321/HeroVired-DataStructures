package assignmentsDataStructures.Part2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class TwoSum {
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the values : ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the values whose sum to be searched : ");
        int target = sc.nextInt();

        sc.close();

        int[] indices = findTwoSum_BruteForce(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
