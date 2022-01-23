/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.beans;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
/**
 *
 * @author VISHARAD KUMAR
 */
public class Example1 {
    
    private static Logger log = Logger.getLogger(Example1.class);
 
    public static void main(String[] args) {
 
        log.debug("This is debug method");
        log.info("This is info method");
        log.error("This is error method");
 
        log.log(Level.DEBUG, "This is debug from Level.DEBUG");
        log.log(Level.INFO, "This is info from Level.INFO");
        log.log(Level.ERROR, "This is error from Level.ERROR");
    }
 
}
    
