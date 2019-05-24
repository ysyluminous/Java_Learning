package bxd;
/************************************************************************
*
* �ļ���:	ArrayTest4
* 
* �ļ�����:	����Ĳ��Ҳ��� 
* 			�۰���� 
*          	��ϰ
*			
*			��ϰ:��һ�����������,��Ҫ��һ��Ԫ�ز��뵽��������,
* 			��Ҫ��֤�������������.��λ�ȡ��Ԫ���������е�λ��
*
* ������:	Yao Siyuan 2016��5��26��18:47:38
*	
* �ܽ�:		
*
* �汾��:	0.1
* 
* �޸ļ�¼:
*			0.1:
* 
************************************************************************/

class ArrayTest4
{                  
	public static void main (String[] args)
	{
		// int [] arr = {2,4,5,6,83,1};
		// int index = getIndex(arr,83);
		
		int [] arr = {2,4,5,6,8,9};
		int index = getIndex_2(arr,7);
		System.out.println("index = "+index);
	}
	
	/*
		�۰����,���Ч��,���Ǳ���Ҫ��֤�����������������
	*/
	public static int halfSearch(int arr[],int key)
	{
		int min,max,mid;
		
		min = 0;
		max = arr.length - 1;
		mid = (max + min) / 2;
		
		while(arr[mid] != key)
		{
			if(key > arr[mid])
				min = mid + 1;
			else if(key < arr[mid])
				max = mid - 1;
			
			if(min > max)
			return -1;
			
			mid = (max + min) / 2;
			
		
		}
		return mid;
	}
	
	public static int halfSearch_2(int arr[], int key)
	{
		int min = 0, max = arr.length - 1, mid;
		
		while(min <= max)
		{
			mid = (max + min) >> 1; //����nλ���ǳ���2��n�η�
			
			if(key > arr[mid])
				min = mid + 1;
			else if (key < arr[mid])
				max = mid - 1;
			else 
				return mid;
		}
		return -1;
	}
	//���幦��,��ȡkey��һ�γ����������е�λ��,�������-1�����key�������в�����
	public static int getIndex(int[] arr, int key)
	{
		
		for(int x = 0; x < arr.length; x++)
		{
			if(arr[x] == key)
			return x;
		}
		return -1;
		
	}
	
	/* ��ϰ
	��ϰ:��һ�����������,��Ҫ��һ��Ԫ�ز��뵽��������, 
	��Ҫ��֤�������������.��λ�ȡ��Ԫ���������е�λ�� 
	*/

	
	public static int getIndex_2(int[] arr, int key)
	{
		
		int min = 0, max = arr.length - 1, mid;
		
		while(min <= max)
		{
			mid = (max + min) >> 1; //����nλ���ǳ���2��n�η�
			
			if(key > arr[mid])
				min = mid + 1;
			else if (key < arr[mid])
				max = mid - 1;
			else 
				return mid;
		}
		return min;
		
	}
	
}








