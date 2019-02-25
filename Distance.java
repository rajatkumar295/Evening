package package1;
import java.util.*;
class point1
{
	double x,y;
	point1(double a,double b)
	{
		x=a;
		y=b;
	}
	
}
class solutions
{
	double findsequentialdistance(point1 a[])
	{
		double sum=0;
	  for(int i=0;i<a.length-1;i++)
	  {
		  double s1=a[i+1].x-a[i].x;
		  double s2=a[i+1].y-a[i].y;
		  double s3=s1*s1+s2*s2;
		  double s4=Math.sqrt(s3);
		  sum=sum+s4;
	  }
	  return sum;
	}
}
public class Distance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		point1 arr[]=new point1[n];
		for(int i=0;i<n;i++)
		{
			double d1=s.nextInt();
			double d2=s.nextInt();
			point1 a=new point1(d1,d2);
			arr[i]=a;
		}
		solutions s1=new solutions();
		System.out.println(s1.findsequentialdistance(arr));
	}

}
