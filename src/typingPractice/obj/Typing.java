package typingPractice.obj;

public class Typing {

    private int totalCount;
    private int correctCount;
    private double duration;

    private int speed;
    private double perpect;

    public Typing(double duration, int correctCount, int totalCount) {
        init(duration,correctCount ,totalCount);
    }
    public Typing(double start, double end, int correctCount, int totalCount) {
        double duration = end - start;
        init(duration, correctCount, totalCount);

    }
    private void init(double duration, int correctCount, int totalCount) {
        this.duration = duration;
        this.correctCount = correctCount;
        this.totalCount = totalCount;
        double elapsedTimeInSeconds = this.duration / 1000;
        try {
            this.perpect = (double) ((double) correctCount / (double) totalCount * 100.0);
        } catch (Exception e) {
            e.printStackTrace();
            this.perpect = 0;
        }
        System.out.println("correctCount:" + correctCount);
        System.out.println("correctCount:" + totalCount);
        System.out.println("elapsedTimeInSeconds:" + elapsedTimeInSeconds);
        this.speed = (int) (this.correctCount / elapsedTimeInSeconds * 60d ) ;

    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public double getDuration() {
        return duration;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPerpect() {
        return perpect;
    }

    @Override
    public String toString() {
        return "duration: " + this.duration + ", speed: " + speed;
    }
}
