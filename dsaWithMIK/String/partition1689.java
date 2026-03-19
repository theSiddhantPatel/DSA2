public class partition1689 {

    public int minPartitions(String n) {
        int res=0;
        for (int i = 9; i >= 0; i--) {
            if (n.contains(String.valueOf(i))) {
                System.out.println(i);
                res =i;
                break;
            }
        }
        return res;
    }

    public int minPartitions2(String n){
        int maxDigit=0;
        for(char c:n.toCharArray()){
            maxDigit=Math.max(maxDigit,c-'0');
            System.out.println(maxDigit);
        }
        return maxDigit;
    }

    static void main() {
        partition1689 x = new partition1689();
        System.out.println(x.minPartitions2("325678"));
    }
}
