import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class calculator {
    public static void main (String[] args) {

        JFrame frame = new JFrame("Math Operation");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel num_1 = new JLabel("NUMBER 1: ");
        panel.add(num_1);
        JTextField num1Field = new JTextField(10);
        panel.add(num1Field);

        JLabel num_2 = new JLabel("NUMBER 2: ");
        panel.add(num_2);
        JTextField num2Field = new JTextField(10);
        panel.add(num2Field);

        JLabel result_Label = new JLabel("Result: ");
        panel.add(result_Label);

        JButton add_Button = new JButton("Add");
        panel.add(add_Button);

        JButton sub_Button = new JButton("Sub");
        panel.add(sub_Button);

        add_Button.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = MathOperation.add(num1, num2);
                    result_Label.setText("Result: " + result);
                } catch(NumberFormatException nfe){
                    result_Label.setText("Ivalid Input");
                }

            }
        });

        sub_Button.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = MathOperation.sub(num1, num2);
                    result_Label.setText("Result: "+ result);
                }catch(NumberFormatException nfe){
                    result_Label.setText("Invalid Input");
                }
            }
        });



        frame.setVisible(true);

    }
}