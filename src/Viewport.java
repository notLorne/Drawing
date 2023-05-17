import java.awt.*;
import javax.swing.*;

public class Viewport {
    
    JWindow mainWindow;

    Viewport() {
        mainWindow = new JWindow();
        mainWindow.setSize(600, 600);
        
        mainWindow.setVisible(true);
    }

}
