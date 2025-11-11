class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int n : nums) freq[n]++;

        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int count = 0;
        for (int f : freq) {
            if (f == maxFreq) count += f;
        }
        return count;
    }
}