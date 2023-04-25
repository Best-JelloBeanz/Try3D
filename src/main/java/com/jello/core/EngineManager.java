package com.jello.core;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

public class EngineManager {
	 public static final long NANOSECOND = 1000000000L;
	 public static final FRAMERATE = 1000;
	 
	 private static int fps;
	 private static float frametime = 1.0f / FRAMERATE;
	 
	 private boolean isRunning;
	 
	 private WindowManager window;
	 private GLFWErrorCallback errorCallback;
	 
	 private void init() throws Exception	{
	 		GLFW.glfwSetErrorCallback(errorCallback = GLFWErrorCallback.createPrint(System.err));
			window = Launcher.getWindow();
	 }
	 
}
