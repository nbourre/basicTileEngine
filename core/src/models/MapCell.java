package models;

public class MapCell {

	int tileID;

	public int getTileID() {
		return tileID;
	}

	public void setTileID(int tileID) {
		this.tileID = tileID;
	}
	
	public MapCell(int tileID) {
		super();
		this.tileID = tileID;
	}

}
