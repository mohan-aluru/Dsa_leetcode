class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> s = new HashSet<>();
        for (int h = 0; h < digits.length ; h++) {
            if (digits[h] == 0)
                continue;
            for (int t = 0; t < digits.length; t++) {
                if (t == h)
                    continue;
                for (int u = 0; u < digits.length ; u++) {
                    if (u == h || u == t)
                        continue;
                    if (digits[u] % 2 != 0)
                        continue;
                    int temp = digits[h] * 100 + digits[t] * 10 + digits[u];
                    s.add(temp);
                }
            }
        }
        return s.size();
    }
}