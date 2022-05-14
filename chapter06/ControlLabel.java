public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel controlLabel = new ControlLabel();
        controlLabel.printTimesTable();
    }

    public void printTimesTable() {
        for (int first = 1; first < 10; first++) {
            for (int seconds = 1; seconds < 10; seconds++) {
                if (seconds > 3) {
                    continue;
                }
                System.out.printf("%d * %d = %d\n", first, seconds, first * seconds);
            }
        }
    }
}
