interface i
{
	public abstract void show();
}
public class interface_cl  implements i{
	public void show()
	{
		System.out.println("hello show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
i o=new interface_cl();
o.show();
	}

}
