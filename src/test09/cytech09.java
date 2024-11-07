package test09;

public class cytech09 {

	public static void main(String[] args) {

		String[] kyouka = { "国語", "数学", "理科", "社会" };

		int[][] ten = { 
				{ 10, 30, 50, 100 }, 
				{ 20, 30, 50, 50 }, 
				{ 10, 20, 100, 100 }, 
				{ 30, 100, 50, 100 },
				{ 50, 30, 50, 10 } };

		for (int i = 0; i < ten.length; i++) {
			System.out.print("学生" + (i + 1) +"→");

			for (int j = 0; j < ten[i].length; j++) {
				System.out.print(kyouka[j] + ": " + ten[i][j] + " ");

			}
			System.out.println("");
		}

	}
}
