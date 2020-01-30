class Practice01MathRecursive implements Practice01Math{
	public int finb(int n) throws Exception{
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(n<0){
			throw new IllegalArgumentException("Please enter a positive number");
		}
		return fib(n-1)+fib(m-2);
	}
	public int fact(int n) throws Exception{
		if(n<0){
			throw new IllegalArgumentException("Please enter a positive number");
		}
		if(n>=1){
			return n*fact(n-1);
		}
		else
			return 1;
}
