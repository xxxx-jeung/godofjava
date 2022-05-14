package chapter25.e.thread.volat;

public class VolatileSample extends Thread{
    private double instanceVariable = 0;

    void setDouble(double value){
        this.instanceVariable = value;
    }

    @Override
    public void run() {
        try {
            while(instanceVariable == 0) {
                Thread.sleep(1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(instanceVariable);
    }
}
