
public class FoldWayToMoon {
	public static void main(String[] args) {
		
	long ans = fold((double) 0.00005);
	System.out.println(ans);
	
		
		
		
	}
	
	public static Long fold(Double distance) {
		if(distance<0) {
			return null;
		}
		double thickness = 0.0001;
		int numberOfFolds =0;
		while(thickness<distance) {
			thickness*=2;
			numberOfFolds++;
		}
		return (long)numberOfFolds;
	}
	
	
	
	
	

}
