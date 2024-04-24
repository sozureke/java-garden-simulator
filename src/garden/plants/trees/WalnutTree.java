package garden.plants.trees;
import garden.interfaces.Ornament;
import garden.interfaces.WaterConsumer;

public class WalnutTree implements Ornament, WaterConsumer{
    private static final double waterConsumption = 20;

    @Override
    public String colour(int season) {
        switch (season) {
            case 0:
                return "Brown";
            case 1:
            case 2:
                return "Green";
            case 3:
                return "Yellow";
            default:
                return "*";
        }
    }

    @Override
    public String getName() {
        return "Walnut Tree";
    }

    public double consumedWater(int days) {
        return waterConsumption * days;
    }
}
