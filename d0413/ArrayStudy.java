package kr.hs.dgsw.java.dept2.d0413;

public class ArrayStudy {
	public void studyArray() {
		//배열선언
		{
			int array1[];
			int[] array2;
		}
		
		//배열의 정의
		{
			String[] countries = new String[5];
			
			//배열에 값 할당
			countries[0]  = "Korea"; //countries의 0번째 위치에 Korea 할당
			countries[1] = "Germany";
			
			//countries[100] = "Japan"; //countries의 크기가 5인데 100번째에 값을 넣으라고 하니 예외 발생
			//countries[-1] = "Japan";// 음수 값은 허용되지 않음
		}
		
		//배열의 초기 값
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
		
		//배열의 초기화
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
			
			for(String color:colors) {//배열을 한바퀴도는 for문 위에 인덱스의 값이 color에 들어간다
				System.out.println(color);
			}
		}
		
		//평균값 구하기
		{
			int[] ages = {18,20,52,31,8,13,22,31,3,12};
			double average = 0;
			int sum=0;
			for(int age :ages) {
				sum+=age;
			}
			average = sum/(double)ages.length;
			
			System.out.printf("나이평균 : %.2f\n",average);
		}
		
		//
		{
			int value1 = 3;
			int value2 = value1;
			value2 = 10;
			System.out.println("int : "+ value1+" "+ value2);
			int[] array1 = {1,2,3};
			int[] array2 = array1; //array1과 array2는 같은배열을 가르키게 됨
			int[] array3 = copy(array1);
			array2[1] = 100; 

			System.out.println("array :" + array1[1]+ " " + array2[1]+" "+array3[1]); //100 100
			
		}
		
	}
	//배열 복사
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
