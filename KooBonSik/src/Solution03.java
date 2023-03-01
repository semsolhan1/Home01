import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int count = 5;
		
		int i;
		for(i=0; i<scores.length; i++) {
			System.out.println("점수를 입력하세요 ");
			int score = sc.nextInt();
			
			scores[i] = score;
		}
		int beer = 5;
		for(int l=0; l<beer; l++) {
			int max = 0;
		for(int j=0; j<5; j++) {
			if(max < scores[i]) {
				max = scores[i];
				System.out.println(max);
				
			}
		}
		System.out.println("점수" + max + "순위" + count);
		count -= 1;
		if(max == scores[i]) {
			for(int k=scores[i]; k<scores.length; k++) {
				scores[i] = scores[i+i];
			}
			
		}
//		scores[scores.length-1];
		}
		
		sc.close();






	}
}
