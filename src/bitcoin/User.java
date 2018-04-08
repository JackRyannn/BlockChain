package bitcoin;
import java.util.ArrayList;

public class User implements UserInterface{
    String id;
    int flag = 0;
    int money = 100;
    public static ArrayList<User> userList = new ArrayList<User>();

    public User(String id) {
        this.id = id;
        userList.add(this);
    }



    @Override
    public String transfer(String id, int delta) {
        if(delta<=0){
            return "金额必须大于0元";
        }
        if(delta>money){
            return "余额不足";
        }
        this.money -= delta;
        for(User u : userList){
            u.getMessage(this.id, id, delta);
            if(u.getClass()==Worker.class){
                new Thread((Worker) u).start();
            }
        }

        return "账户："+this.id+"转账给用户id:"+id+ "  "+delta +"块钱";
    }

    public static User getById(String id){
        for(User user : userList){
            if(user.id.equals(id))
                return user;
        }
        return null;
    }

    @Override
    public void getMessage(String fid, String tid, int delta) {
        if(this.id.equals(tid))
        this.money += delta;
    }

    public static String print(){
        String s = "当前账户个数："+userList.size()+"<br>";
        for(User u : userList){
            boolean b = true;
            if(u.flag == 0)
                b = false;
            s += ("账户: "+u.id+"     账户余额："+u.money+"     是否为矿工:"+(b?"是":"否")+"<br>");
        }
        return s;
    }

}
