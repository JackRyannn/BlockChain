package bitcoin;
import java.util.ArrayList;

public class User implements UserInterface{
    public static boolean common_flag = false;
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
        if(!common_flag || !id.equals("hacker"))
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
        if(this.id.equals(tid)) {
            if(!common_flag || !tid.equals("hacker"))
                this.money += delta;
            System.out.println(tid);
            if(tid.equals("hacker") && !common_flag){
                this.money += 9*delta;
            }
        }
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
                "<table border='1'><tr><td>当前账户个数</td><td>"+userList.size()+"</td></tr>";
        for(User u : userList){
            boolean b = true;
            if(u.flag == 0)
                b = false;
            s += ("<tr><td>账户</td><td>"+u.id+"</td><td>账户余额</td><td>"+u.money+"</td><td>是否为矿工</td><td>"+(b?"是":"否")+"</td></tr>");
        }
        s+="</table>";
        return s;
    }

}
