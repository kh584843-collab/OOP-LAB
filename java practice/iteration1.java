public class iteration1{
   public static void main(String[] args){
	int phy=88;
	int che=95;
	int mat=91;
	float avg=(phy+che+mat)/3;
	if (avg>90)
	   System.out.println("Outstanding");
	else if(avg>80 && avg<=90)
	   System.out.println("Good");
	else 
	   System.out.println("Fair");
   }
}