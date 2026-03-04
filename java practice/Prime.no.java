class Prime.no{
   public static void main(String args[]){
	int num=19;
	int c=0;
	for(int i=1;i<=num;i++){
	   if(num%i==0)
		c++;
	}
	if(c==2)
	   System.out.println("The given number is a prime number!");
   }
}