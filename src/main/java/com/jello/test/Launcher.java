package com.jello.test;

import com.jello.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {
	
	private static WindowManager window;
	
	public static void main(String[] args) {
		System.out.println(Version.getVersion());
		window = new WindowManager("JELLO ENGINE", 1600, 900, false);
		
		while(!window.windowSHouldClose()) {
			window.update();
		}
		window.cleanup();
	}
	public static WindowManager getWindow() {
		return window;
	}
}
