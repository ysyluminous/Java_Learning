/************************************************************************
 *
 * �ļ���:	FunctionOverload		
 * 
 * �ļ�����:	bxd_day03_��������.java
 *
 * ������:	Yao Siyuan,								
 *	
 * �ܽ�:	ʲôʱ��������:
 *			������Ĺ�����ͬ,�����������λ�����ݲ�ͬ
 *			�Ͷ���һ����������,�Ա�ʾ�书��,�����Ķ�,
 *			��ͨ�������б�Ĳ�ͬ�����ֶ��ͬ������.---����
 *
 * �汾��:	0.1
 * 
 * �޸ļ�¼:
 *			0.1:
 * 
 ************************************************************************/


class FunctionOverload
{
	public static void main(String[] args)
	{
		//add(4,5);
		//add(4,5,6);
		System.out.println("hello world");
		
	}

 
	//����һ���ӷ�����,��ȡ���������ĺ�
	public static int add(int x, int y)
	{	
		return x+y;
	}

	//����һ���ӷ�,��ȡ���������ĺ�
	public static int add(int x,int y, int z)
	{
		return x+y+z;
	}

	public static void print99(int num)
	{
		for (int x = 1; x<=num; x++)
		{
			for (int y =1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
 
	public static void print99()
	{
		for (int x = 1; x<=9; x++)
		{
			for (int y =1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
 
 
}
 
 
 
 
 
 
 
 
 
 