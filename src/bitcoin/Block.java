package bitcoin;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.codec.digest.DigestUtils;
/**
 * Created by jackryannn on 18/3/26.
 */
public class Block {
//    区块链
    public static ArrayList<Block> arrayList = new ArrayList<Block>();
//    序号
    int index;
//    时间戳
    String timestamp;
//    值
    String info;
//    Hash值
    String hash;
//    前一个模块的Hash值
    String prevHash;

    public static Block generate(Block oldBlock,String info){
        Block block = new Block();
        block.index = oldBlock.index+1;
        block.timestamp = new SimpleDateFormat("yy-MM-dd hh:mm:ss").format(new Date());
        block.info = info;
        block.hash = block.calculateHash();
        return block;
    }
    public String calculateHash(){
        String s = this.index+timestamp+info+prevHash;
        s = DigestUtils.shaHex(s);
        return s;
    }

    public static boolean verifyLastBlock(Block block){
        synchronized (arrayList){
            if(arrayList.get(arrayList.size()-1).index+1 == block.index){
                return true;
            }
        }
        return false;
    }

    public static String print(){
        String s = "";
        for(Block b : arrayList){
            s += ("区块编号:"+b.index+" 时间戳："+b.timestamp+" 交易信息："+b.info+" Hash值："+b.hash)+"<br>";
        }
        return s;
    }

//    Setter方法
    public void setIndex(int index) {
        this.index = index;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash;
    }
}
