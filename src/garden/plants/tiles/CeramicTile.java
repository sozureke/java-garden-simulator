package garden.plants.tiles;

import garden.interfaces.Ornament;

public class CeramicTile implements Ornament{
	private boolean glossy;

	public CeramicTile(boolean glossy) {
			this.glossy = glossy;
	}

	@Override
	public String colour(int season) {
			String color = "Red";
			if (glossy) {
					color = "(" + color + ")";
			}
			return color;
	}

	@Override
	public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null || getClass() != obj.getClass()) return false;
			CeramicTile ceramicTile = (CeramicTile) obj;
			return glossy == ceramicTile.glossy;
	}

	@Override
	public int hashCode() {
			return Boolean.hashCode(glossy);
	}

	@Override
	public String getName() {
			return "Ceramic Tile";
	}
}
