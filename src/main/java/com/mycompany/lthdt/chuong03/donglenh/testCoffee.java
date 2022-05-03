/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lthdt.chuong03.donglenh;

import com.mycompany.lthdt.chuong03.coffeelogic.Coffeeshop;
import com.mycompany.lthdt.chuong03.coffeelogic.Manager;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author Le Ba Quoc Truong
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        
        Coffeeshop[] a = new Coffeeshop[]{new Coffeeshop("Kha Coffee", "2 Nguyen Hue"),
                                       new Coffeeshop("White garden", "4 Nguyen Hue"),
                                       new Coffeeshop("Hoang Truc Vien", "3 Nguyen Hue")};
        Manager[]  managers = new Manager[]{
                                 new Manager(a, 1000, "Le Thi A ", 0, df.parse("12-12-1999")),
                                 new Manager(new Coffeeshop[]{ 
                                                  new Coffeeshop("Hoang Hac", "12 Nguyen Hue")
                                                       }, 
                                         2000, "Nguyen Van B", 1, df.parse("12-12-2000"))
                                 };
        System.out.println(Arrays.toString(managers));
    }
    
}
