/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import struts2.test.core.ConnectionManager;

/**
 *
 * @author VISHARAD KUMAR
 */
public class Blob_Example {
    @SuppressWarnings("resource")
 public static void main(String[] args) throws ClassNotFoundException, IOException {
  // TODO Auto-generated method stub

  String QUERY = "Create table Blob_Sample_Example ( PicName varchar(30), picture LONGBLOB)"; //Select Query to get the Data from employee_details table
  Connection conn=null;
  //Update query to set the email id for the employee whose empNUM is 1001
  //Class.forName("oracle.jdbc.driver.OracleDriver");  
  System.out.println("Establishing Connection");
  try
  {
    conn=ConnectionManager.getConnection();
    Statement statemnt1 = conn.createStatement();
    //Executing the Create Query
    statemnt1.execute(QUERY);
    System.out.println("Table has been created for BLOB type");
    System.out.println("Inserting data into Blob_Sample_Example table");
    String insert_query = " insert into Blob_Sample_Example values(?,?)";
    //Passing the values for preparedStatement
    PreparedStatement pstmnt = conn.prepareStatement(insert_query);
    pstmnt.setString(1, "istockphoto");
    //Mention Image path to store the image in DB
    FileInputStream inputStream = new FileInputStream("A:\\istockphoto.jpg");
    pstmnt.setBlob(2, inputStream);
    //Executing the preparedStatement to insert the data 
    pstmnt.execute();
    System.out.println("Retrieving data");
     ResultSet rs = statemnt1.executeQuery("select * from Blob_Sample_Example");
     while(rs.next())
     {
     //Getting Picture Name
      System.out.println("Picture Name:" + rs.getString(1));
      Blob blob1 = rs.getBlob(2);
     //using blob retrieving the Image
            byte byteArray[] = blob1.getBytes(1,(int)blob1.length());
            FileOutputStream outPutStream = new FileOutputStream("A:\\istockphoto.jpg");
            outPutStream.write(byteArray);
            System.out.println(" Go to the following path: A:\\istockphoto.jpg");
          
     }
  
  }
  catch (SQLException e) {
   e.printStackTrace();
  }
 }
}
