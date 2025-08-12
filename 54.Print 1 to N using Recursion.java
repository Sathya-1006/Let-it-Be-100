class Solution {
    public void printNumbers(int n) {
        printNumbersHelper(1, n);
    }

    private void printNumbersHelper(int current, int n) {
        if (current > n)
            return;
        System.out.println(current);
        printNumbersHelper(current + 1, n);
    }
}
