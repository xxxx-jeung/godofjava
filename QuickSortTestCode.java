public class QuickSortTestCode {
    public static void main(String[] args) {
        int[] arr = new int[10];
    }

    public void QuickSortMethod(int[] arr){
        int pivot = 0;
        int low = 1;
        int high = arr.length-1;

        while(pivot <= arr.length){
            if(arr[low] < arr[pivot]){
                if(arr[high] > arr[pivot]){
                    int tmp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = tmp;
                } else {
                    high--;
                }
            } else {
                low++;
            }
            if(low > high){
                int temp = arr[pivot];
                arr[high] = arr[pivot];
                arr[pivot] = temp;
                pivot = high;
            }
        }
    }
}
