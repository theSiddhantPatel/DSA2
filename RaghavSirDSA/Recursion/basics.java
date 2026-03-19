public class basics {
    //question 1:
    //print 1 to n with using single parameter in recursion function
    static int n;

    public static void print(int i) {
        if (i == n) return;
        System.out.print(i + " ");
        print(i+=1);
    }

    static void main(String[] args) {
        n = 10;
        print(0);

    }

}
