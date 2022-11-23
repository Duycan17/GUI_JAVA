package View;

import Controller.LastButtonListener;
import Model.LastButtonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LastButtonView extends JFrame {
    private LastButtonModel lastButtonModel;
    private JLabel jLabel;

    public LastButtonView(){
        this.lastButtonModel = new LastButtonModel();
        this.init();
    }

    private void init() {

        this.setTitle("Last Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        JPanel jpanel_Center = new JPanel();
        jpanel_Center.setLayout(new GridLayout(2,2));

        LastButtonListener lastButtonListener = new LastButtonListener(this);
        Font font = new Font("Arial",Font.BOLD,20);
        JButton jButton_1 = new JButton("1");
        jButton_1.setFont(font);
        jButton_1.addActionListener(lastButtonListener);
        JButton jButton_2 = new JButton("2");
        jButton_2.setFont(font);
        jButton_2.addActionListener(lastButtonListener);
        JButton jButton_3 = new JButton("3");
        jButton_3.setFont(font);
        jButton_3.addActionListener(lastButtonListener);
        JButton jButton_4 = new JButton("4");
        jButton_4.addActionListener(lastButtonListener);
        jButton_4.setFont(font);
        jpanel_Center.add(jButton_1);
        jpanel_Center.add(jButton_2);
        jpanel_Center.add(jButton_3);
        jpanel_Center.add(jButton_4);

        JPanel jpanel_footer = new JPanel();
        jLabel = new JLabel("----");
        jLabel.setFont(font);
        jpanel_footer.add(jLabel);


        this.setLayout(new BorderLayout());

        this.add(jpanel_Center,BorderLayout.CENTER);
        this.add(jpanel_footer,BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void changeTo_1(){
        this.lastButtonModel.setValue(1);
        jLabel.setText("WHY"+this.lastButtonModel.getValue());
    }
    public void changeTo_2(){
        this.lastButtonModel.setValue(2);
        jLabel.setText("WHY"+this.lastButtonModel.getValue());
    }
    public void changeTo_3(){
        this.lastButtonModel.setValue(3);
        jLabel.setText("WHY"+this.lastButtonModel.getValue());
    }
    public void changeTo_4(){
        this.lastButtonModel.setValue(4);
        jLabel.setText("WHY"+this.lastButtonModel.getValue());
    }
}
