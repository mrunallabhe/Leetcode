import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> digitMap = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            digitMap.put(digits[i], digitMap.getOrDefault(digits[i], 0) + 1);
        }

        for (int j = 100; j <= 999; j++) {
            if (j % 2 != 0) continue; 

            if (isContainDigit(j, digitMap)) {
                result.add(j);
            }
        }

      
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    static boolean isContainDigit(int num, Map<Integer, Integer> digitMap) {
        int[] temp = new int[10];
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        temp[a]++;
        temp[b]++;
        temp[c]++;

        for (int i = 0; i < 10; i++) {
            if (temp[i] > digitMap.getOrDefault(i, 0)) {
                return false;
            }
        }
        return true;
    }
}
