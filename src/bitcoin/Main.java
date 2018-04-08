//package bitcoin;
//
//import java.security.Timestamp;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Random;
//import java.util.Scanner;
//
///**
// * Created by jackryannn on 18/3/26.
// */
//public class Main {
//    public static void main(String[] args){
////        创建创世块
//
//        while(true){
//            System.out.println("===================================================");
//            System.out.println("1.进行交易");
//            System.out.println("2.创建用户");
//            System.out.println("3.查询状态");
//            System.out.println("===================================================");
//            Scanner scanner = new Scanner(System.in);
//            switch (scanner.nextInt()){
//                case 1:
//                    System.out.println("请输入发起用户id 接受用户id 转账金额，中间用空格隔开");
//                    String fid = scanner.nextInt();
//                    int tid = scanner.nextInt();
//                    int delta = scanner.nextInt();
//                    User user = User.getById(fid);
//                    user.transfer(tid, delta);
//                    break;
//                case 2:
//                    System.out.println("请输入用户id 是否为矿工(0为普通用户，1为矿工)");
//                    int id = scanner.nextInt();
//                    int flag = scanner.nextInt();
//                    if(flag==0) {
//                        User u = new User(id);
//                    }else{
//                        Worker w = new Worker(id);
//                    }
//                    break;
//                case 3:
//                    User.print();
//                    break;
//            }
//        }
//    }
//}
