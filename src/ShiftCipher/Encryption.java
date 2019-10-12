package ShiftCipher;

import java.util.Scanner;

public class Encryption {
    public void encryption() {
        Scanner s = new Scanner(System.in);
        System.out.println(" Input the message : ");
        String msg = s.nextLine();

        System.out.println("Input Encryption Key: ");
        int shift = s.nextInt();

        String cipherText = "";
        char alphabet;
        for(int i=0; i < msg.length();i++) {
            alphabet = msg.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                cipherText = cipherText + alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                cipherText = cipherText + alphabet;
            }
            else {
                cipherText = cipherText + alphabet;
            }

        }
        System.out.println(" ciphertext : " + cipherText);
    }
}