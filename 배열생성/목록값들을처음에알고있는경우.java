package 배열생성;

public class 목록값들을처음에알고있는경우 {

	public static void main(String[] args) {
		//배열을 만들때는 처음부터 값들을 알고있는 경우/모르는 경우
		
		String[] names = {"홍길동", "송길동", "정길동", "박길동" , "장길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String s : names) {
			System.out.println(s);
		}
		
		int[] ages = {100, 88, 55 ,10, 4};
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		for (int x : ages) {
			System.out.println(x);
		}
		
		
		double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
		for (int j = 0; j < eyes.length; j++) {
			System.out.println(eyes[j]);
		}
		for (double d : eyes) {
			System.out.println(d);
		}
		
		
		char [] gender = {'남', '여', '남', '여', '남'};
		for (int k = 0; k < gender.length; k++) {
			System.out.println(gender[k]);
		}
		for (char c : gender) {
			System.out.println(c);
		}
		
		boolean[] food = {true, false, true, false, true};
		for (int l = 0; l < food.length; l++) {
			System.out.println(food[l]);
		}
		for (boolean b : food) {
			System.out.println(b);
		}
		
	}

}
