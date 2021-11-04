import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import java.lang.Math;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  public void removeRed()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      pixelArray[i].setRed(0);
    }
    this.repaint();
  }
  
  public void maxRed()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      pixelArray[i].setRed(255);
    }
    this.repaint();
  }
  
  public void removeGreen()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      pixelArray[i].setGreen(0);
    }
    this.repaint();
  }
  
  public void maxGreen()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      pixelArray[i].setGreen(255);
    }
    this.repaint();
  }
  
  public void removeBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      pixelArray[i].setBlue(0);
    }
    this.repaint();
  }
  
   public void maxBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      pixelArray[i].setBlue(255);
    }
    this.repaint();
  }
  
  public void decreaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      Pixel pixelObj = pixelArray[i];
      int red = pixelObj.getRed();
      red = (int)(red * 0.75);
      pixelObj.setRed(red);
    }
    this.repaint();
  }
  
  public void increaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      Pixel pixelObj = pixelArray[i];
      int red = pixelObj.getRed();
      red = (int)(red * 1.2);
      pixelObj.setRed(red);
    }
    this.repaint();
  }
  
  public void decreaseGreen()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      Pixel pixelObj = pixelArray[i];
      int green = pixelObj.getGreen();
      green = (int)(green * 0.75);
      pixelObj.setRed(green);
    }
    this.repaint();
  }
  
  public void increaseGreen()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      Pixel pixelObj = pixelArray[i];
      int green = pixelObj.getGreen();
      green = (int)(green * 1.2);
      pixelObj.setRed(green);
    }
    this.repaint();
  }
  
  public void decreaseBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      Pixel pixelObj = pixelArray[i];
      int blue = pixelObj.getBlue();
      blue = (int)(blue * 0.75);
      pixelObj.setRed(blue);
    }
    this.repaint();
  }
  
  public void increaseBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      Pixel pixelObj = pixelArray[i];
      int blue = pixelObj.getBlue();
      blue = (int)(blue * 1.2);
      pixelObj.setRed(blue);
    }
    this.repaint();
  }
   
  public void sunset()
  {
    decreaseBlue();
    decreaseGreen();
  }
  
  public void negative()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      int red = pixelArray[i].getRed();
      int green = pixelArray[i].getGreen();
      int blue = pixelArray[i].getBlue();
      pixelArray[i].setRed(255 - red);
      pixelArray[i].setGreen(255 - green);
      pixelArray[i].setBlue(255 - blue);
    }
    this.repaint();
  }
  
  public void greyscale()
  {
    Pixel[] pixelArray = this.getPixels();
    for (int i = 0; i < pixelArray.length; i++)
    {
      int average = (int) (pixelArray[i].getRed() + pixelArray[i].getGreen() + pixelArray[i].getBlue())/3;
      Color gray = new Color(average, average, average);
      pixelArray[i].setColor(gray);
    }
    this.repaint();
  }
  
  public void makeWhitePixel()
  {
    //Got pixel at (2,2) instead of (0,0) so it's easier to see.
    Pixel topLeftPixel = this.getPixel(2,2);
    topLeftPixel.setRed(255);
    topLeftPixel.setGreen(255);
    topLeftPixel.setBlue(255);
    this.repaint();
  }
  
  public void makeYellowPixel()
  {
    //get another pixel to change it to yellow
    Pixel topLeftPixel = this.getPixel(20,20);
    Color white = new Color (255,255,0);
    topLeftPixel.setColor(white);
    this.repaint();
  }
  
  public void makeTomatoPixel()
  {
    //get another pixel and change it to tomato color.
    Pixel topLeftPixel = this.getPixel(20,30);
    Color tomato = new Color(255, 99, 71); //from RapidTables
    topLeftPixel.setColor(tomato);
    this.repaint();
  }
    
  public void drawLunchBox(int y) 
  {
    Graphics g = this.getGraphics();
    g.setColor (Color.RED);
    Polygon kite = new Polygon();
    kite.addPoint(200,115 - y);
    kite.addPoint(230,115 - y);
    kite.addPoint(230,125 - y);
    kite.addPoint(200,125 - y);
    g.fillPolygon(kite);
  }
    
  
  public void drawOrange(int x, int y)
  {
    Graphics g = this.getGraphics();
    Color orange = new Color (222, 193, 35);
    g.setColor(orange);
    g.fillOval(x, y, 7, 7);
  }
  
  public void drawLunchLayer(int x, int y)
  {
    Graphics g = this.getGraphics();
    //orange color
    Color layer = new Color (254, 215, 0);
    g.setColor(layer);
    g.fillRect(x, y, 30, 3);
  }
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
 
  public static void main(String[] args) 
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     //all fruits on trees
     pictObj.drawOrange(160, 60);
     pictObj.drawOrange(180, 70);
     pictObj.drawOrange(190, 45);
     pictObj.drawOrange(170, 35);
     pictObj.drawOrange(175, 45);
     pictObj.drawOrange(165, 40);
     pictObj.drawOrange(185, 55);
     //lunch boxes + layer in between
     pictObj.drawLunchBox(0);
     pictObj.drawLunchLayer(200, 117);
    pictObj.drawLunchBox(10);
     pictObj.repaint();
  }
  
} // this } is the end of class Picture, put all new methods before this
 