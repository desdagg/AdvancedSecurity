public class Factory {



    public Cipher getCipher(String cipherType){
        if(cipherType == null)
            return null;

        if(cipherType.equalsIgnoreCase("Caesar"))
            return new Caesar();

        return null;
    }
}
