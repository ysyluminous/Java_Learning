/************************************************************************
 *
 * �ļ���:	ArrayTest2
 * 
 * �ļ�����:	bxd_day04_04_��������,ѡ������
 *			����һ������{5,1,6,4,2,8,9}.
 *			1.��������
 *
 * ������:	Yao Siyuan
 *	
 * �ܽ�:		ѡ������,��ѭ������һ��,��ֵ������ͷ����
 *			ð������,���ڵ�����Ԫ�ؽ��бȽ�,�������������λ
 * �汾��:	0.1
 * 
 * �޸ļ�¼:
 *			0.1:
 * 
 ************************************************************************/
 
 
 
class ArrayTest2
{	
	//����ѡ��������
	public static void selectSort(int [] arr)
	{ 
		for (int x = 0; x < arr.length - 1; x++)
		{
			for (int y = x + 1; y < arr.length; y++)
			{
				if(arr[x] < arr[y])
				{
					int temp = arr[x];
					arr [x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	
	//������
	public static void main(String[] args)
	{
		int arr []= {1,2,3,5,6,872,2};
		
		//����ǰ;
		//printArray(arr);
		
		//����
		//selectSort(arr);
		bubbleSort(arr);
		
		//�����
		printArray(arr);	
	}
	
	//��ӡ���麯��
	public static void printArray(int arr[])
	{
		System.out.print("[");
		
		for(int x = 0; x < arr.length; ++x)
		{
			if(x != arr.length -1)
				System.out.print(arr[x]+", ");
			else
				System.out.println(arr[x]+"]");
		}
		
	}
	
	//ð������
	public static void bubbleSort(int arr[])
	{
		
		
		for(int x = 0;x < arr.length-1; x++)	
		{
			//��x��:��ÿ�αȽϵ�Ԫ�ؼ���.-1����Խ��
			for(int y = 0;y < arr.length - x-1;y++)
			{
				if(arr[y] > arr[y+1])
				{
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	
}
 
 
 
 
 
 
 
 
 
 
 
 