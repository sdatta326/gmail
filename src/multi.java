
public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
int a[]=new int[6];
int arr[][]= {{10,20,30},{30,40,60},{40,60,80}};
int arrt[][]=new int[3][3];
int carr[][]=new int[3][3];
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
		
	{
		arr[i][j]=c++;
		System.out.println(arr[i][j]+" ");
		carr[i][j]=arr[i][j]+arrt[i][j];
	}
}

	}
}
//for rough purpose
//char[] ch={'a','b','c'.'d'};
//String s=new String(ch);
//String s="javapoint"
//char ch[]={'a','b'};
//String s=new String[ch];
//String s="ab";

