package leetcode;

public class PeakIndex {
    public int peakIndexInMountainArray(int[] A) {
        int index = 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1] && A[i] > A[index]) {
                index = i;
            }
        }

        return index;
    }

    public int peakIndexInMountainArray2(int[] A) {
        int low = 0, high = A.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if(A[mid] > A[mid + 1]){
                high = mid;
            }
            else {
                low = mid + 1;
            }

        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println("Peak Index");
        int[] arr = { 0,2,1,0 };

        PeakIndex pi = new PeakIndex();
        int index = pi.peakIndexInMountainArray2(arr);
        System.out.println(index);
    }
}
