package homework1;
		
public class gitTry1 {
	
	public static boolean isOdd(int num){
		boolean ret = false;
		if (num %2 == 1)
		{
			ret = true;
		}
		return ret;
	}
	
	
	public static boolean isPrime(int num){
		boolean ret = true;
		if (num==2){}
		else if (num>2){
			for (int i=2;i<num;i++){
				if (num%i==0)
				{
					ret = false;
					break;
				}
			}
		}
		else{ret = false;}
		return ret;
	}
}
