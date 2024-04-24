package garden.plants.flowers;

import garden.colors.Colours;
import garden.interfaces.Ornament;
import garden.interfaces.WaterConsumer;

public class Muguets implements Ornament, WaterConsumer {
    private static final double waterConsumption = 0.3;

    @Override
    public String colour(int season) {
        switch (season) {
            case 1:
						case 2:
                return Colours.WHITE;
            default:
                return "*";
        }
    }

    @Override
    public String getName() {
        return "Muguets";
    }

    public double consumedWater(int days) {
        return waterConsumption * days;
    }
}
