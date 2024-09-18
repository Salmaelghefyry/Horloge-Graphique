public class myThread2 implements Runnable {
    private int num1,num2;

    public myThread2(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void run() {
        int n;
        for(n=num1;n<=num2;n++) {{
            if (n%2==0) {
                System.out.println(n);
            }
        }
    }
}}
