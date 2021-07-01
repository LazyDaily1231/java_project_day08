package 배열생성;

import java.util.Iterator;

public class 배열문제1 {

	public static void main(String[] args) {
		// 1.int 크기인 배열을 생성
		// 2.배열의 크기를 프린트해보세요
		// 3.배열의 마지막 위치에 100을 넣어서 프린트
		// 4.배열의 마지막 위치에 500을 넣어서 프린트
		// 5.배열의 3번쨰 위치에 200을 넣어서 프린트
		// 6.배열의 전체 데이터를 프린트
		// 7.배열의 전체 데이터를 인덱스와 함께 프린트
		// 8.그림 그리기
		
		// 1.int 크기인 배열을 생성
		int [] s = new int[5];
		
		// 2.배열의 크기를 프린트해보세요
		System.out.println(s.length);
		
		// 3.배열의 마지막 위치에 100을 넣어서 프린트
		s[0] = 100;
		System.out.println(s[0]);
		
		// 4.배열의 마지막 위치에 500을 넣어서 프린트
		
		s[4] = 500;
		//s[n.length -1] = 500; -> 마지막 위치는 이렇게 표현 가능
		System.out.println(s[4]);
		
		// 5.배열의 3번쨰 위치에 200을 넣어서 프린트
		s[2] = 200;
		System.out.println(s[2]);
		
		System.out.println();
		// 6.배열의 전체 데이터를 프린트
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		// 7.배열의 전체 데이터를 인덱스와 함께 프린트
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ":"+ s[i]);
		}
	}

}
