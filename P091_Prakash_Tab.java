import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;

/**
 * P091_Prakash_Tab implements the 5x5 tabbed panel grid for group 4.
 * Group from 79-104
 * @author Saurabh Prakash, spraka10@asu.edu
 * @version 1.0
 */
public class P091_Prakash_Tab extends JPanel {

    public P091_Prakash_Tab() {
        this.setLayout(new GridLayout(0, 5));
        //this.add(new P079_Name_Panel);
        this.add(new P080_Nolastname_Panel(1).getPanel()); // addding method to return panel
       // this.add(new P081_Olety_Panel(2));
        this.add(new P082_gspai_panel(3));
       this.add(new P083_Palkar_panel(4));
        this.add(new P084_Pandey_Panel(5));
        this.add(new P085_Panwar_Panel(6));
        this.add(new P086_Parlapalli_Panel(7).parlapalli_Panel());
        this.add(new P087_Parmar_Panel(8));
        this.add(new P088_Patel_Panel(9).returnpanel());
        this.add(new P089_Patel_Panel(10).Ret_Panel_Object());
        //

        this.add(new P094_Vellore_Panel(11).P094_Vellore_Panel());
        this.add(new P095_Rice_Panel(12));
        this.add(new P096_Saifudeen_Panel(13));
        this.add(new P097_Sampath_Panel(14));
        this.add(new P098_Sawant_Panel(15));
        this.add(new P099_Shah_Panel(16));
        this.add(new P100_Shah_Panel(17).getInstance());
        this.add(new P101_Shah_Panel(18));
        this.add(new P102_Sharma_Panel(19));
       this.add(new P103_Sharma_Panel(20));
        //this.add(new P104_Shilimkar_Panel(18)); remove package

    }
}