public class ManageHeight {
    int[][] gradeHeight = new int[5][];

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        int limit = manageHeight.gradeHeight.length;
        for (int cnt = 0; cnt < limit; cnt++) {
            // manageHeight.printHeight(cnt);
            manageHeight.printAverage(cnt);
        }

    }

    public void printAverage(int classNo) {
        double avg = 0;
        double limit = gradeHeight[classNo].length;
        int count = 0;
        while (count < limit) {
            avg += gradeHeight[classNo][count];
            count++;
        }
        System.out.println("Class No.:" + (classNo + 1));
        System.out.println("Height average:" + (avg /= limit));

    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + (classNo + 1));
        for (int val : gradeHeight[classNo]) {
            System.out.println(val);
        }
    }

    public void setData() {
        gradeHeight[0] = new int[5];
        gradeHeight[0] = new int[] { 170, 180, 173, 175, 177 };
        // gradeHeight[0][0] = 170;
        // gradeHeight[0][1] = 180;
        // gradeHeight[0][2] = 173;
        // gradeHeight[0][3] = 175;
        // gradeHeight[0][4] = 177;

        gradeHeight[1] = new int[4];
        gradeHeight[1] = new int[] { 160, 165, 167, 186 };
        // gradeHeight[1][0] = 160;
        // gradeHeight[1][1] = 165;
        // gradeHeight[1][2] = 167;
        // gradeHeight[1][3] = 186;

        gradeHeight[2] = new int[4];
        gradeHeight[2] = new int[] { 158, 177, 187, 176 };
        // gradeHeight[2][0] = 158;
        // gradeHeight[2][1] = 177;
        // gradeHeight[2][2] = 187;
        // gradeHeight[2][3] = 176;

        gradeHeight[3] = new int[3];
        gradeHeight[3] = new int[] { 173, 182, 181 };
        // gradeHeight[3][0] = 173;
        // gradeHeight[3][1] = 182;
        // gradeHeight[3][2] = 181;

        gradeHeight[4] = new int[5];
        gradeHeight[4] = new int[] { 170, 180, 165, 177, 172 };
        // gradeHeight[4][0] = 170;
        // gradeHeight[4][1] = 180;
        // gradeHeight[4][2] = 165;
        // gradeHeight[4][3] = 177;
        // gradeHeight[4][4] = 172;
    }
}
