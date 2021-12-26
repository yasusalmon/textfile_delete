import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;


class delete extends JFrame implements ActionListener{
  public static void main(String args[]){
    delete frame = new delete("delete");
    frame.setVisible(true);
  }

  delete(String title){
    setTitle(title);
    setBounds(100,100,600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    Container contentPane = getContentPane();
    contentPane.add(p,BorderLayout.CENTER);

    try{

      JButton[] button = new JButton[8];
      JLabel[] text = new JLabel[10000];


      File file = new File("input.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
      String[] data = new String[10000];
      int data_line = 0;
      //data read and set and output
      while((data[data_line] = br.readLine()) != null){
        System.out.println(data[data_line]);
        if(data_line < 8){
          text[data_line] = new JLabel(data[data_line]);
          text[data_line].setFont(new Font( "‚l‚r ƒSƒVƒbƒN" , Font.BOLD, 15));
          button[data_line] = new JButton("Finish");
          p.add(text[data_line]);
          p.add(button[data_line]);
        }
        data_line++;
      }
      //data_line output
      System.out.println(data_line);
      br.close();
    }catch(IOException e){
      System.out.println("no file");
      return;
    }


  }

  public void actionPerformed(ActionEvent e){
    System.out.println("u");
  }
}
