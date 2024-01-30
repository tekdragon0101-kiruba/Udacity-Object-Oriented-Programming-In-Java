package spacechallenge;

public class Rocket implements SpaceShip {

    private final int cost;
    private final int rocketWeight;


    private final int maxWeightCarryLimit;
    private int currentWeightCarry = 0;

    public Rocket(int cost, int rocketWeight, int maxWeightCarryLimit) {
        this.cost = cost;
        this.rocketWeight = rocketWeight;
        this.maxWeightCarryLimit = maxWeightCarryLimit;
    }

    public int getCost() {
        return cost;
    }

    public int getRocketWeight() {
        return rocketWeight;
    }
    public int getMaxWeightCarryLimit() {
        return maxWeightCarryLimit;
    }

    public double getCurrentWeightCarry() {
        return currentWeightCarry;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public final boolean canCarry(Item object) {
        return this.maxWeightCarryLimit - this.rocketWeight >= this.currentWeightCarry + object.getWeight();
    }

    @Override
    public final void carry(Item object) {
        this.currentWeightCarry += object.getWeight();
    }
}
