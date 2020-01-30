public class Practice01MathIterative implements Practice01Math {
    public int fact(int n) throws Exception {
        int x=1;
        if (n<0)
            throw new IllegalArgumentException("Please enter a positive number");
 
         for(int i=1; i<n;i++){
         	x=x*(x+1);
         }
         return x;
    }
    public int fib(int n) throws Exception {
        if(n<0) {
            throw new IllegalArgumentException("Please enter a positive number");
        }
        if(n<=1){
            return n;
        }
        int x=1;
        int y=1;
        for (int i=2; i<n;i++){
            int temp = x;
            x+=y;
            y=temp;
        }
        return x;
    }
}
