package garden.plants.grass;

import garden.interfaces.Ornament;
import garden.interfaces.WaterConsumer;

public class Cynodon implements Ornament, WaterConsumer {
	private static final double waterConsumption = 0.3;

	@Override
	public String colour(int season) {
			return "Green"; 
	}

	@Override
	public String getName() {
			return "Cynodon";
	}

	@Override
	public double consumedWater(int days) {
			return days * waterConsumption;
	}
}
