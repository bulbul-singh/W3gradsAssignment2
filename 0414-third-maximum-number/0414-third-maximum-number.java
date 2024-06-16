class Solution {
    public int thirdMax(int[] nums) {
     
        long NUM1 = Long.MIN_VALUE;
        long NUM2 = Long.MIN_VALUE;
        long NUM3 = Long.MIN_VALUE;
        
        for (final int num : nums) {
            if (num == NUM1 || num == NUM2 || num == NUM3) {
                continue;
            }
            if (num > NUM1) {
                NUM3 = NUM2;
                NUM2 = NUM1;
                NUM1 = num;
            } else if (num > NUM2) {
                NUM3 = NUM2;
                NUM2 = num;
            } else if (num > NUM3) {
                NUM3 = num;
            }
        }
        
        return NUM3 == Long.MIN_VALUE ? (int) NUM1 : (int) NUM3;
    }
}

    