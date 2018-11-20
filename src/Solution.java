public class Solution {

	public static void main(String[] args) {
		int[] A = {0, 1, 0, 0, 1, 1, 0, 1, 1};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		boolean isSequence = false;
		int count = 0;
        int result = 0;
        int multiplier = 0;
        int size = A.length;
		for (int i = 0; i < size; i++) {
			if (A[i] == 0 & !isSequence) {
				isSequence = true;
				multiplier++;
				continue;
			}
			if (A[i] == 1 & isSequence) {
				count++;
				continue;
			}
			if (A[i] == 0 & isSequence) {
				result += count * multiplier;
				count = 0;
				isSequence = false;
				i--;
			}
		}
		result += count * multiplier;
		if (Math.abs(result) > 1000000000) return -1;
		else return result;
	}
}
