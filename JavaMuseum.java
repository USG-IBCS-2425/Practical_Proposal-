import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaMuseum {
  private JFrame startFrame;
  private JLabel welcomeText;

  public JavaMuseum() {
    startFrame = new JFrame("Image Example");
    startFrame.setSize(900, 700);
    welcomeText = new JLabel("Welcome to 2024", JLabel.CENTER);
    welcomeText.setBounds(300, 100, 200, 40);

    startFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }        
        });

        JButton aButton = new JButton("Concert");
        aButton.setActionCommand("Concert");
        aButton.addActionListener(new ButtonClickListener());
        aButton.setBounds(150,200,100,100);
        startFrame.add(aButton);

        JButton bButton = new JButton("Japan");
        bButton.setActionCommand("Japan");
        bButton.addActionListener(new ButtonClickListener());
        bButton.setBounds(250,200,100,100);
        startFrame.add(bButton);

        JButton cButton = new JButton("AnotherConcert");
        cButton.setActionCommand("AnotherConcert");
        cButton.addActionListener(new ButtonClickListener());
        cButton.setBounds(350,200,100,100);
        startFrame.add(cButton);

        JButton dButton = new JButton("Boston");
        dButton.setActionCommand("Boston");
        dButton.addActionListener(new ButtonClickListener());
        dButton.setBounds(450,200,100,100);
        startFrame.add(dButton);

        JButton eButton = new JButton("AirbnbParty");
        eButton.setActionCommand("AirbnbParty");
        eButton.addActionListener(new ButtonClickListener());
        eButton.setBounds(550,200,100,100);
        startFrame.add(eButton);

        startFrame.add(welcomeText);
        startFrame.setLayout(null);
        startFrame.setVisible(true);

    
  }

  public static void main(String[] args) {
    JavaMuseum mWin = new JavaMuseum();
  }

  private class ButtonClickListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();

      if(command.equals("Concert")){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        ImageIcon icon = new ImageIcon("Concert.png");
        JLabel lab = new JLabel(icon);
        f.add(p);
        p.add(lab);
        f.pack();
        f.setVisible(true);
      }

      if(command.equals("Japan")){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        ImageIcon icon = new ImageIcon("Japan.png");
        JLabel lab = new JLabel(icon);
        f.add(p);
        p.add(lab);
        f.pack();
        f.setVisible(true);
      }

      if(command.equals("AnotherConcert")){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        ImageIcon icon = new ImageIcon("AnotherConcert.png");
        JLabel lab = new JLabel(icon);
        f.add(p);
        p.add(lab);
        f.pack();
        f.setVisible(true);
      }

      if(command.equals("Boston")){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        ImageIcon icon = new ImageIcon("Boston.png");
        JLabel lab = new JLabel(icon);
        f.add(p);
        p.add(lab);
        f.pack();
        f.setVisible(true);
      }

      if(command.equals("AirbnbParty")){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        ImageIcon icon = new ImageIcon("AirbnbParty.png");
        JLabel lab = new JLabel(icon);
        f.add(p);
        p.add(lab);
        f.pack();
        f.setVisible(true);
      }
    }
  }
}