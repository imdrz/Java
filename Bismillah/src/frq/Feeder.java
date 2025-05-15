package frq;

public class Feeder {
    private int currentFood;

    public void simulateOneDay(int numBirds) {
        boolean condition = Math.random() > 0.05;
        if (condition) {
            int gramsPerBird = (int) (Math.random()*41) + 10;
            if (gramsPerBird*numBirds >= currentFood) {
                currentFood = 0;
            } else {
                currentFood -= gramsPerBird*numBirds;
            }
        } else {
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        int days = 0;
        for (int i = 0; i < numDays; i++) {
            simulateOneDay(numBirds);
            if (currentFood > 0) {
                days++;
            } else {
                return i;
            }
        }
        return days;
    }
}
