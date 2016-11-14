package com.nicolasbourre.tileengine;

import models.Camera;
import models.Tile;
import models.TileMap;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class YATE extends ApplicationAdapter {
    SpriteBatch batch;
    TileMap map = new TileMap();
    int tileSize = 32;

    int carreLargeur;
    int carreHauteur;

    @Override
    public void create () {
        batch = new SpriteBatch();
        Tile.setTileSetTexture (new Texture("part2_tileset.png"));

        carreLargeur = Gdx.graphics.getWidth() / Tile.getTileWidth() + 1;
        carreHauteur = Gdx.graphics.getHeight() / Tile.getTileHeight() + 2;

    }

    @Override
    public void render () {
        update();
        draw();

    }

    private void update() {
        if (Gdx.input.isKeyPressed(Keys.ESCAPE)) {
            Gdx.app.exit();
        }

        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            Camera.setLocation(MathUtils.clamp(
                    Camera.getLocation().x - 2, 0, (map.getMapWidth() - carreLargeur) * tileSize),
                    Camera.getLocation().y);
        }

        if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
            Camera.setLocation(MathUtils.clamp(
                    Camera.getLocation().x + 2, 0, (map.getMapWidth() - carreLargeur) * tileSize),
                    Camera.getLocation().y);
        }

        if (Gdx.input.isKeyPressed(Keys.UP)) {
            Camera.setLocation(Camera.getLocation().x,
                    MathUtils.clamp(
                            Camera.getLocation().y + 2, 0, (map.getMapHeight() - carreHauteur) * tileSize));
        }

        if (Gdx.input.isKeyPressed(Keys.DOWN)) {
            Camera.setLocation(Camera.getLocation().x,
                    MathUtils.clamp(
                            Camera.getLocation().y - 2, 0, (map.getMapHeight() - carreHauteur) * tileSize));
        }
    }

    private void draw() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        /**
         * Calculs pour le premier carr en haut  gauche
         */
        Vector2 firstSquare = new Vector2(Camera.getLocation().x / (float)Tile.getTileWidth(), Camera.getLocation().y / (float)Tile.getTileHeight());
        int firstX = (int) firstSquare.x;
        int firstY = (int) firstSquare.y;

        /**
         * Calcul pour le dcalage pour la camera pour les cts
         */
        Vector2 squareOffset = new Vector2(Camera.getLocation().x % Tile.getTileWidth(), Camera.getLocation().y % Tile.getTileHeight());
        int offsetX = (int)squareOffset.x;
        int offsetY = (int)squareOffset.y;


        batch.begin();

        for (int y = 0; y < carreHauteur; y++) {
            int positionY = (y * Tile.getTileHeight()) - offsetY;

            for (int x = 0; x < carreLargeur; x++) {

                for (int tileId : map.getRow(y + firstY).getCell(x + firstX).getBaseTiles()) {

                    // Va chercher le rectangle de la tuile à afficher
                    Rectangle srcRect = Tile.getSourceRectangle(tileId);

                    batch.draw(Tile.getTileSetTexture(),
                            (x * Tile.getTileWidth()) - offsetX, positionY,
                            (int)srcRect.x, (int)srcRect.y,
                            (int)srcRect.width, (int)srcRect.height);
                }

            }
        }

        batch.end();
    }
}