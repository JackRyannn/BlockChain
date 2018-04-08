package bitcoin;
/**
 * Created by jackryannn on 18/3/26.
 */
interface UserInterface{
    String transfer(String id, int delta);
    void getMessage(String fid, String tid, int delta);

}
