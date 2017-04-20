/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author A206
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================");
        System.out.println("=====Bao Búa Program=====================");
        System.out.println("1:Búa; 2:Bao; 3:Kéo==========================");
        System.out.println("==========================");
        Scanner sc = new Scanner(System.in);
        while (true) {
            //Bạn
            System.out.println("Bạn ra:");
            byte ban = sc.nextByte();
            //Tôi
            byte toi = (byte)(Math.random()*3);
            System.out.println("Tôi ra:+toi");
            //Xỷ lý 
            //Hồi có tiếp tục
            System.out.println("Tiếp tục ?(C/K)");
            String tiep = sc.nextLine();
            if (tiep.contains("K")) break;
            
        }
    }
}