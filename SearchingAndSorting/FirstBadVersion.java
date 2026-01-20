/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int high = n;
        int low = 1;
        int mid = low + (high - low) / 2;
        int ans = 1;
        boolean isBad = false;
        while (low <= high) {
            mid = low + (high - low) / 2;
            isBad = isBadVersion(mid);
            if (isBad) {
                if (isBadVersion(mid - 1) == false) {
                    ans = mid;
                    break;
                } else if (mid == 1) {
                    ans = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}