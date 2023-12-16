package com.nonprimitive;

public class StudentSearchSortApp {
	static public boolean studentLinearSearch(Student []arr,String nameKey)
	{
	for(int i=0;i<=arr.length-1;i++)
	{
	if(arr[i].name.equals(nameKey))
	{
	System.out.println("Student Found");
	return true;
	}
	}
	return false;
	}
	static public void studentBubbleSort(Student arr[])
	{
	for(int i=0;i<=arr.length-2;i++)
	{
	for(int j=0;j<=arr.length-2-i;j++)
	{
	if(arr[j].id>arr[j+1].id)
	{
	Student temp;
	temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
	}
	}
	}
	}
	public static boolean studentBinarySearch(Student arr[],int idKey)
	{
	int low=0;
	int high=arr.length-1;
	while(low<=high)
	{
	int mid=(low+high)/2;
	if(arr[mid].id==idKey)
	{
	System.out.println("Student Id Found and the name is "+arr[mid].name);
	return true;
	}
	else if(idKey>arr[mid].id)
	{
	low=mid+1;
	high=high;
	}
	else
	{
	high =mid-1;
	low=low;
	}
	}
	return false;
	}
	static public void studentArrayPrint(Student []arr)
	{
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+" | ");
	}
	}
	static public void studentAppRatingPrint(int noofstars)
	{
	for(int i=1;i<=noofstars;i++)
	{
	System.out.print("* ");
	}
	}


}
