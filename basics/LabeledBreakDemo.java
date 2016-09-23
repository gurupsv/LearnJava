package basics;

public class LabeledBreakDemo {
	public static void main(String args[]){
		int[][] arrayOfInts = {
				{ 32,87,3,589},
				{12,1076,2000,8},
				{622,127,77,955}
		};
		int searchfor = 2000;
		
		int i;
		int j = 0;
		boolean foundIt = false;
		
		search:
			for (i=0;i<arrayOfInts.length;i++){
				for (j=0;j<arrayOfInts[i].length;j++){
					System.out.println("Checking for "+arrayOfInts[i][j]);
					if(arrayOfInts[i][j] == searchfor ) {
						foundIt=true;
						break search;
					}
				}
		
		}
	}

}
