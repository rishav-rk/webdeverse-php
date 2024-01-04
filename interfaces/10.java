//Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that define encryption and decryption operations. Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.

interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

 class AES implements Encryptable {
    public String encrypt(String data) {
        // Implement AES encryption here
        return "Encrypted data with AES";
    }

    public String decrypt(String encryptedData) {
        // Implement AES decryption here
        return "Decrypted data with AES";
    }
}

 class RSA implements Encryptable {
    public String encrypt(String data) {
        // Implement RSA encryption here
        return "Encrypted data with RSA";
    }

    public String decrypt(String encryptedData) {
        // Implement RSA decryption here
        return "Decrypted data with RSA";
    }
}

 class encryption {
    public static void main(String[] args) {
        Encryptable aes = new AES();
        Encryptable rsa = new RSA();

        String data = "Hello, World!";

        System.out.println("AES Encryption and Decryption:");
        String aesEncrypted = aes.encrypt(data);
        System.out.println("Encrypted Data: " + aesEncrypted);
        String aesDecrypted = aes.decrypt(aesEncrypted);
        System.out.println("Decrypted Data: " + aesDecrypted);

        System.out.println("\nRSA Encryption and Decryption:");
        String rsaEncrypted = rsa.encrypt(data);
        System.out.println("Encrypted Data: " + rsaEncrypted);
        String rsaDecrypted = rsa.decrypt(rsaEncrypted);
        System.out.println("Decrypted Data: " + rsaDecrypted);
    }
}


