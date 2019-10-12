package ShiftCipher;

import java.util.Scanner;

public class Decryption {
    public void decryption (){
        Scanner s = new Scanner(System.in);

        System.out.println(" Input the Encrypted message : ");
        String msg = s.nextLine();

        System.out.println(" Input the Decryption Key : ");
        int key = s.nextInt();

        String decryptMessage = "";

        for(int i=0; i < msg.length();i++) {
            char a = msg.charAt(i);

            if(a >= 'a' && a <= 'z') {
                a = (char) (a - key);
                if(a < 'a') {
                    a = (char) (a-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + a;
            }

            else if(a >= 'A' && a <= 'Z') {
                a = (char) (a - key);
                if (a < 'A') {
                    a = (char) (a-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + a;
            }
            else {
                decryptMessage = decryptMessage + a;
            }
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}