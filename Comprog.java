import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comprog extends JFrame implements ActionListener {
    JFrame frame;
    JButton button;
    JTextField MS1;
    JTextField MS2;
    JTextField TA;
    JLabel MS1label;
    JLabel MS2label;
    JLabel TAlabel;
    int ms1score;
    int ms2score;
    int TAscore;
    int result;

    Comprog(){
        button = new JButton("Calculate");
        button.setBounds(60,140,100,20);
        button.addActionListener(this);

        MS1label = new JLabel("Milestone 1: ");
        MS1label.setBounds(40,47,100,20);

        MS2label = new JLabel("Milestone 2: ");
        MS2label.setBounds(40,80,100,20);

        TAlabel = new JLabel("Terminal Assessment: ");
        TAlabel.setBounds(10,110,150,20);

        MS1 = new JTextField();
        MS1.setBounds(120,50,50,20);

        MS2 = new JTextField();
        MS2.setBounds(120,80,50,20);

        TA = new JTextField();
        TA.setBounds(150,110,50,20);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(250,250);
        this.add(MS1);
        this.add(MS1label);
        this.add(MS2label);
        this.add(MS2);
        this.add(TAlabel);
        this.add(TA);
        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ms1score = Integer.parseInt(MS1.getText());
        ms2score = Integer.parseInt(MS2.getText());
        TAscore = Integer.parseInt(TA.getText());
        result = ms1score + ms2score+ TAscore;

        if(e.getSource()==button){
            if(ms1score>25|| ms2score>40|| TAscore>35){
                JOptionPane.showMessageDialog(null,"Grade should not exceed the maximum"+"");
            }
            else{
                JOptionPane.showMessageDialog(null,"Your grade is: "+result);
            }

        }
    }

    public static void main(String[] args) {
        new Comprog();
    }
}
