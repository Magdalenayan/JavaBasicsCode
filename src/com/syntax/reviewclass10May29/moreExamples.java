package com.syntax.reviewclass10May29;

public class moreExamples {

	public static void main(String[] args) {
int[][] nums= {
		{1 , 2, 3, 4, 5 },
		{199, 300, 588, 700},
		{1900, 4578, 98787 },
};
//i loop interates over rows
//nums.lenght gives # of arrays inside 2D array=3
//j loop interates over columns
for(int i=0; i<nums.length; i++) {
	for(int j=0; j<nums[i].length; j++) {
		System.out.print(nums[i][j]+"  ");
		
	}
	System.out.println();
}
System.out.println("All value using enhanced for loop");
	}

}
