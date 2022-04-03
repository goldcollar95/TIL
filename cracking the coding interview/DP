Recursion and DP

A simple implementation of this code is below.

int countways(int n) {
    if (n<0) {
        return 0;
    } else if (n == 0) {
        return 1;
    } else {
        return countways(n-1) + countways(n-2) + countways(n-3);
    }
}

Like the Fibo problem, the runtime of this algorithm is exponential 
Time complexity O(3n), since each call branches out to three more calls.


