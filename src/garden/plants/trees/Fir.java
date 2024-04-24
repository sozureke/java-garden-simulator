package garden.plants.trees;
import java.util.Objects;

import garden.interfaces.Ornament;
import garden.interfaces.WaterConsumer;

public class Fir implements Ornament, WaterConsumer {
	private static final double waterConsumption = 30;

	@Override
	public String colour(int season) {
			return "Green"; 
	}

	@Override
	public String getName() {
			return "Fir";
	}

	@Override
	public boolean equals(Object obj) {
			if (this == obj) {
					return true;
			}
			if (obj == null || getClass() != obj.getClass()) {
					return false;
			}
			return true;
		}

		@Override
    public int hashCode() {
        return Objects.hash();
    }

	@Override
	public double consumedWater(int days) {
			return days * waterConsumption;
	}
}

