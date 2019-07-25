abstract class m
{
	int i=8;
	public abstract void show();
	
}

class abstraction extends m{
public void show()
{
	System.out.println("hello abstarct ");	
}

	public static void main(String args[])
	{
		System.out.println("hello");
		
		
		m o=new abstraction();
		//System.out.println(o.i);
		o.show();
		
	}
}
