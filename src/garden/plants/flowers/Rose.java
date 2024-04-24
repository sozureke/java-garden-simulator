package garden.plants.flowers;

import garden.colors.Colours;
import garden.interfaces.Ornament;
import garden.interfaces.WaterConsumer;

public class Rose implements Ornament, WaterConsumer {
    private String colour;
    private static final double waterConsumption = 0.4;

    public Rose(String colour) {
        this.colour = colour; 
    }

    @Override
    public String colour(int season) {
        switch (season) {
            case 0: // Winter
            case 3: // Autumn
                return Colours.BROWN;
            case 1: // Spring
            case 2: // Summer
                return this.colour; 
            default:
                return "*";
        }
    }

    @Override
    public String getName() {
        return "Rose";
    }

    @Override
    public double consumedWater(int days) {
        return waterConsumption * days;
    }
}
