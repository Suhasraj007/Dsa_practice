public class Main implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Main t1 = new Main();
        Thread tt1 = new Thread(t1);
        Main t2 = new Main();
        Thread tt2 = new Thread(t2);

        tt1.start();
        tt2.start();
        
    }
}