class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;   // total bottles drunk
        int empty = numBottles;   // empty bottles after drinking

        while (empty >= numExchange) {
            int newBottles = empty / numExchange; // exchange empties for new full bottles
            total += newBottles;                 // drink these new bottles
            empty = empty % numExchange + newBottles; // leftover empties + new empties from drinking
        }

        return total;
    }
}
