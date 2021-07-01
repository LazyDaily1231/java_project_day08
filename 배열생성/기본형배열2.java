package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {
		
		//int [] : int 배열을 가르키는 주소
		// s : heap 영역에 할당된 저장 공간의 주소가 들어간다
		// = : heap 영역에 할당된 주소를 변수에 넣는다
		// new : heap 영역에 지정된 타입의 크기만큼 배열을 만들어라
		// int [10] : 배열을 만들어질 데이터 타입과 크기가 설정
		// 1    2    3
		// 1->3->2의 순서
		int[] s = new int[10];
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
		System.out.print(s[i] + " ");
			//배열은 자동 초기화 개꿀
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			 s[i] = i;
		}
		for (int i = 0; i < s.length; i++) {
			 System.out.print(s[i] + 1 + " ");
		}
		
		
	}

}
