
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.donglenh.chuong01;

/**
 *
 * @author Le Ba Quoc Truong
 */
public class Bai04 {
    public static void main(String[] args){
        Shape htron = new Circle(5, 1, 2);
//        System.out.println("Chu vi cua hinh tron la " + htron.calcPerimeter());
//        System.out.println("Dien tich cua hinh tron la " + htron.calcArea());
        System.out.println(htron.toString());
        
        Shape hcn = new Retangle(3, 15, 8, 5);
//        System.out.println("Chu vi hcn " + hcn.calcPerimeter());
//        System.out.println("dien tich hcn " + hcn.calcArea());
        System.out.println(hcn);
    }
}
