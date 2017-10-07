public interface Cipher {

    String decrypt(String message, Object key);

    void encrypt();
}
