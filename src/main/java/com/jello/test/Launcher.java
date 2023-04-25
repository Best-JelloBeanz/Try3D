package com.jello.test;

import com.jello.core.utils.Constants;
import com.jello.core.WindowManager;
import com.jello.core.EngineManager;

public class Launcher {
	
	private static WindowManager window;
	private static EngineManager engine;

	public static void main(String[] args) {
		window = new WindowManager(Constants.TITLE, 1600, 900, false);
		engine = new EngineManager();
		try {
			engine.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static WindowManager getWindow() {
		return window;
	}
}
