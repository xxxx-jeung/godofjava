package chapter13.c.direct2.enums;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0),
    LEVEL_TWO(2000, 2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1)
    ;
    final int maxSalary;
    final double ratio;
    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        HealthInsurance[] healthInsurances = HealthInsurance.values();
        HealthInsurance returnHealthInsurance = null;

        if(HealthInsurance.LEVEL_ONE.maxSalary >= salary) returnHealthInsurance = HealthInsurance.LEVEL_ONE;
        else if(HealthInsurance.LEVEL_TWO.maxSalary >= salary) returnHealthInsurance = HealthInsurance.LEVEL_TWO;
        else if(HealthInsurance.LEVEL_THREE.maxSalary >= salary) returnHealthInsurance = HealthInsurance.LEVEL_THREE;
        else if(HealthInsurance.LEVEL_FOUR.maxSalary >= salary) returnHealthInsurance = HealthInsurance.LEVEL_FOUR;
        else if(HealthInsurance.LEVEL_FIVE.maxSalary >= salary) returnHealthInsurance = HealthInsurance.LEVEL_FIVE;
        else if(HealthInsurance.LEVEL_SIX.maxSalary >= salary) returnHealthInsurance = HealthInsurance.LEVEL_SIX;
        else returnHealthInsurance = HealthInsurance.LEVEL_SIX;
        return returnHealthInsurance;
    }

    public static void main(String[] args) {
        int salaryArray[] = new int[]{1500,5500,8000};
        HealthInsurance[] insurance = new HealthInsurance[3];
        insurance[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurance[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurance[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        for(int loop=0; loop<3; loop++){
            System.out.println(salaryArray[loop] + "="+ insurance[loop]+","+insurance[loop].getRatio());
        }

    }

}
