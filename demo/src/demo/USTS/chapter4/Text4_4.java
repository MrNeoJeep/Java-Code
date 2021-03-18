package demo.USTS.chapter4;

public class Text4_4 {

	public static void main(String[] args) {
		// 给定一个数组，写一个expand函数，把原有数组扩容一倍，并保留原有数组的内容
		int []a = {1,2,3};
		a =expand(a);
		for(int i = 0; i < a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
	public static int[] expand(int arr[])
	{
		//扩容
		int [] b = new int[arr.length*2];
		//方法一、利用arraycopy进行扩容
		System.arraycopy(arr, 0, b, 0, arr.length);
		//方法二、赋值
//		for(int i = 0; i < arr.length;i++)
//		{
//			b[i] = arr[i];
//		}
		//方法三、利用java的方法
		//int [] b = java.util.Arrays.copyOf(arr, arr.length*2);
		return b;
	}

}
