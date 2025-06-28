public class Recursion(
    public static void calcPower(int x,int n){
        if(n==0){
            return 1;

        }
        if(x==0)(
            return 0;
        )
        int xpownm1=calcPower(x,n-1);
        int xpown=x*xpownm1;
        return xpown;

    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int result = calcPower(x, n);
        System.out.println("Result: " + result);
    }
)