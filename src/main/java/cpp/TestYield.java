package cpp;

/**
 * Created by chenqinqin on 17/5/26.
 */
public class TestYield extends Thread {
    public TestYield(){}

    public TestYield(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + i);
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args){
        TestYield ty1 = new TestYield("高级");
        ty1.setPriority(Thread.MAX_PRIORITY);
        TestYield ty2 = new TestYield("低级");
        ty2.setPriority(Thread.MIN_PRIORITY);
        ty2.start();
    }
}
