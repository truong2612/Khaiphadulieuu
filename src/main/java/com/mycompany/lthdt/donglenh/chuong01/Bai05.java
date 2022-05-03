/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Le Ba Quoc Truong
 */
public class Bai05 {
    public static void main(String[] ergs) throws ParseException{
         //Chuyen kieu du lieu Date thanh String
         SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
         Date currentDate = new Date();
         String output = df.format(currentDate);
         System.out.println(output);
         
         //Chuyen kieu du lieu tu String thanh Date
         String input = "15-05-1995";
         Date ngay = df.parse(input);
         System.out.println(ngay);
         System.out.println(df.format(ngay));
    }
}
