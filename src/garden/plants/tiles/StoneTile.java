package garden.plants.tiles;

import garden.interfaces.Ornament;

public class StoneTile implements Ornament {
	private boolean glossy;

	public StoneTile(boolean glossy) {
			this.glossy = glossy;
	}

	@Override
	public String colour(int season) {
			String color = "Gray";
			if (glossy) {
					color = "(" + color + ")";
			}
			return color;
	}

	@Override
	public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null || getClass() != obj.getClass()) return false;
			StoneTile stoneTile = (StoneTile) obj;
			return glossy == stoneTile.glossy;
	}

	@Override
	public int hashCode() {
			return Boolean.hashCode(glossy);
	}

	@Override
	public String getName() {
			return "Stone Tile";
	}
}

