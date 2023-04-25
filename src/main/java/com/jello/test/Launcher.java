package com.jello.test;

import com.jello.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {
    public static void main(String[] args){
        System.out.println(Version.getVersion());
		WindowManager window = new WindowManager("JELLO ENGINE", 1600, 900, false);
		window.init();
		
		while(!window.windowSHouldClose()) {
			window.update();
		}
		window.cleanup();
    }
}
