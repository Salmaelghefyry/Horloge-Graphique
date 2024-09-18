public class Main{
    public static void main(String[] args) {
        myThread1 t1 = new myThread1('A','Q');
        t1.start();
        myThread1 t2 = new myThread1('r','z');
        t2.start();
        Thread t3 = new Thread(new myThread2(1,60));
        t3.start();
    }
}