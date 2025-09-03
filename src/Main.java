import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.GsonBuilder;

public class Main {

    public static ArrayList<Block> blocklist = new ArrayList<>();


    public  static Boolean isvalid(){
        Block current;
        Block previous;
        for (int i = 1; i< blocklist.size() ; i++){
            current = blocklist.get(i);
            previous = blocklist.get(i-1);
            if(!current.hash.equals(current.calculate_hash())){
                System.out.println("Current hashes not equal");
                return false;
            }
            if(!previous.hash.equals(current.last_hash) ) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data;

        System.out.println("Simple Blockchain Demo");
        System.out.println("Type 'q' to quit.\n");

        while (true) {
            System.out.print("Enter data (q to quit): ");
            data = scan.nextLine().trim();

            if (data.equalsIgnoreCase("q")) {
                break;
            }

            if (blocklist.isEmpty()) {
                blocklist.add(new Block("0", data));
            }
            else {
                blocklist.add(new Block(blocklist.getLast().hash, data));
            }
        }
        System.out.println("\nBlockchain is Valid: " + isvalid());

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blocklist);
        System.out.println("\nBlockchain:");
        System.out.println(blockchainJson);

        scan.close();
    }
}
