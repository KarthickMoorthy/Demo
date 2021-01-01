package classics;

import java.util.HashMap;

public class CaesarCipher {
    private static HashMap<Character, Character> lookup = new HashMap<>();
    public static void main(String[] args) {
        String encyptedText = encrypt("A B C");
        System.out.println("The Encypted Text " + encyptedText);

        String decryptedText = decrypt(encyptedText);
        System.out.println("The Decrypted Text "+ decryptedText);
    }

    private static String decrypt(String encyptedText) {
        char[] input = encyptedText.toCharArray();
        StringBuilder decryptedText = new StringBuilder();

        for(char c: input){
            decryptedText.append(lookup.get(c));
        }

        return decryptedText.toString();

    }

    public static String encrypt(String text){
        char[] input = text.toCharArray();
        StringBuilder encyptedText = new StringBuilder();
        for(char c: input){
            if(String.valueOf(c).equals(" ")){
                encyptedText.append(c);
                lookup.put(c,c);
             continue;
            }
            int j = (int) c -3;
            if(j<65){
                j= j + 26;
            }
            char d = (char) j;
            lookup.put(d,c);
            encyptedText.append(d);
        }
        return encyptedText.toString();
    }
}
