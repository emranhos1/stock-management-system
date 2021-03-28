package com.eh.stock.util.classes;

import com.eh.stock.util.dbconnection.conRs;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class OffsetUtil {
    private static conRs conrs;
 
    public static void refreshTable(JTable tableName) {
        
        DefaultTableModel model = (DefaultTableModel) tableName.getModel();
        model.setRowCount(0);
    }
     
    public static void tableCellRenderer(JTable tableName) {
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tableName.setDefaultRenderer(Object.class, centerRenderer);
    }
    
    public static String splitComboData(String data) {
        
        String[] splited = data.split("-", 2);
        String code = splited[1];
        
        return code;
    }
    
    public static boolean validatePhone(String data){
        return data.charAt(0) == '0' && data.charAt(1) == '1' && data.length() == 11 && data.matches("[0-9]+");
    }

    public static void BtnColorChange(JPanel panelName, int r, int g, int b) {
        panelName.setBackground(new Color(r, g, b));
    }

    public static String randomNumber(Date date) {
        return dateStringFormat(date);
    }
    
    public static String dateStringFormat(Date date){
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        String day   = parse(localDateTime.getDayOfMonth());
        String month = parse(localDateTime.getMonthValue());
        String fullYear  = parse(localDateTime.getYear());
        String year = parseSubStr(fullYear);
        
        String hour  = parse(localDateTime.getHour());
        String minute  = parse(localDateTime.getMinute());
        String second  = parse(localDateTime.getSecond());
        return year+month+day+hour+minute+second;
    }
    
    public static String parseSubStr(String str){
        return str.substring(2);
    }
    
    public static String parse(int localDateTime){
        return String.format("%02d", localDateTime);
    }
    
    public static void main(String[] args) {
        //splitComboData("Rice-1112");
//        if (validatePhone("01670932273")){
//            System.out.println("valid");
//        } else {
//            System.out.println("invalid");
//        }
        System.out.println(randomNumber(new Date()));
    }
}
