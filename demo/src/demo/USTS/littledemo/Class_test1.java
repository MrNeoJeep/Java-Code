package demo.USTS.littledemo;

public class Class_test1 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(i <= 100 )
		{
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
		i = 1 ;
		sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=100);
		System.out.println("sum = " + sum);
		int sum2 = 0;
		for(int j = 0; j<=100;j++)
		{
			sum2 += j;
		}
		System.out.println("sum2 = " + sum2);
	}

}
