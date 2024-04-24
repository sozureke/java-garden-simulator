package garden.plants.flowers;

import garden.colors.Colours;
import garden.interfaces.Ornament;
import garden.interfaces.WaterConsumer;

public class Sunflower implements Ornament, WaterConsumer {
    private static final double waterConsumption = 0.5;

    public Sunflower(String colour) {}

    @Override
    public String colour(int season) {
        switch (season) {
            case 0:
							return Colours.BROWN;
            case 3:
                return Colours.GREEN;
            case 1:
            case 2:
                return Colours.PINK;
            default:
                return "*";
        }
    }

    @Override
    public String getName() {
        return "Sunflower";
    }

    public double consumedWater(int days) {
        return waterConsumption * days;
    }
}
