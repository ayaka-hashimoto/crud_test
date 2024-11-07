package test03;

import java.io.IOException;
import java.time.Instant;

public class cytech03 {

	public static void main(String[] args) throws IOException {

		long epochSecond = Instant.now().getEpochSecond();

		// 偶数か奇数かを判定
		if (epochSecond % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

	}

}
