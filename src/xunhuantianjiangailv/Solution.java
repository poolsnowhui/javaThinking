package xunhuantianjiangailv;

import java.util.Scanner;

public class Solution {

	public static int[] creatArray() {
		int[] nums = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter" + nums.length + "values:");

		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		input.close();

		// for(int i=0;i<nums.length;i++){
		// System.out.print(nums[i]);
		// }
		// System.out.println("create");

		return nums;
	}

	public static int[] topKFreament() {
		int[] nums = Solution.creatArray();
		int[] nums2 = new int[10];
		java.util.Arrays.sort(nums);
		int count = 1, i = 0;

		for (i = 0; i < nums.length;) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				} else {
					nums2[nums[i]] = count;
					i = j;
					count = 1;
					if (j == nums.length - 1) {
						nums2[nums[i]] = count;
						return nums2;
					}

					break;
				}

				if (j == nums.length - 1) {
					nums2[nums[i]] = count;
					// for (int j2 = 0; j2 < nums2.length; j2++) {
					// System.out.println(nums2[j2]);
					// }
					return nums2;
				}

			}
		}
		return null;
	}

	public static void getMaxElement() {
		int[] nums2 = Solution.topKFreament();
		int max = nums2[0];
		int k = 0;
		for (int i = 1; i < nums2.length; i++) {
			if (nums2[i] > max) {
				max = nums2[i];
				k = i;
			} else if (nums2[i] == max) {
				if (i > k) {
					k = i;
				}
			}
		}
		System.out.println(k);
		System.out.println(max);
	}

	public static void main(String[] Args) {
		String m = "202";
		System.out.println(m.hashCode());
		while (true) {
			Solution.getMaxElement();
		}

	}
}
