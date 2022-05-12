package kr.hs.dgsw.java.dept2.d0413;

public class ArrayStudy {
	public void studyArray() {
		//�迭����
		{
			int array1[];
			int[] array2;
		}
		
		//�迭�� ����
		{
			String[] countries = new String[5];
			
			//�迭�� �� �Ҵ�
			countries[0]  = "Korea"; //countries�� 0��° ��ġ�� Korea �Ҵ�
			countries[1] = "Germany";
			
			//countries[100] = "Japan"; //countries�� ũ�Ⱑ 5�ε� 100��°�� ���� ������� �ϴ� ���� �߻�
			//countries[-1] = "Japan";// ���� ���� ������ ����
		}
		
		//�迭�� �ʱ� ��
		{
			int[] intArray = new int[1];
			double[] doubleArray = new double[1];
			boolean[] booleanArray = new boolean[1];
			String[] stringArray = new String[1];
			
			System.out.println("int : "+ intArray[0]); //0
			System.out.println("double : "+ doubleArray[0]); //0.0
			System.out.println("boolean : "+ booleanArray[0]); //false
			System.out.println("String : "+ stringArray[0]); //null
		}
		
		//�迭�� �ʱ�ȭ
		{
			String[] colors = {"red","green","blue","megenta"};
			int[] numbrs = {1,2,3,4,5,8};
		}
		
		//Loop
		{
			String[] colors = {"red","green","blue","megenta"};
			for(int i=0; i<colors.length; i++) {
				System.out.printf("%d - %s\n",i,colors[i]);
			}
			
			for(String color:colors) {//�迭�� �ѹ������� for�� ���� �ε����� ���� color�� ����
				System.out.println(color);
			}
		}
		
		//��հ� ���ϱ�
		{
			int[] ages = {18,20,52,31,8,13,22,31,3,12};
			double average = 0;
			int sum=0;
			for(int age :ages) {
				sum+=age;
			}
			average = sum/(double)ages.length;
			
			System.out.printf("������� : %.2f\n",average);
		}
		
		//
		{
			int value1 = 3;
			int value2 = value1;
			value2 = 10;
			System.out.println("int : "+ value1+" "+ value2);
			int[] array1 = {1,2,3};
			int[] array2 = array1; //array1�� array2�� �����迭�� ����Ű�� ��
			int[] array3 = copy(array1);
			array2[1] = 100; 

			System.out.println("array :" + array1[1]+ " " + array2[1]+" "+array3[1]); //100 100
			
		}
		
	}
	//�迭 ����
	public int[] copy(int[] src) {
		int[] result = new int[src.length];
		for(int i =0; i<src.length; i++) {
			result[i] = src[i];
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
		study.studyArray();
	}
}
