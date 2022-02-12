import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class RadioButton1 extends JFrame {
    private JTextField textField = new JTextField(16);
    private ButtonGroup group = new ButtonGroup();
    private JRadioButton
    radiobutton1 = new JRadioButton("java",false),
    radiobutton2 = new JRadioButton("c++",false),
    radiobutton3 = new JRadioButton("Python",false); 


    private ActionListener actionListener = new ActionListener (){
        public void actionPerformed(ActionEvent event){
            textField.setText("I love" + ((JRadioButton)event.getSource()).getText());
        

        }
    };
    private ButtonGroup groups = new ButtonGroup();

    public RadioButton1(){
        radiobutton1.addActionListener(actionListener);
        radiobutton2.addActionListener(actionListener);
        radiobutton3.addActionListener(actionListener);
        groups.add(radiobutton1);
        groups.add(radiobutton1);
        groups.add(radiobutton3);
        
        textField.setEditable(false);
        setLayout(new FlowLayout());

        add(textField);
        add(radiobutton1);
        add(radiobutton2);
        add(radiobutton3);
    }
    public static void main(String[] args) {
        setFrame(new RadioButton1(),225,150);
    }

    public static void setFrame(final JFrame frame,final int width,final int height){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                frame.setTitle(frame.getClass().getSimpleName());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(width,height);
                frame.setVisible(true);
            }
        });
    }

    
}
