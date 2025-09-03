import  java.security.MessageDigest;
public class Algo {
    public static String apply_sha256(String input){
        try {
            MessageDigest message_digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = message_digest.digest(input.getBytes());
            StringBuilder hex = new StringBuilder();
            for (byte b : hash) {
                hex.append(String.format("%02x", b));
            }
            return hex.toString();
        }
        catch (Exception e){
            return "Error";
        }
    }
}
