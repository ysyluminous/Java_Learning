/************************************************************************
 *
 * �ļ���:	ExceptionDemo2
 *
 * �ļ�����:	��9��_05_�������_�쳣����
 ��9��_06_�������_�쳣try-catch
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


/*
�쳣:���ǳ���������ʱ���ֵĲ����������
�쳣����������Ҳ����ʵ������һ����������Ҳ����ͨ��java�۵���ʽ��������������װ�ɶ���
	��ʵ����java�Բ������������������Ķ������֡�

��������Ļ��֣����֣�һ�������ص����⣬һ���Ƿ����ص����⡣
	����errorһ�㲻��д����ԵĴ��������д���
���ڷ����صģ�javaͨ��Exception�����������
	����Exception����ʹ������ԵĴ���ʽ���д���

����Error����Exception������һЩ�������ݡ�
���磺�������������Ϣ������ԭ��ȡ�

Throwable
	|--Error
	|--Exceotion

2���쳣�Ĵ���
java�ṩ�����е������д���
try
{
	��Ҫ�����Ĵ��룻
}
catch(�쳣�� ����)
{
	�����쳣�Ĵ��룻(����ʽ)
}
finaly
{
	һ����ִ�е���䣻
}

3.�Բ��񵽵��쳣������г�������������
	String getMessage() :��ȡ�쳣����Ϣ


�ں����������쳣
������߰�ȫ�ԣ��õ��ó����д������������ʧ��

�Զ��쳣�Ĵ���
1.�����쳣ʱ�򣬽���������Ϊ������쳣����������Ŀ��Ը����塣

*/



class Demo
{
    //�ڹ�����ͨ��throws�ؼ��������˸ù����п��ܻ��������
    int div(int a, int b)  throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
        int [] arr = new int [a];
        System.out.println(arr[5]);
        return a / b;
    }
}


class ExceptionDemo2
{
    public static void main(String args []){ //throws Exception

        Demo d = new Demo();
        try{
            int x = d.div(5,1);
            System.out.println("x="+x);
        }

        catch(ArithmeticException e)
        {
                                        //��������ý�������Ķ���
            System.out.println("��0��"); //Exception e = new ArithmeticException();
            System.out.print(e.toString());

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e.toString());
            System.out.print("�Ǳ�Խ����");

        }

        System.out.println("Over");



    }
}













