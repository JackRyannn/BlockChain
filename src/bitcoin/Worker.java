package bitcoin;
import java.util.Random;

/**
 * Created by jackryannn on 18/3/26.
 */
public class Worker extends User implements Runnable{

    Block block;
    public Worker(int id) {
        super(id);
        flag = 1;
    }

    @Override
    public void getMessage(int fid,int tid,int delta) {
        if(this.id == tid)
            this.money += delta;
        this.block = Block.generate(Block.arrayList.get(Block.arrayList.size()-1),"用户"+fid+"转账给用户"+tid+" "+delta+"块钱");
    }

    @Override
    public void run() {
        Random random = new Random();
        int sleepTime = random.nextInt(1000);
        try {
            Thread.sleep(sleepTime);
            if(Block.verifyLastBlock(block)){
                Block.arrayList.add(block);
                this.money += 1;
                System.out.println("矿工"+this.id+"完成计算并添加了新的Block块，获得了1元奖励");
                User.print();
                Block.print();
            }else{
                System.out.println("矿工"+this.id+"没能最先完成计算，添加失败");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
