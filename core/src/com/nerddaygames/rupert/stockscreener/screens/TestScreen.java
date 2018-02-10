package com.nerddaygames.rupert.stockscreener.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.nerddaygames.rupert.stockscreener.StockScreenerMain;

/**
 * Created by antonio on 2/10/18.
 */

public class TestScreen implements Screen
{
    String tag = getClass().getName();
    StockScreenerMain stockScreener;
    OrthographicCamera camera;
    StretchViewport viewport;
    Texture img;

    /*
    Gdx.app.log("MyTag", "my informative message");
    Gdx.app.error("MyTag", "my error message", exception);
    Gdx.app.debug("MyTag", "my debug message");
     */

    public TestScreen(StockScreenerMain stockScreener)
    {
        this.stockScreener = stockScreener;
    }

    @Override
    public void show()
    {
        camera = new OrthographicCamera();
        viewport = new StretchViewport(100, 100, camera);
        img = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stockScreener.batch.begin();
        stockScreener.batch.draw(img, 0, 0);
        stockScreener.batch.end();
    }

    @Override
    public void resize(int width, int height)
    {
        viewport.update(width, height);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void hide()
    {

    }

    @Override
    public void dispose()
    {
        Gdx.app.log(tag, "Disposing TestScreen");
        img.dispose();
    }
}
