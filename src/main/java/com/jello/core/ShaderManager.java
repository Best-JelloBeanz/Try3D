package com.jello.core;

import org.lwjgl.opengl.GL20;

public class ShaderManager {

    private final int programID;
    private int vertexShaderID, fragmentShaderID;

     public ShaderManager() throws Exception {
         programID = GL20.glCreateProgram();
         if(programID == 0) {
             throw new Exception("Could not create shader");
         }
     }

     public void createVertexShader(String shaderCode) throws Exception {
         vertexShaderID = createShader(shaderCode, GL20.GL_VERTEX_SHADER);
     }

    public void createFragmentShader(String shaderCode) throws Exception {
        fragmentShaderID = createShader(shaderCode, GL20.GL_FRAGMENT_SHADER);
    }

     public void createShader(String shaderCode, int shaderType) throws Exception {
        int shaderID = GL20.glCreateShader(shaderType);
        if(shaderID == 0) {
            throw new Exception("Error creating shader. Type : " + shaderType);
        }
        GL20.glShaderSource(shaderID, shaderCode);
        GL20.glCompileShader(shaderID);

        if(GL20.glGetShaderi(shaderID, GL20.GL_COMPILE_STATUS) == 0) {
            throw new Exception("Error compiling shader code: TYPE:: " + shaderType);
        }

     }
}
