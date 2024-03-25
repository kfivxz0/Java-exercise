public class StringMethodEx {

	public static void main(String[] args) {
		String str = "Hello My Name is Hong Gil Dong";

		System.out.println(str.charAt(17)); // 해당 인덱스의 문자
		System.out.println(str.equals("Hello My Name is Hong Gil Dong")); // 문자열 값 비교
		System.out.println(str.indexOf("Hong")); // 해당 문자열의 인덱스
		System.out.println(str.substring(17)); // 17번 인덱스부터 끝까지 잘라냄
		System.out.println(str.substring(6, 13)); // 6번 인덱스부터 13전(12번 인덱스)까지 문자열
		System.out.println(str.toUpperCase()); // 대문자로 변환
		System.out.println(str.toLowerCase()); // 소문자로 변환
		System.out.println(str.length()); // 문자열의 길이
		System.out.println(str.startsWith("Hello")); // "Hello"로 시작하는 여부
		System.out.println(str.endsWith("Dong")); // "Dong"으로 끝나는지 여부
		System.out.println(str.replace("Hong", "Kim")); // "Hong"을 "Kim"으로 치환
		System.out.println(str.replaceAll("N+", "NickName")); // N으로 시작하는 단어들을 NickName으로 치환
		System.out.println(str.trim()); // 앞뒤 공백 제거
		System.out.println(str.replaceAll(" ", "")); // replace를 응용해 모든 공백 제거
		System.out.println(str.toString());

		str = "홍길동,이순신,유관순,안중근";
		String[] arr = str.split(","); // ,를 구분자로 나눠서 배열로 리턴
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번 인덱스 값 = " + arr[i]);
		}

	}

}
