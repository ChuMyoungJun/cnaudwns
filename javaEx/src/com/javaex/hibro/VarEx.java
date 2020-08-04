package com.javaex.hibro;

public class VarEx {
	public static void main(String[] args) {
		// 변수 식별자
		// 문자, 숫자, $, _의 조합
		// 다만, 숫자로 시작하면 안됨
		
		/*
		 * 변수명 관련
		 *  변수명은 소문자로 작성
		 *   단어의 조합일 경우 두 번째 단어는 대무자로 시작
		 */
		int myAge; // 4byte 변수 공간을 만들었다
		myAge = 29;
		int myAge2 = 29; // 선언과 초기화를 동시에 할 수 있다.
		// 변수의 경우 선언시 지정한 데이터 타입 이외의 데이터는 너을 수 없다.
		// myAge = 123456789012345678920; // Error
		// 조회와 변경
		System.out.println("myAge의 내용 : " + myAge);
		myAge = myAge + 1;
		System.out.println("변경된 myAge의 내용 : " + myAge);
	}
}
