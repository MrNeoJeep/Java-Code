package demo.USTS.chapter4;

public class Text4_4 {

	public static void main(String[] args) {
		// ����һ�����飬дһ��expand��������ԭ����������һ����������ԭ�����������
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
		//����
		int [] b = new int[arr.length*2];
		//����һ������arraycopy��������
		System.arraycopy(arr, 0, b, 0, arr.length);
		//����������ֵ
//		for(int i = 0; i < arr.length;i++)
//		{
//			b[i] = arr[i];
//		}
		//������������java�ķ���
		//int [] b = java.util.Arrays.copyOf(arr, arr.length*2);
		return b;
	}

}
