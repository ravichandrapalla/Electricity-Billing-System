import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

import java.awt.*;




public class HeadFrame extends JFrame {
    final private Font myfont = new Font("SansSerif",Font.BOLD,20);
    JTextField TFcountry, TFstate, TFPowerDistributor, TFservicenumber, TFbill;

    private void start(){
        JLabel Labelforcountry = new JLabel("Your Country");
        Labelforcountry.setFont(myfont);

        TFcountry = new JTextField();
        TFcountry.setFont(myfont);

        JLabel Labelforstate = new JLabel("Your State");
        Labelforstate.setFont(myfont);

        TFstate = new JTextField();
        TFstate.setFont(myfont);

        JLabel LabelPowerDistributor = new JLabel("Power Distributor");
        LabelPowerDistributor.setFont(myfont);

        TFPowerDistributor = new JTextField();
        TFPowerDistributor.setFont(myfont);

        JLabel Labelservicenumber = new JLabel("Service-number");
        Labelservicenumber.setFont(myfont);

        TFservicenumber = new JTextField();
        TFservicenumber.setFont(myfont);

        JLabel Labelbill = new JLabel("Your-bill");
        Labelbill.setFont(myfont);

        JLabel TFbill = new JLabel();
        TFbill.setFont(myfont);

        /******************forml-panel******************** */
        JPanel formpanel = new JPanel();
        formpanel.setLayout(new GridLayout(10,1,5,5));
        formpanel.setOpaque(false);
        formpanel.add(Labelforcountry);
        formpanel.add(TFcountry);
        formpanel.add(Labelforstate);
        formpanel.add(TFstate);
        formpanel.add(LabelPowerDistributor);
        formpanel.add(TFPowerDistributor);
        formpanel.add(Labelservicenumber);
        formpanel.add(TFservicenumber);
        formpanel.add(Labelbill);
        formpanel.add(TFbill);

        JButton fetch = new JButton("Fetch-bill");
        fetch.setFont(myfont);

        fetch.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String country = TFcountry.getText();
                String state = TFstate.getText();
                String power_distributor = TFPowerDistributor.getText();
                String Service_number = TFservicenumber.getText();
                Random rand = new Random();
                int upperbound = 2500;
                int outputbill = rand.nextInt(upperbound);
                String bill = Integer.toString(outputbill);
                TFbill.setText(bill);
            }
            
        });
        
        JButton clear = new JButton("Clear");
        clear.setFont(myfont);

        clear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                TFcountry.setText("");
                TFstate.setText("");
                TFPowerDistributor.setText("");
                TFservicenumber.setText("");
                TFbill.setText("");
            }
            
        });

        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(1, 2, 5,5));
        buttonpanel.add(fetch);
        buttonpanel.add(clear);


        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setBackground(new Color(128, 128, 255));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainpanel.add(formpanel,BorderLayout.NORTH);
        mainpanel.add(buttonpanel,BorderLayout.SOUTH);

        
        add(mainpanel);
        setTitle("welcome");
        setSize(600,800);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)  {
        HeadFrame myframe = new HeadFrame();
        myframe.start();
    }
    
}



