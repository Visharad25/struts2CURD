/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.beans;

import org.apache.log4j.Logger;  
  
import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  
/**
 *
 * @author VISHARAD KUMAR
 */
public class example {
     static Logger log = Logger.getLogger(example.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException{  
      log.debug("Hello this is a debug message");  
      log.info("Hello this is an info message");  
   }  
}
