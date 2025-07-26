class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();

        for (String i : words) {
            if (check(i, pattern)) {
                res.add(i);
            }
        }
        return res;
    }

    boolean check(String x, String y) {
        for (int i = 0; i < x.length(); i++) {
            if (x.indexOf(x.charAt(i)) != y.indexOf(y.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}