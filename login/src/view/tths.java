package view;
import java.awt.*;
import javax.swing.*;
import controller.*;
import java.awt.event.*;
public class tths extends JFrame implements ActionListener {
    public static String idhs ;
    public static String namehs;
    public static String gtstr;
    public static String namsinhhs;
    public static String diemuutien;
    public static String nguvan;
    public static String toan ;
    public static String tienganh ;
    public static int ktra ;
    JLabel id = new JLabel();
    JLabel ten = new JLabel();
    JLabel gt = new JLabel();
    JLabel namsinh = new JLabel();
    JLabel diemuutienlb = new JLabel();
    JLabel nguvanlb = new JLabel();
    JLabel toanlb = new JLabel();
    JLabel tienganhlb = new JLabel();
    JButton undoo , timtiep = new JButton();
    JLabel anh = new JLabel();
    JLabel title = new JLabel();
    JFrame hs = new JFrame();
    public tths(){
        ktra=0;
        new timhs();
        Font font = new Font("Times new Roman", Font.BOLD , 19);
        JPanel con = new JPanel();
         con.setBackground(new java.awt.Color(255,255,255));
         con.setLayout(null);
         title = new JLabel("Thong tin hoc sinh");
         title.setFont(new Font("Times New Roman", Font.BOLD,26));
         title.setBounds(130, 0, 400, 100);
         Icon iconn = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Untitled.png");
         anh = new JLabel(iconn);
         anh.setBounds(0, 0, 128, 128);
         con.add(title);
         con.add(anh);
         id = new JLabel("ID hoc sinh :"+idhs);
         id.setFont(font);
         id.setBounds(130, 80, 300, 100);
         ten = new JLabel("Ten  :"+namehs);
         ten.setFont(font);
         ten.setBounds(130, 130, 300, 100);
         gt = new JLabel("Gioi tinh  :"+gtstr);
         gt.setFont(font);
         gt.setBounds(130, 180, 300, 100);
         namsinh = new JLabel("Nam sinh :"+namsinhhs);
         namsinh.setFont(font);
         namsinh.setBounds(130, 230, 300, 100);
         diemuutienlb = new JLabel("diem uu tien :"+diemuutien);
         diemuutienlb.setFont(font);
         diemuutienlb.setBounds(130, 280, 300, 100);
         nguvanlb = new JLabel("Phong thi ngu van :"+nguvan);
         nguvanlb.setFont(font);
         nguvanlb.setBounds(130, 330, 300, 100);
         toanlb = new JLabel("phong thi toan :"+toan);
         toanlb.setFont(font);
         toanlb.setBounds(130, 380, 300, 100);
         tienganhlb = new JLabel("phong thi tieng anh :"+tienganh);
         tienganhlb.setFont(font);
         tienganhlb.setBounds(130, 430, 300, 100);
              Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
            undoo = new JButton("tro lai");
            undoo.setBackground(new java.awt.Color(185, 255, 255));
               undoo.setIcon(icon);
               undoo.addActionListener(this);
               undoo.setBounds(50, 510, 170, 50);
               Icon iconnn = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\plus-icon.png");
               timtiep = new JButton("tim hs khac");
               timtiep.setBackground(new java.awt.Color(185, 255, 255));
                  timtiep.setIcon(iconnn);
                  timtiep.addActionListener(this);
                  timtiep.setBounds(250, 510, 170, 50);
                  con.add(timtiep);
               con.add(id);
               con.add(ten);
               con.add(gt);
               con.add(namsinh);
               con.add(diemuutienlb);
               con.add(nguvanlb);
               con.add(toanlb);
               con.add(tienganhlb);
               con.add(undoo);
               hs = new JFrame();
               hs.add(con);
               hs.setTitle("xem thong tin hoc sinh");
               hs.setSize(500, 600);
               hs.setLocationRelativeTo(null);
               hs.setUndecorated(true);
               hs.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
               hs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if(ktra==1) {
              hs.setVisible(true);
    }
    if(ktra==0){
        hs.setVisible(false);
        setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "khong tim duoc hoc sinh co id : "+ viewAdmin.tkhs ,"find error",
        JOptionPane.ERROR_MESSAGE);
        new nhapidtkhs();
    }
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("tro lai")){
            hs.setVisible(false);
        }
        else  if(e.getActionCommand().equals("tim hs khac")){
            hs.dispose();
            new nhapidtkhs();
        }
    }
}
