package demo.USTS.chapter4;

public class Text4_1 {

	
	public static void main(String[] args) {
		// this chapter is about array;
		//����һ�����飬Ҫ��ȥ������ֵΪ1�������һ��������
		int oldArr[] = {1,3,5,1,1,6,6,1,5,7,6,7,1,5};
		int newArr[] = new int[20];//ע�⣺int newArr[] = new int[];�ǲ��������
		int size = 0;
		for(int i = 0;i < oldArr.length;i++)
		{
			if(oldArr[i] != 1)
			{
				newArr[size] = oldArr[i];
				size++;
			}
		}
		//����������
		for(int i = 0 ; i < size ;i++)
		{
			System.out.print(newArr[i] + " ");
		}
	}

}
