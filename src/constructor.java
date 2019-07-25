
class s
{

int i;
Address add;
 public s(int i,Address add)
 {
	this.i=i;
	this.add=add;
 }
 
 public void show()
 {
	 System.out.println(i+" "+add.ad);
 }

}






public class constructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//c o2=new c();


Address aa=new Address("delhi");
s o1=new s(10,aa);
o1.show();


//o2.f2();

//o2.f();
	}

}


