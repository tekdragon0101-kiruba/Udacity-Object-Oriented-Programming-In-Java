package spacechallenge;

public class U1 extends Rocket {


    private int cost;
    private int rocketWeight;
    private int maxWeightCarryLimit;
    private double currentWeightCarry = 0;

    public U1() {
        super(100_000_000, 10_000, 18_000);
    }


    @Override
    public boolean land() {
        double chanceOfExploding = 0.01 * (this.getCurrentWeightCarry() / (this.getMaxWeightCarryLimit()-this.getRocketWeight()));
        return chanceOfExploding < Math.random() ;
    }

    @Override
    public boolean launch() {
        double chanceOfExploding = 0.05 * (this.getCurrentWeightCarry() / (this.getMaxWeightCarryLimit()-this.getRocketWeight()));
        return chanceOfExploding < Math.random();
    }
}
