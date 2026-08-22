public class concatenation1680 {
    int concatenatedBinary(int n) {
        long res = 0;
        double mod=1e9+7;
        for (int num = 1; num <= n; num++) {
            int digits = (int) (Math.floor(Math.log(num) / Math.log(2)) + 1);  //to calculate number of digits in a binary number
            res = ((res) << (digits)) + num;
            res%=mod;
        }
        return (int)res;

    }

    void main(String[]args) {
        System.out.println(concatenatedBinary(12));
    }
}