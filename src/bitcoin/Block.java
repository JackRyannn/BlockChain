package bitcoin;
import org.apache.commons.codec.digest.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
            int count = 0;
            for(User u : User.userList){
                count += u.money;
            }
            if(arrayList.get(arrayList.size()-1).index+1 == block.index){
                if(User.common_flag && count != 100*User.userList.size()+arrayList.size()-1)
                    return false;
                return true;
            }
        }
        return false;
    }

    public static String print(){
        String s = "<head>\n" +
                "    <title></title>\n" +
                "  <style>\n" +
                "    table {\n" +
                "      width:100%;\n" +
                "      margin:15px 0;\n" +
                "      border:0;\n" +
                "      padding: 70px 0;\n" +
                "      text-align: center;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>" +
                "<table border='1'>";
        for(Block b : arrayList){
            s += ("<tr><td>区块编号</td><td>"+b.index+"</td>时间戳<td>"+b.timestamp+"</td>交易信息<td>"+b.info+"</td><td>Hash值</td><td>"+b.hash)+"</td></tr>";
        }
        s+="</table>";
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
