public interface Cipher {

    String decrypt(String message, Object key);

    void encrypt();

    String bruteForce(String message);
}
