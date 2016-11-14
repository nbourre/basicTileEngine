package models;

import java.util.ArrayList;

public class MapCell {

	private int tileID;

	ArrayList<Integer> baseTiles = new ArrayList<Integer>();

	public int getTileID() {
		return tileID;
	}

	public void setTileID(int tileID) {
		if (baseTiles.size() > 0) {
			baseTiles.set(0, tileID);
		} else {
			baseTiles.add(tileID);
		}
	}

	public void addBaseTile(int tileID) {
		baseTiles.add(tileID);
	}

	public MapCell(int tileID) {
		super();
		addBaseTile(tileID);
	}

	public ArrayList<Integer> getBaseTiles() {
		return baseTiles;
	}
}
