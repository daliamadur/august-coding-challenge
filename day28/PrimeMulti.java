public class PrimeMulti {

    public static void main(String[] args) {
        int range = 100_000_000;
        int numThreads = 6;
        int count = 0;

        long startTime = System.currentTimeMillis();

        List<PrimeWorker> workers = new ArrayList<>();

        //evenly distrubute all numbers across 8 threads
        int chunkSize = range / numThreads;

        //create workers(threads), give each thread their range of ints
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize + 1;
            int end = (i == numThreads - 1) ? range : (i + 1) * chunkSize;
            // if (i == numThreads - 1) {
            //     end = range;
            // } else {
            //     end = (i + 1) * chunkSize;
            // }
            PrimeWorker worker = new PrimeWorker(start, end);
            workers.add(worker);
            worker.start();
        }

        for (PrimeWorker worker : workers) {
            try {
                //ensures threads have been completed
                worker.join();

                //sum all prime counts from all workers for total
                count+= worker.getPrimeCount();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Number of primes numbers found: " + count);
        System.out.println("Time taken for " + numThreads + " threads: " + (endTime - startTime) + "ms");
    }
}

class PrimeWorker extends Thread {
    private int start, end;
    private int primeCount = 0;

    public PrimeWorker(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            //checks up to sqrt for efficiency - factor pairs will always have a num < sqrt
            if (n % i == 0) return false;
        }
        return true;
    }

    //task in main as runnable
    public void run () {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
    }

    //prime count for main class
    public int getPrimeCount() {
        return primeCount;
    }
}
