/* 
this���
�����ڹ��캯��֮������໥���á�

this���ֻ�ܶ����ڹ��캯���ĵ�һ������Ϊ��ʼ��Ҫ��ִ�С�
 */
 
 class Person
 {
	 private String name;
	 private int aeg;
	 
	 {
		 
		 System.out.println("code run");
	 }
	 
	 Person()
	 {
		 //this("haha");
		 System.out.println("Person run");
	 }
	 Person(String name)
	 {
		 //this();
		 this.name = name;
	 }
	 Person(String name,int age)
	 {
		 //this(name);
		 //this.name = name;
		 this.age = age;
	 }
	 
 }
 
 class PersonDemo4
 {
	 public static void main(String [] args)
	 {
		 new Person();
		 //Person p = new Person("lisi",30);
		 
		 //Person p1 = new Person("lisi2",36);
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 