import java.awt.Color;
import javax.swing.JFrame;


public class Main extends Gameplay
{
   public static void main(String str[])
   {
      JFrame obj = new JFrame();
	   Gameplay gameplay = new Gameplay();
      
	   obj.setBounds(0,10,905,700);
	   obj.setBackground(Color.DARK_GRAY);
	   obj.setResizable(false);
	   obj.setVisible(true);
	   obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(gameplay);
      	   
   
   
   
   }



}