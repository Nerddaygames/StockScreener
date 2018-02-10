package com.nerddaygames.rupert.stockscreener;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nerddaygames.rupert.stockscreener.screens.TestScreen;

public class StockScreenerMain extends Game
{
    String tag = getClass().getName();
    public SpriteBatch batch;

    @Override
    public void create()
    {
        batch = new SpriteBatch();
        setScreen(new TestScreen(this));
    }

    @Override
    public void dispose()
    {
        Gdx.app.log(tag, "Disposing StockScreenerMain");
        super.dispose();
        batch.dispose();
    }
}
