/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5;

/**
 *
 * @author DT
 */
public class Bt5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Nhap mot so: ");
        a = ban_phim.nextInt();
        String kq = "";
        if(a%2==0)
            kq="so chan";
        else
            kq ="so le";
        System.out.println("So vua nhap la 5"+kq);
    }
    
}
