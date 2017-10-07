import java.util.HashMap;

public class Caesar implements Cipher {

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
    public String decrypt(String message, Object key){

        init();
        int shift = (int) key;
        message = message.toLowerCase();

        int len = message.length();

        String output = "";

        for (int i = 0; i < len; i++)
        {
            char c = (message.charAt(i));
            try {
                int pos = alphaToIndex.get(c);
                pos = ((pos - shift)+26) % 26;
                c = alphabet[pos];
            }
            catch(NullPointerException e)
            {
                c = c;
            }
            output += c;
        }




        return output;
    }

    @Override
    public void encrypt(){

    }

    void init(){
        for (int i = 0; i < alphabet.length; i++){
            alphaToIndex.put(alphabet[i], i);
        }
    }
}
