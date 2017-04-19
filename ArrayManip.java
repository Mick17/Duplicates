import java.util.Scanner;
import java.util.Arrays;

public class ArrayManip
{
	public static void main (String [] args)
	{
		int myNum = 4;
		int[] myArray={1,2,3,1};
		testSearchNum();
		testHasDuplicates();
		testRemoveDuplicates();
		testContainsAll();
		testCommonElements();
	}

	public static boolean searchNum(int[] myArray, int num)
	{
			boolean searchNum = false;
			if (searchNum = false)
			{
				for(int i=0; i<myArray.length; i++)
				{
					if (myArray[i] == num)
					{
						searchNum=true;
					}
				}
			}
			
		return searchNum;
	}

	public static void testSearchNum()
	{
		int myArray
		
		for (int j=0;j<size.length;j++)
		{
			int num = size.nextInt();
			array[j] = num;
		}
	}
	
	public static boolean hasDuplicates(int[] listA)
	{
	boolean containsduplicates=false;

	for(int i=0;i<listA.length;i++)
	{
		for (int j = i + 1 ; j<listA.length; j++)
		{
			if(listA[i].equals(listA[j]))
				containsduplicates=true;
			}
		}
		return containsduplicates;
	}

	public static void testHasDuplicates()
	{
		int userinput;
		Scanner keyboard= new Scanner(System.in);
		System.out.print("enter array size");
		userinput= Integer.parseInt(keyboard.nextLine());

		int[] listA=new int[userinput];

		for(int i=0;i<listA.length;i++){
			System.out.print("Enter in numbers:");
				listA[i]= Integer.parseInt(keyboard.nextLine());
					
		}
		
	containsduplicates=hasDuplicates(listA);
	System.out.print(hasDuplicates);
	}

	public static int[] removeDuplicates(int[] listA)
	{
			boolean duplicatefound;
			int [] newListA = new int [listA.length];

			int duplicatecounter=0;

			for (int i=0;i<listA.length ;i++ )
			{
				duplicatefound=false;
				for (int j=0;j<i-duplicatecounter ;j++ )
				{
					if (listA[i]==newListA[j])
					{
						duplicatefound=true;
						duplicatecounter++;
					}
				}

				if (!duplicatefound)
				{
					newListA[i-duplicatecounter]=listA[i];
				}
				
			}

			int [] newListA1 = new int [newListA.length-duplicatecounter];

			for (int i=0;i<newListA1.length ;i++) {
				newListA1[i]=newListA[i];
			}

			return newListA1;
	}

	public static boolean containsAll(int[] listA, int[] listB)
	{
		containsboth = false;
		
		for(int i=0;i<listA.length;i++)
		{
			for(int j=0;j<listB.length;j++)
			{
				if(listA==listB)
					containsboth=true;
			}
		}
		return containsboth;
	}
	public static void testContainsAll()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("enter size of array");
		int userinput=Integer.parseInt(keyboard.nextLine());
		
		System.out.print("enter size of array");
		int userinput2=Integer.parseInt(keyboard.nextLine());
		
		
		for(int i=0;i<userinput;i++){
			System.out.print("enter in numbers: ");
			int ListA = new int[i];
		}
			for(int j=0;j<userinput2;j++){
				System.out.print("enter in numbers");
				int ListB = new int[j];
			}

		containsboth=containsAll(ListA,ListB);
		System.out.print(containsAll);
	}
	
	public static int[] commonElements(int[] listA, int[] listB)
	{
		int iCommonElements=0, location=0;
		int [] SimilarElements = new int [listA.length];
		boolean InArray = true;

		listA = removeDuplicates(listA);
		listB = removeDuplicates(listB);

		for (int i=0;i<listA.length ;i++ ) {

			InArray = searchNum(listB, listA[i]);

			if (InArray) {

				iCommonElements++;
				SimilarElements[location] = listA[i];
				location++;
			}
		}

		int [] newListA1 = new int [iCommonElements];

		for (int i=0;i<newListA1.length ;i++) {
			newListA1[i]=SimilarElements[i];
		}

		return newListA1;
	}

	
	public static void testCommonElements()
	{
		int [] iCommonElements;
		String sListA ="List A: ";
		String sListB ="List B: ";
		String sCommonElements="Common Elements: ";

		int [] listA = {1,2,3,4,5,11,9,12,13,3,2,2,27};
		int [] listB = {5,7,77,27,3,4,5,8,8,8,9,1,2};

		for (int i=0;i<listA.length ;i++ ) {
			sListA +=  listA[i] + ",";
		}

		System.out.println(sListA);

		for (int i=0;i<listB.length ;i++ ) {
			sListB += listB[i] + ",";
		}

		System.out.println(sListB);

		iCommonElements = commonElements(listA, listB);

		for (int i=0;i<iCommonElements.length ;i++) {
			sCommonElements += iCommonElements[i] + ",";
		}

		System.out.println(sCommonElements);
	}
}