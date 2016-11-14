package models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public final class Tile {
	//static final int TILESIZE = 32;
	static Texture tileSetTexture;
	static int tileWidth = 33;
	static int tileHeight = 27;
	static int tileStepX = 52;
	static int tileStepY = 14;
	static int oddRowXOffset = 26;

	public static int getTileWidth() {
		return tileWidth;
	}

	public static void setTileWidth(int tileWidth) {
		Tile.tileWidth = tileWidth;
	}

	public static int getTileHeight() {
		return tileHeight;
	}

	public static void setTileHeight(int tileHeight) {
		Tile.tileHeight = tileHeight;
	}



	public static Rectangle getSourceRectangle(int tileIndex) {
		int tileY = tileIndex / (tileSetTexture.getWidth() / tileWidth);
		int tileX = tileIndex % (tileSetTexture.getWidth() / tileWidth);

		return new Rectangle(tileX * tileWidth, tileY * tileHeight, tileWidth, tileHeight);

		/** Vieille itération */
		//return new Rectangle(tileIndex * TILESIZE, 0, TILESIZE, TILESIZE);
		
	}

	public static Texture getTileSetTexture() {
		return tileSetTexture;
	}

	public static void setTileSetTexture(Texture tileSetTexture) {
		Tile.tileSetTexture = tileSetTexture;
	}
}
