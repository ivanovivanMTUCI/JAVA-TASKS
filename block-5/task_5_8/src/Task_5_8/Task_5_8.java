package Task_5_8;

import java.nio.charset.StandardCharsets;
import java.security.*;

public class Task_5_8 {
    public static void main(String[] args) throws Exception
    {
        System.out.println(getSha256Hash("password123")); //ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f
        System.out.println(getSha256Hash("Fluffy@home")); //dcc1ac3a7148a2d9f47b7dbe3d733040c335b2a3d8adc7984e0c483c5b2c1665
        System.out.println(getSha256Hash("Hey dude!")); //14f997f08b8ad032dcb274198684f995d34043f9da00acd904dc72836359ae0f
    }

    public static String getSha256Hash(String str) throws Exception
    {
        //turning input string into byte sequence using UTF-8 encoding
        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        //creating "MessageDigest" object and using message digest algorithm SHA-256
        MessageDigest mg = MessageDigest.getInstance("SHA-256");
        byte[] hash = mg.digest(data);
        //creating "StringBuilder" object to store the hash
        StringBuilder hexStr = new StringBuilder();
        for (byte b : hash)
        {
            //filling up the string (masking b with 0xff)
            hexStr.append(Integer.toHexString(b & 0xff));
        }
        return hexStr.toString();
    }
}
