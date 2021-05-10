package CountPrimes;

public class SieveOfEratosthenesSolution {
    /**
     * normal way: for each number you would loop for all the prime number less than it to decide if it's prime or not
     * (for one number you may loop the whole prime list until the end to get it's not prime)
     * with this algorithm each prime number will exclude its multiples which saves many iterations
     **/
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i=2; i < n; i++) {
            isPrime[i] = true;
        }

        for(int i=2; i*i<n; i++) {
            if(!isPrime[i]) continue;
            for(int j = i * i; j < n; j+=i) {
                isPrime[j] = false;
            }
        }

        int cnt = 0;
        for(int i=2; i < n; i++) {
            if(isPrime[i]) cnt++;
        }
        return cnt;
    }
}
