package io.mpm.hack.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.mpm.hack.Hack;
import io.mpm.hack.Hack2;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Hack!";
		config.width = 800;
		config.height = 400;
		new LwjglApplication(new Hack2(), config);
	}
}
