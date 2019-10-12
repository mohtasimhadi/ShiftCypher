package ShiftCipher;

import java.util.Scanner;

public class ShiftCipher {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        Encryption e = new Encryption();
        Decryption d = new Decryption();

        System.out.println("Enter 1 for encryption and 2 for decryption");
        int i = s.nextInt();
        if(i==1)
            e.encryption();
        else if (i==2)
            d.decryption();
    }
}