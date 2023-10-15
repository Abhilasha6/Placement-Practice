class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];

        // correct for most cases
        // int c = 0;
        // for (int i = 0; i < spells.length; i++) {
        // c = 0;
        // for (int j = 0; j < potions.length; j++) {
        // if (spells[i] * potions[j] >= success)
        // c++;
        // }
        // ans[i] = c;
        // }
        // return ans;

        // search for the position where the 1st no. > success occurs,
        // then subtract that index from total length to get no.s > success from the
        // sorted potions array

        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int high = potions.length - 1, low = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long val = (long) spells[i] * potions[mid];
                if (val >= success)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            ans[i] = potions.length - low;
        }
        return ans;
    }
}