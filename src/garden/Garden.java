package garden;

import garden.interfaces.Ornament;
import garden.interfaces.WaterConsumer;

public class Garden {
	private Ornament[][] grid;

	public Garden(int rows, int columns) {
			grid = new Ornament[rows][columns];
	}

	public boolean add(int rowPosition, int columnPosition, Ornament ornament) {
			if (grid[rowPosition][columnPosition] == null) {
					grid[rowPosition][columnPosition] = ornament;
					return true;
			}
			return false;
	}

	public void remove(int rowPosition, int columnPosition) {
			grid[rowPosition][columnPosition] = null;
	}

	public void displayNames() {
			for (Ornament[] row : grid) {
					for (Ornament ornament : row) {
							System.out.print(String.format("%12s", ornament == null ? "*" : ornament.getName()));
					}
					System.out.println();
			}
	}

	public void displayColours(int season) {
    if (season < 0 || season > 3) return;
    for (Ornament[] row : grid) {
        for (Ornament ornament : row) {
            System.out.print(String.format("%12s", ornament == null ? "*" : ornament.colour(season)));
        }
        System.out.println();
    }
}
	public int count(Ornament ornament) {
    int count = 0;
    for (Ornament[] row : grid) {
        for (Ornament o : row) {
            if (o != null && o.equals(ornament)) {
                count++;
            }
        }
    }
    return count;
}


public double consumedWater(int days) {
	double totalWater = 0;
	for (Ornament[] row : grid) {
			for (Ornament ornament : row) {
					if (ornament instanceof WaterConsumer) { 
							totalWater += ((WaterConsumer) ornament).consumedWater(days);
					}
			}
	}
	return totalWater;
}
}
