/************************************************************************
 *
 * �ļ���:	ArrayDemo3
 * 
 * �ļ�����:	bxd_day04_01_����				
 *
 * ������:	Yao Siyuan,
 *	
 * �ܽ�:	
 *
 * �汾��:	0.1
 * 
 * �޸ļ�¼:
 *			0.1:
 * 
************************************************************************/
 

class ArrayDemo3
{
	public static void main(String[] args)
	{
		
		//����Ĳ���
		//��ȡ�����е�Ԫ��,ͨ�����õ�����
		
		//int arr[] = new int[3];
		
		int arr[] = {1,2,3,4,5,6,7};
		//��������һ������,����ֱ�ӻ�ȡ�������Ԫ��,length
		//ʹ�÷�ʽ,������.length
		/* System.out.println("length:"+arr.length);
		
		// int sum = 0;
		for(int x = 0; x < arr.length; x++)
		{
			// sum += arr[x];
			System.out.println("arr["+x+"]="+arr[x]+";"); //arr[0] = 0;
		}
	*/
	
	// System.out.println(arr);
	
	 printArray(arr);
	// printArray(arr);
	} 
	
	//���幦��,���ڴ�ӡ�����е�Ԫ��,Ԫ�ؼ��ö��Ÿ���
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		
		for(int x = 0; x < arr.length; x++)
		{	
			if(x != arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
			
		}
	}
}













