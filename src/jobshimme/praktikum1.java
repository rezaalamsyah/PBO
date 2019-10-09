/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshimme;

import java.util.Scanner;

/**
 *
 * @author santuy
 */
public class praktikum1 {
    public static void main(String []args){
        double phi,r,hasil;
        int p,l,t;
        phi = 3.14;
        r = 21;
        hasil = phi * 4 * r * r;
        System.out.println("Luas Permukaan Bola ");
        System.out.println("====================");
        System.out.println("Luas : "+hasil );
        
        p = 5;
        l = 40;
        t = 32;
        
        System.out.println("Luas Permukaan Balok");
        System.out.println(" ========================= ");
        System.out.println("Luas : "+((2*p*l)+(2*p*t)+(2*l*t)));
    }
}
