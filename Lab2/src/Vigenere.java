import java.util.HashMap;

public class Vigenere implements Cipher {

    private static HashMap<Character, Integer> alphaToIndex = new HashMap<>();

    private static char[] alphabet;

    static {
        alphabet = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
    }

    @Override
    public String decrypt(String message, Object keyObj){

        init();
        message = message.toLowerCase();
        //multiply positions and mod to 26 for decrypted letter
        //loop the key, using mod, wile looping the message.
        //multiply key pos and message pos, then mod, get position of result

        String key = keyObj.toString().toLowerCase();

        String output = "";

        int keyPos = 0;
        for (int i = 0; i < message.length(); i++){

            char c = (message.charAt(i));
            try {
                char keyC = (key.charAt(keyPos % key.length()));

                int posA = alphaToIndex.get(c);
                int posKey = alphaToIndex.get(keyC);

                int newPos = (posA - posKey + 26) % 26;

                c = alphabet[newPos];
                keyPos++;
            }
            catch(NullPointerException e){
                c = c;
            }
            output += c;
        }


        return output;
    }

    @Override
    public void encrypt(){
    }

    public String bruteForce(String message){

        return "not a chance";
    }

    void init(){
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphaToIndex.put(ch, i);
            i++;
        }
    }
}
