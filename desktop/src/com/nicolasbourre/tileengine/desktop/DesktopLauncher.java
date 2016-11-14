package com.nicolasbourre.tileengine.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nicolasbourre.tileengine.YATE;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = 800;
		config.height = 600;
		
		new LwjglApplication(new YATE(), config);
	}
}
