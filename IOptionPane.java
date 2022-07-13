
import javax.swing.JOptionPane;

class IOptionPane {
    
    public static void main(String args[])
    {    
    String name=JOptionPane.showInputDialog("Enter your name:");
    JOptionPane.showMessageDialog(null, " Hello "+name);
    
    int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null," you are "+age+" years old ");

    double height=Double.parseDouble(JOptionPane.showInputDialog("Enetr your height"));
    JOptionPane.showMessageDialog(null," You are "+height+ " cm tall ");
   }
}