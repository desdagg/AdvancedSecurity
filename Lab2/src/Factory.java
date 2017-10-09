public class Factory {



    public Cipher getCipher(String cipherType){
        if(cipherType == null)
            return null;

        if(cipherType.equalsIgnoreCase("Caesar"))
            return new Caesar();

        if(cipherType.equalsIgnoreCase("vigenere"))
            return new Vigenere();

        return null;
    }
}
