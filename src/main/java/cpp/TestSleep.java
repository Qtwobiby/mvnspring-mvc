package cpp;

import java.util.Date;

/**
 * Created by chenqinqin on 17/5/26.
 */
public class TestSleep {

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++) {
            System.out.println("当前时间: " + new Date());

            Thread.sleep(1000);
        }
    }
}
