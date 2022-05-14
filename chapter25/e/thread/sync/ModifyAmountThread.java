package chapter25.e.thread.sync;

public class ModifyAmountThread extends Thread{
    private final CommonCalculate calc;
    private final boolean addFlag;

    public ModifyAmountThread(CommonCalculate calc, boolean addFlag){
        this.calc = calc;
        this.addFlag = addFlag;
    }

    @Override
    public void run() {
        for(int loop=0; loop<10000; loop++){
            if(addFlag){
                calc.plus(1);
            } else {
                calc.minus(1);
            }
        }
    }
}
