
import java.util.Random;

class ParallelMin implements Runnable {
    Thread t;
    private int[] nums;
    private int startRange;
    private int endRange;
    Integer minVal;

    ParallelMin(int[] nums, int start, int end) {
        this.nums = nums;
        startRange = start;
        endRange = end;
        this.minVal = Integer.MAX_VALUE;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (var i = startRange; i < endRange; i++) {
            // just in case
            synchronized (this) {
                if (minVal > nums[i]) {
                    minVal = nums[i];
                    
                }
                // System.out.println(nums[i]);
            }

        }
    }

}

public class TF_2016_2017_3c {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[500];

        for (int i = 0; i < 500; i++) {
            nums[i] = random.nextInt();
        }

        Integer minVal = Integer.MAX_VALUE;

        

        ParallelMin[] countObs = {
                new ParallelMin(nums, 0, 100),
                new ParallelMin(nums, 100, 200),
                new ParallelMin(nums, 200, 300),
                new ParallelMin(nums, 300, 400),
                new ParallelMin(nums, 400, 500)
        };

        

        try {
            for(int i = 0; i < 5; i++){
                countObs[i].t.join();
            }
            // countObs[0].t.join();
            // countObs[1].t.join();
            // countObs[2].t.join();
            // countObs[3].t.join();
            // countObs[4].t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            if (countObs[i].minVal < minVal) {
                minVal = countObs[i].minVal;
            }
        }

        System.out.println(minVal);

    }
}
