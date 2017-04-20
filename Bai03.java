/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai03;
import java.util.Scanner;
/**
 *
 * @author A206
 */
public class Bai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        a=nhapsonguyen("nhap he so a:");
        b=nhapsonguyen("nhap he so b:");
        GiaiPTbac1(a,b);
       
    }
    public static int nhapsonguyen
        (String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println(str);
        x=sc.nextInt();
        return x;
    }
    public static void GiaiPTbac1(int a,int b) 
    {
        if(a==0)
        {
            if(b==0)
                System.out.println("Phuong tring vo nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
            
        }
        else
            System.out.println("Phuong trinh co nghiem x="+(-b/a));
    }
    
}