
package jos7;

import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Rahmawati Asy syifa P/32/XRPL3");
        
        double total;
        
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. C");
        System.out.println("4. D");
        System.out.println("5. E");
        System.out.println("Jenis barang: (1/2/3/4/5)");
        double jenis = input.nextInt();
        
        System.out.println("");
        
        System.out.println("Masukkan berat barang: ");
        double berat = input.nextDouble();
        
        System.out.println("");
        
        if(jenis == (1))
        {
            if(berat % 4 == 0)
            {
                total = berat/4*5000;
                System.out.println("Total yang harus dibayar: Rp." + total);
            }
            else
            {
                total = (5000/4)*berat;
                System.out.println("Total yang harus dibayar: Rp." + total);
            }
        }
        else if(jenis == 2)
        {
            if(berat % 5 == 0)
            {
                total = berat/5*7000;
                System.out.println("Total yang harus dibayar: Rp." + total);
            }
            else
            {
                total = (7000/5)*berat;
                System.out.println("Total yang harus dibayar: Rp." + total);
            }
        }
        else if(jenis == 3)
        {
            if(berat % 2 == 0)
            {
                total = berat/2*2000;
                System.out.println("Total yang harus dibayar: RP." + total);
            }
            else
            {
                total = (2000/2)*berat;
                System.out.println("Total yang harus dibayar: Rp." + total);
            }
        }
        else if(jenis == 4)
        {
            if(berat % 3 == 0)
            {
                total = berat/3*3000;
                System.out.println("Total yang harus dibayar: Rp." + total);
            }
            else
            {
                total = (3000/3)*berat;
                System.out.println("Total yang harsu dibayar: Rp." + total);
            }
        }
        else if(jenis == 5)
        {
            if(berat % 7 == 0)
            {
                total = berat/7*10000;
                System.out.println("Total yang harus dibayar: " + total);
            }
            else
            {
                total = (10000/7)*berat;
                System.out.println("Total yang harus dibayar: " + total);
            }
        }
    }
    
}
