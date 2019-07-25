
public class construct {
	int i;
	int j;
	construct(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	construct()
	{
		
	}
	/*construct(construct s1 )
	{
		i=s1.i;
		j=s1.j;
	}*/
	 void show()
	{
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
construct s1=new construct(10,20);
//construct s2=new construct(s1);
construct s2=new construct();
s2.i=s1.i;
s2.j=s1.i;


s1.show();
s2.show();


	}

}
