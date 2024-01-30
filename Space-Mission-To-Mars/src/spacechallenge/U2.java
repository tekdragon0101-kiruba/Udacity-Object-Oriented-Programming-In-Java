package spacechallenge;

public class U2 extends Rocket {

    private int cost;
    private int rocketWeight;
    private int maxWeightCarryLimit;
    private double currentWeightCarry = 0;

    public U2() {
        super(120_000_000, 18_000, 29_000);
    }

    @Override
    public boolean land() {
        double chanceOfExploding = 0.08 * (this.getCurrentWeightCarry() / (this.getMaxWeightCarryLimit()-this.getRocketWeight()));
        return chanceOfExploding < Math.random();
    }

    @Override
    public boolean launch() {
        double chanceOfExploding = 0.04 * (this.getCurrentWeightCarry() / (this.getMaxWeightCarryLimit()-this.getRocketWeight()));
        return chanceOfExploding < Math.random();
    }
}