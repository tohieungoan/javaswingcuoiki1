package view;
import javax.swing.*;
import javax.swing.KeyStroke;
import java.awt.*;
import java.awt.event.*;
public class teacherview extends JFrame implements ActionListener{
private JFrame window;
private JMenuBar menu;
private JMenu hethong;
private JMenu quanli;
private JMenu trogiup;
private JMenuItem dangxuat;
private JMenuItem thoat;
private JMenuItem chamdiem;
private JMenuItem note;
private JMenuItem chinhsuatt;
private JMenuItem help;
private JMenuItem more;
private static  String button;
public static int dieuhuonghs;
public teacherview() {
 createwindowadmin();
}
public void createwindowadmin () {
  window = new JFrame();
  menu();
  ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\anime-sky-4k-0f.jpg"));
 JLabel bg = new JLabel("",img,JLabel.CENTER);
  bg.setBounds(0, 0, 1050, 700);
  window.add(bg);
  window.setUndecorated(true);
  window.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
  window.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\School-icon.png"));
  window.setTitle("giao dien danh cho giao vien");
  window.setSize(1050, 700);
  window.setResizable(false);
  window.setLocationRelativeTo(null);
  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  window.setVisible(true);
}
public void menu (){
   // menu = new JMenuBar();
    menu=new JMenuBar(){

      public void paintComponent(Graphics g)
    
      {
    
      g.drawImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\anime-sky-4k-0f.jpg"),0,0,this);
    
      }
    
     };
    menu.setBorderPainted(true);
    menu.setBackground(Color.white);
     menu.setBorder(null);
 
    window.setJMenuBar(menu);
    hethong = new JMenu("He thong");
    hethong.setForeground(Color.white);
    hethong.addActionListener(this);
    quanli = new JMenu("Quan li hoc sinh");
    quanli.setForeground(Color.white);
    trogiup = new JMenu("Tro giup");
    trogiup.setForeground(Color.white);
  hethong.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\system-icon.png"));
  quanli.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\student-icon.png"));
  trogiup.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\helpview-icon.png"));
  menu.add(hethong);
  menu.add(quanli);
  menu.add(trogiup);
  JMenuItem dsvipham = new JMenuItem("Danh sach vi pham");
dsvipham.addActionListener(this);
dsvipham.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
 dangxuat = new JMenuItem("dang xuat", KeyEvent.VK_L);
dangxuat.addActionListener(this);
dangxuat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,InputEvent.CTRL_DOWN_MASK));
 thoat = new JMenuItem("thoat" , KeyEvent.VK_X);
thoat.addActionListener(this);
thoat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
chamdiem = new JMenuItem("Nhap diem" , KeyEvent.VK_A);
chamdiem.addActionListener(this);
chamdiem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_DOWN_MASK));
note = new JMenuItem("ghi chu hoc sinh" , KeyEvent.VK_R);
note.addActionListener(this);
note.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_DOWN_MASK));
 chinhsuatt = new JMenuItem("chinh sua thong tin hoc sinh", KeyEvent.VK_E);
chinhsuatt.addActionListener(this);
chinhsuatt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
 help = new JMenuItem("Help" , KeyEvent.VK_H);
help.addActionListener(this);
help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_DOWN_MASK));
 more = new JMenuItem("More" , KeyEvent.VK_M);
more.addActionListener(this);
more.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,InputEvent.CTRL_DOWN_MASK));
thoat.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Close-icon.png"));
help.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Help-icon.png"));
more.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\about-icon.png"));
chinhsuatt.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Edit-icon.png"));
note.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Notes-icon.png"));
chamdiem.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\exam2.jpg"));
dangxuat.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Logout-icon.png"));
dsvipham.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\removeicon.png"));
trogiup.add(help);
trogiup.addSeparator();
trogiup.add(more);
quanli.addSeparator();
quanli.add(chamdiem);
quanli.addSeparator();
quanli.add(note);
quanli.addSeparator();
quanli.add(chinhsuatt);
quanli.addSeparator();
quanli.add(dsvipham);
hethong.addSeparator();
hethong.add(dangxuat);
hethong.addSeparator();
hethong.add(thoat);
}
@Override
public void actionPerformed(ActionEvent e) {

   button = e.getActionCommand();
  if(button.equals("dang xuat")){
    window.setVisible(false);
    new login();
  }
  else if(button.equals("thoat")){
    System.exit(0);
  }
  else if (button.equals("Help")){
    new helpview();
  }
  else if (button.equals("More")){
    new Moreview();
  }
  else if(button.equals("ghi chu hoc sinh")){
    dieuhuonghs =1;
    new nhapidtkhs();
  }
  else if(button.equals("Nhap diem")){
    new nhapdiem();
  }
  else if(button.equals("chinh sua thong tin hoc sinh")){
    new thongtinhs();
  }
  else if (button.equals("Danh sach vi pham")){
    dieuhuonghs =1;
    new thongtinhs2();
  }
}
}
