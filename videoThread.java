class worker extends Thread{
    public void run(){
        for (int i = 1;i<=10;i++){
            System.out.println("Hi! I am Thread...."+ new java.util.Date());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

}
public class videoThread{
        public static void main(String args[]) {
        worker w1 = new worker();
        w1.start();


    }
}