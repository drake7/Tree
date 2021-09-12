package day1;

public class BadProject {
public static void main(String...s)
{
boolean versions[]= {false,false,false,false,false,false,false,true,true,true,true,true,true,true,true};	
System.out.println(isBadVersion(versions));
}

public static int isBadVersion(boolean versions[])
{
	int left=0,right=versions.length-1;
	int index=0;
	while(left<=right)
	{
		int mid=(left+right)/2;
	if(versions[mid]==true)	
	{
		index=mid;
	right=mid-1;	
}
	else
	{
		
		left=mid+1;
	
	}
	}
return index;	
}


}
