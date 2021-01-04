import java.util.Scanner;
public class DataAnalysis {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter the Sample Size: ");
		int sampleSize = in.nextInt();
		int trialSize = 5;
		int[] data = new int[sampleSize * trialSize];
		int[] total = new int[trialSize];
		int[] average = new int [trialSize];
		
		int i = 1;
		int j = 1;

		for (i=1;i <trialSize;i++)
		{
			System.out.println("Enter number number for Trial " + i);

			for (j=1;j<sampleSize;j++)
			{
			System.out.print("Enter Sample # " + j + ":");
			data[j* trialSize + i] = in.nextInt();
			total[i] += data[j* trialSize + i]; 
		}
			System.out.print("\n");
	}	
	for (i=1; i<trialSize; i++)
		average[i] = total[i] / sampleSize;
	
	int min = average[0];
	int max = average[0];
	
	for (i=1; i<trialSize; i++)
	{
		if (average[i]< min)
			min = average[i];
		if (average[i]> max)
			max = average[i];
	}
	
	System.out.println("\tSample #\tTrial 1\t\tTrial 2\t\tTrial 3\t\tTrial 4"); 
	
	for (j=1; j < sampleSize; j++)
	{
		System.out.print("\t" + j + "\t");
		
		for (i=1; i < trialSize; i++)
		{
		System.out.print("\t" + data[j* trialSize + i] + "\t");
	}
		System.out.print("\n");
}
	System.out.println("\t ---------------------------------------------------------------------");
	System.out.print("Averages: \t\t");
	
	for (i=1; i<trialSize; i++)
		System.out.print(average[i] + "\t\t");
	System.out.print("\n");
	System.out.println("Min average" + ": " + min);
	System.out.println("Max average" + ": " + max);
	System.out.print("\n");
	
	if  ( min == max) {
	System.out.print("The trials match EXACTLY!");
	} 
	else if (max < (min *2)) {
		System.out.print("The trials concur with each other!");
		}
	else {	
	System.out.print("The trials do not concur!");
	}
}
}