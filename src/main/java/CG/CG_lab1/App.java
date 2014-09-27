package CG.CG_lab1;

import javax.media.opengl.GLCanvas;
import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GLCanvas canvas = new GLCanvas();
    	JFrame frame = new JFrame();         // or AWT's Frame
    	frame.getContentPane().add(canvas);
    }
}
