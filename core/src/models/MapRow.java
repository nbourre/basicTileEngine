package models;

import java.util.ArrayList;

public class MapRow {
	ArrayList<MapCell> columns;

	public MapRow() {
		columns = new ArrayList<MapCell>();
	}
	
	public MapCell getCell(int cellIndex) {
		return columns.get(cellIndex);
	}
}
