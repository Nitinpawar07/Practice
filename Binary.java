class Binary // search algorthms
{
public static int search(int arr[],int n,int data)
{
int l=0,r=n-1;
while(l<=r)
{
 int mid=(l+r)/2;
  
  if(data==arr[mid])
  {  
    

    return mid;
  }
  
  else if(data<arr[mid])
  {
	  r=mid-1;
  }
  else 
  {
	 l=mid+1;
	 
  }
  

}
return -1;
}

public static void main(String arg[])
{
	int arr[]={5,9,17,23,25,45,59,63,71,89};
	int n=arr.length;
	int key=10;
	int result=search(arr,n,key);
	
	if(result!=-1)
	{
		System.out.print("element found at index :"+result);
	}
	else{
		
		System.out.print("element not found  :"+result);
	}
	
}

}