package models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public final class Tile {
	static final int TILESIZE = 32;
	static Texture tileSetTexture;
	
	public static Rectangle getSourceRectangle(int tileIndex) {
		
		return new Rectangle(tileIndex * TILESIZE, 0, TILESIZE, TILESIZE);
		
	}

	public static Texture getTileSetTexture() {
		return tileSetTexture;
	}

	public static void setTileSetTexture(Texture tileSetTexture) {
		Tile.tileSetTexture = tileSetTexture;
	}
}
