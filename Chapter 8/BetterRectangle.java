import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int x, int y, int width, int height)
    {
        super(x, y, width, height);
    }
    
    public double getPerimeter()
    {
         double height = this.getHeight();
         double width = this.getWidth();
         double perim = (width*2) + (height*2);
         return perim;
    }
    
    public double getArea()
    {
        double height = this.getHeight();
        double width = this.getWidth();
        double area = height*width;
        return area;
    }
}
