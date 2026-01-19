class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sL = s.length();
        int pL = p.length();
        boolean isEqual = false;
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[26];
        for (int i = 0; i < pL; i++) {
            count[(p.charAt(i)) - 97]++;
        }
        int[] temp = new int[26];
        int c = 0;
        int k = 0;
        for (int l = 0; l < sL; l++) {
            temp[(s.charAt(l)) - 97]++;
            c++;
            isEqual = Arrays.equals(count, temp);
            if (isEqual && (c == pL)) {
                ans.add(l - (pL - 1));
                isEqual = false;
                Arrays.fill(temp, 0);
            }
            if (c == pL) {
                c = 0;
                Arrays.fill(temp, 0);
                l = k;
                if (k < sL - pL) {
                    k++;
                }
            }

        }

        return ans;

    }
}