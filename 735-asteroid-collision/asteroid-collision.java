class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int ast : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && st.peek() > 0 && ast < 0) {
                if (Math.abs(st.peek()) < Math.abs(ast)) {
                    st.pop();
                    continue;
                } else if (Math.abs(st.peek()) == Math.abs(ast)) {
                    st.pop();
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                st.push(ast);
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
