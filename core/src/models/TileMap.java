package models;

import java.util.ArrayList;

public class TileMap {
	ArrayList<MapRow> rows = new ArrayList<MapRow>();
	int mapWidth = 50;
	int mapHeight = 50;
	
	
	public TileMap() {
		super();
		
		for (int y = 0; y < mapHeight; y++) {
			
			MapRow currentRow = new MapRow();
			
			for (int x = 0; x < mapWidth; x++) {
				currentRow.columns.add(new MapCell(0));
			}
			
			rows.add(currentRow);
			
		}
		
		generateTest();
	}
	
	public MapRow getRow(int rowIndex) {
		return rows.get(rowIndex);
	}
	
	private void generateTest() {
		// Début de la création

		rows.get(0).columns.get(3).setTileID(2);
		rows.get(0).columns.get(4).setTileID(2);
		rows.get(0).columns.get(5).setTileID(2);
		rows.get(0).columns.get(6).setTileID(2);
		rows.get(0).columns.get(7).setTileID(2);

		rows.get(1).columns.get(3).setTileID(1);
		rows.get(1).columns.get(4).setTileID(1);
		rows.get(1).columns.get(5).setTileID(1);
		rows.get(1).columns.get(6).setTileID(1);
		rows.get(1).columns.get(7).setTileID(1);

		rows.get(2).columns.get(2).setTileID(3);
		rows.get(2).columns.get(3).setTileID(3);
		rows.get(2).columns.get(4).setTileID(3);
		rows.get(2).columns.get(5).setTileID(3);
		rows.get(2).columns.get(6).setTileID(3);
		
		rows.get(2).columns.get(7).setTileID(1);
		rows.get(3).columns.get(2).setTileID(3);
		rows.get(3).columns.get(3).setTileID(1);
		rows.get(3).columns.get(4).setTileID(1);
		rows.get(3).columns.get(5).setTileID(2);
		
		rows.get(3).columns.get(6).setTileID(2);
		rows.get(3).columns.get(7).setTileID(2);
		rows.get(4).columns.get(2).setTileID(3);
		rows.get(4).columns.get(3).setTileID(1);
		rows.get(4).columns.get(4).setTileID(1);

		rows.get(4).columns.get(5).setTileID(2);
		rows.get(4).columns.get(6).setTileID(2);
		rows.get(4).columns.get(7).setTileID(2);
		rows.get(5).columns.get(2).setTileID(3);
		rows.get(5).columns.get(3).setTileID(1);
		
		rows.get(5).columns.get(4).setTileID(1);
		rows.get(5).columns.get(5).setTileID(2);
		rows.get(5).columns.get(6).setTileID(2);
		rows.get(5).columns.get(7).setTileID(2);

		// Fin de la création


	}

	public int getMapWidth() {
		return mapWidth;
	}

	public void setMapWidth(int mapWidth) {
		this.mapWidth = mapWidth;
	}

	public int getMapHeight() {
		return mapHeight;
	}

	public void setMapHeight(int mapHeight) {
		this.mapHeight = mapHeight;
	}
	
	
	
}
