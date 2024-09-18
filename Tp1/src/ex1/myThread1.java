public class myThread1 extends Thread {
    private char lettre1,lettre2 ;
    public myThread1(char lettre1, char lettre2) {
        this.lettre1 = lettre1;
        this.lettre2 = lettre2;
    }
    public void run() {
        for(char i=lettre1; i<lettre2; i++) {
            System.out.println(i);
    }
}}