package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class reload2 {
    public reload2(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
        viewAdmin.vTitle.clear();
        viewAdmin.vData.clear();
        if(selectchoose.sapxep==0){
        ResultSet rst = stm.executeQuery("select * from student;");
        ResultSetMetaData rstmeta = rst.getMetaData();
        int num = rstmeta.getColumnCount();
        for(int i =1;i<=num;i++){
            viewAdmin.vTitle.add(rstmeta.getColumnLabel(i));
        }
        while(rst.next()){
            Vector row = new Vector(num);
            for(int i =1;i<=num;i++)
            row.add(rst.getString(i));
            viewAdmin.vData.add(row);

        }
        rst.close();
        con.close();
    }
   else if(selectchoose.sapxep==1){
    String tens = "";
    String tenlops ="";
    String diemuutiens = "";
    String gt = "";
    {
    if(selectchoose.tenst.equals("giam dan")){
        tens =" order by ten desc ";
    }
    else if(selectchoose.tenst.equals("tang dan")){
        tens =" order by ten asc ";
    }
}{
    if(selectchoose.lopst.equals("tat ca")){
        if(selectchoose.gt.equals("tat ca")){
            gt = "";
    }
    else if (selectchoose.gt.equals("nam")){
                gt = "where gioitinh = true"; 
    }
    else  if (selectchoose.gt.equals("nu")){
        gt = "where gioitinh = false"; 
    }
    tenlops = "" + gt;
}

    else {   
        if(selectchoose.gt.equals("tat ca")){
        gt = "";
}
else if (selectchoose.gt.equals("nam")){
    gt = "and gioitinh = true"; 
}
else {
gt = "and gioitinh = false"; 
}
        tenlops ="where phongthi" +selectchoose.monst +" = '"+selectchoose.lopst +"'" + gt;
}
}
{
    if(selectchoose.diemuutienst.equals("tat ca")){
        diemuutiens = "";
        
    }
    else if(selectchoose.diemuutienst.equals("giam dan")){
        diemuutiens =" , diemuutien desc ;";
    }
    else if(selectchoose.diemuutienst.equals("tang dan")){
        diemuutiens =", diemuutien asc ;";

    }
}
    String sql = "select * from student " + tenlops +tens + diemuutiens;
    System.out.println(sql);
        ResultSet rst = stm.executeQuery(sql);
        ResultSetMetaData rstmeta = rst.getMetaData();
        int num = rstmeta.getColumnCount();
        for(int i =1;i<=num;i++){
            viewAdmin.vTitle.add(rstmeta.getColumnLabel(i));
        }
        while(rst.next()){
            Vector row = new Vector(num);
            for(int i =1;i<=num;i++)
            row.add(rst.getString(i));
            viewAdmin.vData.add(row);

        }
        rst.close();
        con.close();
    }
    } catch (Exception e) {
        // TODO Auto-generated catch block
       System.out.println(e.getMessage());
    }
    
}
}
