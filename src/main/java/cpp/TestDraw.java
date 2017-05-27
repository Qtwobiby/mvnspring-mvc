package cpp;

/**
 * Created by chenqinqin on 17/5/26.
 */
public class TestDraw {

    public static void main(String[] args) {
        Account account = new Account("1234567", 1000);
        new DrawThread("甲", account, 800).start();
        new DrawThread("乙", account, 800).start();
    }
}
