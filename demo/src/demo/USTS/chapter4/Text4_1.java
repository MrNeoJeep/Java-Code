package demo.USTS.chapter4;

public class Text4_1 {

	
	public static void main(String[] args) {
		// this chapter is about array;
		//现有一个数组，要求去掉其中值为1的项，生成一个新数组
		int oldArr[] = {1,3,5,1,1,6,6,1,5,7,6,7,1,5};
		int newArr[] = new int[20];//注意：int newArr[] = new int[];是不被允许的
		int size = 0;
		for(int i = 0;i < oldArr.length;i++)
		{
			if(oldArr[i] != 1)
			{
				newArr[size] = oldArr[i];
				size++;
			}
		}
		//遍历新数组
		for(int i = 0 ; i < size ;i++)
		{
			System.out.print(newArr[i] + " ");
		}
	}

}
