public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse |= (n >> i & 0x1) << (31 - i);
        }

        return reverse;
        
    }
}
