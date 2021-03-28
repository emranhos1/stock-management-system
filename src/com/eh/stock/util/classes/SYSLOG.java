package com.eh.stock.util.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author   Md. Emran Hossain
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class SYSLOG {
    
    /**
     * @param message takes string type of message
     * @param className takes string type of current class name
    */
    public static void LOG(String message, String className){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormatInfo = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss.S");
        
        String inputDate = dateFormat.format(new Date());
        String inputDateInfo = dateFormatInfo.format(new Date());
        
        String filePath = "log/";
        String fileName = filePath + "SYSLOG_" + inputDate + ".log";
        FileWriter writer;
        
        File file = new File(filePath);
        
        try {
            if(!file.exists()){
                file.mkdirs();
            }
            writer = new FileWriter(fileName, true);
            writer.write("\r\n");
            writer.write("INFO :: " + inputDateInfo + " " + className);
            writer.write("\r\n");
            writer.write(message);
            writer.close();
            
        } catch (IOException e) {
            Logger.getLogger(SYSLOG.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
//    public static void main(String[] args) {
//        LOG("hi","hi");
//    }
}
