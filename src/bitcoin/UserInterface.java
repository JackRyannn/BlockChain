package bitcoin;
/**
 * Created by jackryannn on 18/3/26.
 */
interface UserInterface{
    String transfer(int id, int delta);
    void getMessage(int fid, int tid, int delta);

}
