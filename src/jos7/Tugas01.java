package jos7;

import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Rahmawati Asy syifa' P/32/XRPL3");
        
        System.out.print("Jumlah Uang? Rp.");
       
        int uang = input.nextInt();
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        int[] n = new int [] {100, 500, 1000, 2000, 5000};
        
        System.out.println("");
        System.out.println("");
        
        while(uang >= 5000)
        {
            uang = uang-5000;
            a++;
        }
        System.out.println("Jumlah uang 5000an sebanyak: " + a);
        
        while(uang >= 2000)
        {
            uang = uang-2000;
            b++;
        }
        System.out.println("Jumlah uang 2000an sebanyak: " + b);
        
        while(uang >= 1000)
        {
            uang = uang-1000;
            c++;
        }
        System.out.println("Jumlah uang 1000an sebanyak: " + c);
        
        while(uang >= 500)
        {
            uang = uang-500;
            d++;
        }
        System.out.println("Jumlah uang 500an sebanyak: " + d);
        
        while(uang > 100)
        {
            uang = uang-100;
            e++;
        }
        System.out.println("Jumlah uang 100an sebanyak: " + e);
        
        
        
    }
    
}
