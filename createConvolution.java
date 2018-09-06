

public class createConvolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filterSize =3;
		int filter[][]= new int[filterSize][filterSize];
		for(int loop =0; loop<filterSize; loop++) {
			for(int loop2=0; loop2<filterSize; loop2++) {
				filter[loop][loop2]=1;
			}
		}
		filter[1][0]=0;
		filter[1][2]=0;
		
		int[][] multi = new int[][]{
			  { 11, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			  { 0, 2, 0, 0, 0, 0, 0, 0, 0, 0 },
			  { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
			  { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 },
			  { 0, 0, 0, 0, 0, 0, 0, 0, 23, 0 }
			};
			
			
		String grid= "";
		for(int loop =0; loop<filterSize; loop++) {
			for(int loop2=0; loop2<filterSize; loop2++) {
				grid = grid + Integer.toString(filter[loop][loop2]);
			}
			grid+="\n";
		}
		System.out.println(grid);
		
		int highestScore =0;
		
		for(int loop3=0;loop3<multi.length-2; loop3++) {
			for(int loop4=0; loop4<multi[loop3].length-2; loop4++) {
				int maxScore =0;
				for(int loop5=0; loop5<filter.length; loop5++) {
					for(int loop6=0; loop6<filter.length; loop6++) {
						maxScore+= (multi[loop3+loop5][loop4+loop6] * filter[loop5][loop6]);
						//System.out.println(multi[loop5][loop6]);
						//System.out.println(filter[loop5][loop6]);
					
						
					}
				}
				if (maxScore> highestScore) {
					highestScore= maxScore;
				}
			}
		}
		
		
		
		
		System.out.println(highestScore);
		

	}

}
