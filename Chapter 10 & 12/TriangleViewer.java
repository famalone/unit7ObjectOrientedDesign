import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TriangleViewer
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    private static JFrame frame;
    private static JLabel label;
    private static TriangleComponent component;
    
    public static void main(String[] args)
    {
        frame = new JFrame();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Triangle!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        component = new TriangleComponent();
        frame.add(component);
        
        MouseListener listener = new ClickListener();
        component.addMouseListener(listener);
        
        frame.setVisible(true);
    }
    
    public class ClickListener implements MouseListener
    {
        public void mouseEntered(MouseEvent event){}
        
        public void mouseExited(MouseEvent event){}
        
        public void mousePressed(MouseEvent event){}
        
        public void mouseReleased(MouseEvent event){}
        
        public void mouseClicked(MouseEvent event)
        {
            int timesClicked = 0;
            timesClicked += event.getClickCount();
            
            if(timesClicked == 1)
            {
                int x1 = event.getX();
                int y1 = event.getY();
            }
        }
    }
}
