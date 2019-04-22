/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsesission3;

/**
 *
 * @author namku
 */
import java.awt.*;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class LabSesission3 {
    public double a;
    public double b;
    public double c;
    public LabSesission3(){
    }
    public void khaiBaoTamGiac(){
    Scanner in = new Scanner(System.in);
    do{
        System.out.println("Nhap canh a : ");
        a = in.nextDouble();
        System.out.println("Nhap canh b : ");
        b = in.nextDouble();
        System.out.println("Nhap canh c : ");
        c = in.nextDouble();
        System.out.println("a = " + a+ " b = " + b + " c = " +c);
        if (ktTamGiac() == false) {
            System.out.println("Khong hop le ! Xin nhap lai");
        }
    }while(ktTamGiac() == false);
    }
    public boolean ktTamGiac(){
        if (a + b > c && a+c >b && b + c >a ) return true;
         return false;
    }
    public double chuViTamGiac(){
    return a+b+c;
    }
    public double dienTichTamGiac(){
    return sqrt(chuViTamGiac() * (chuViTamGiac() - a) * ( chuViTamGiac() - b) * (chuViTamGiac() - c));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LabSesission3 lb = new LabSesission3();
        lb.khaiBaoTamGiac();
        System.out.println("C = " + lb.chuViTamGiac());
        System.out.println("S = " + lb.dienTichTamGiac());
    }
    
}
