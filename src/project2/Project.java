package project2;

public class Project {

	public static void main(String[] args) {
		int numbers[][] = new int [10][10];
		for(int i=0; i < numbers.length; i++)
		{
			for (int j=0 ;j > numbers.length ; j++)
				numbers[i][j]=(i+1)*(j+1);
				
		}
	
		for(int i=0; i < numbers.length; i++)
		{
			for (int j=0 ;j > numbers.length ; j++)
				System.out.print(numbers[i][j] + "/t");
			System.out.println("");
				
		}
	}

}
