import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
public class DigitalIde {
   public static void main(String[] args) {
      // JTextField path = new JTextField(25);
      // JTextField file = new JTextField(25);

      // JPanel myPanel = new JPanel();
      // myPanel.add(new JLabel("Path:"));
      // myPanel.add(path);
      // myPanel.add(Box.createHorizontalStrut(50)); // a spacer
      // myPanel.add(new JLabel("Filename:"));
      // myPanel.add(file);

         // int result = JOptionPane.showConfirmDialog(null, myPanel, 
         //          "Please Enter Path and Y Filename", JOptionPane.OK_CANCEL_OPTION);
         // if (result == JOptionPane.OK_OPTION) {         
         //    System.out.println(path.getText()+"/"+file.getText());
      // String s="";
         createAndShowGUI();
      }
   
   private static void createAndShowGUI(){
        //final JFrame frame = new JFrame("JTextArea Demo");        
      /* //  JPanel myPanel = new JPanel(new BorderLayout(5, 5));
       //  JPanel labels = new JPanel(new BorderLayout());
       //  labels.add(new JLabel("Code", SwingConstants.RIGHT),BorderLayout.NORTH);
       // // myPanel.add(new JLabel("Code:",SwingConstants.LEFT),BorderLayout.NORTH);
       //  myPanel.add(labels, BorderLayout.WEST);
       //  JPanel controls = new JPanel(new BorderLayout());        
       //  JTextField code = new JTextField();
       //  controls.add(code, BorderLayout.NORTH);
       //  JScrollPane sp = new JScrollPane(code);
       //  // description.addAncestorListener(new RequestFocusListener(false));
       //  sp.setPreferredSize(new Dimension(700, 500));
       //  controls.add(sp, BorderLayout.CENTER);*/
        //myPanel.setBounds(new Rectangle(15, 25, 90, 15));
        //code.setBounds(new Rectangle(15, 25, 90, 15));
        //code.setSize(70, 100);
        //code.setLocation(0, 0);
        //code.updateUI();
        ////myPanel.add(controls, BorderLayout.CENTER);
        //myPanel.add(Box.createHorizontalStrut(50)); 
        
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // add window listener
        Object[] options = {"Java",
                    "Python3.6",
                    "Python2.7","C","C++","ShellScript", "Exit"};
        //final JPanel panel = new JPanel();
        /* JTextArea textArea = new JTextArea(
                s,
                6, 
                100);*/
        //code.setFont(new Font("Castellar", Font.ITALIC, 16));
        //code.setLineWrap(true);
        //code.setWrapStyleWord(true);
        //code.setOpaque(true);
        //code.setEditable(true);        

        // panel.add(textArea);
         // frame.add(myPanel);
         // frame.pack();
         // frame.setVisible(true);
                JPanel p = new JPanel(new BorderLayout(5, 5));

        JPanel labels = new JPanel(new BorderLayout());
        //labels.add(new JLabel("Name", SwingConstants.RIGHT),BorderLayout.NORTH);
        labels.add(new JLabel("Code:", SwingConstants.LEFT), BorderLayout.NORTH);
        p.add(labels, BorderLayout.WEST);

        JPanel controls = new JPanel(new BorderLayout());
        //JTextField name = new JTextField();
        //controls.add(name, BorderLayout.NORTH);
        JTextArea description = new JTextArea();
        JScrollPane sp = new JScrollPane(description);
        // description.addAncestorListener(new RequestFocusListener(false));
        sp.setPreferredSize(new Dimension(900, 500));
        controls.add(sp, BorderLayout.WEST);
        p.add(controls, BorderLayout.CENTER);
       int result=JOptionPane.showOptionDialog(null, p, 
                "ENTER YOUR CODE HERE", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options, options[6]);
       //if(result == JOptionPane.OK_OPTION) {         
          System.out.println(description.getText()+" "+result);
        //s=JOptionPane.showMessageDialog(null, mypanel, "Customized Message Dialog", JOptionPane.PLAIN_MESSAGE);
        //System.out.println(s);
    }
}
