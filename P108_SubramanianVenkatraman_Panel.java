import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * 
 * SER - 516  Lab 1
 * @author Ganesh Kumar Subramanian Venkatraman
 * Displays a panel with Ganesh Kumar as first name
 * and S V as last name
 * Panel with name and counter variable is displayed in the first row
 * Background colour is displayed white when the input is even
 * and light blue if the input is odd
 * 
 */

public class P108_SubramanianVenkatraman_Panel extends JPanel{  

    
    private JLabel first = new JLabel("Ganesh Kumar");
    private JLabel last = new JLabel("S V");
    private Color color;
    private JLabel counter = new JLabel();

    public P108_SubramanianVenkatraman_Panel(int background) {
        
        // Constructor to set background
        if(background % 2 == 0) {
            color = Color.WHITE;    // When the input is even, white colour will be displayed
            countUpwards();
        }
        
        else {
            color = new Color (173,216,230);     // When the input is odd, light blue colour will be displayed
            countDowndards();
        }
        this.setBackground(color);
        this.setLayout(new GridLayout(3,1));        
        
        Font font = new Font("Papyrus", Font.PLAIN, 15);
        
        first.setFont(font);
        last.setFont(font);
        counter.setFont(font);
        
        first.setHorizontalAlignment(SwingConstants.CENTER);
        last.setHorizontalAlignment(SwingConstants.CENTER);
        counter.setHorizontalAlignment(SwingConstants.CENTER);
        

        this.setBounds(0, 0, 100, 100);
        this.add(first);
        this.add(last);
        this.add(counter);
        this.setVisible(true);
    }
    
    public void countUpwards() {
        
        //Incrementing counter
        
        new Thread() {
            int count = 0;
            
            public void run() {
                while(true) {
                    if(count == 10) {
                        count = 0;
                    }
                
                    counter.setText(new Integer(count).toString());
                    count++;
                
                    try {
                        Thread.sleep(1000);
                    }catch(Exception e) {
                    	System.out.println("Exception occured while incrementing counter. Exception Trace ::"+e.toString());
                    }
                }
            }
        }.start();
    }
    
    public void countDowndards() {
        
        //Decrementing counter.
        
        new Thread() {
            int count = 9;
            
            public void run() {
                while(true) {
                    if(count == -1) {
                        count = 9;
                    }
                
                    counter.setText(new Integer(count).toString());
                    count--;
                    
                    try {
                        Thread.sleep(1000);
                    }catch(Exception e) {
                    	System.out.println("Exception occured while decrementing counter. Exception Trace ::"+e.toString());
                    }
                }
            }
        }.start();
    }
    
}
