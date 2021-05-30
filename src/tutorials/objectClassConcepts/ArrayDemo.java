package tutorials.objectClassConcepts;

class Student{
	int rollNo;
	String name;
}

public class ArrayDemo {
	public static void main(String[] args) {
//		int nums[] = new int[20];
//		
//		int nums1[] = new int[10];
//		
//		int nums2[] = {2,3,4,5};
//		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();
//		
//		
//		Student s[] = {s1, s2, s3, s4};
//		
//		for(int i=0; i<4; i++)
//		{
//			System.out.println(nums2[i]);
//		}
		
//		------------------------------------------------------------
//		/*
//		*Jagged Array
//		*/
//		int d[][] = {
//						{1,2,3},
//						{4,5},
//						{7,8,9}
//					};
//		
//		System.out.println(d[1][1]);
//		
//		int i,j;
//		
//		for(i=0; i<d.length; i++)
//		{
//			for(j=0; j<d[i].length; j++)
//			{
//				System.out.print(d[i][j] + " ");
//			}
//			System.out.println();
//		}
//		------------------------------------------------------------
		
		/*
		 * Enhanced For Loop OR For-Each
		 */
		
		// For 1-D array
		int arr[] = {1,2,3,4};
		
		for(int k : arr)
		{
			System.out.println(k);
		}
		
		//For 2-D array and Jagged Array
		
		int d[][] = {
				{1,2,3},
				{4,5},
				{7,8,9}
			};
		
		for(int k[] : d)
		{
			for(int l : k)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		
	}
}
