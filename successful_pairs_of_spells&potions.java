class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        int c = 0;
        for (int i = 0; i < spells.length; i++) {
            c = 0;
            for (int j = 0; j < potions.length; j++) {
                if (spells[i] * potions[j] >= success)
                    c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}