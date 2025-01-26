class Solution {
    public String largestGoodInteger(String num) {
        String[] numbers = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (int i = 0; i < numbers.length; i++) {
            if (num.contains(numbers[i])) {
                return numbers[i];
            }
        }
        return "";
    }
}
