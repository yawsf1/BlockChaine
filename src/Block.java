import java.util.Date;

public class Block {
    public String last_hash;
    public String hash;
    public long time;
    public String data;
    Block(String l_hash, String data){
        this.last_hash = l_hash;
        this.data = data;
        this.time = new Date().getTime();
        this.hash = calculate_hash();
    }
    public String calculate_hash(){
        String result = Algo.apply_sha256(last_hash + Long.toString(time) + data );
        return result;
    }
}
