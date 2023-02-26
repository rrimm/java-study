package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 50) + 1 + "");
		}
		Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());	//next의 반환값이 Object타입이므로 형변환해야 함
				System.out.println((board[i][j] < 10 ? "" : "") + board[i][j]);
			}
			System.out.println();
		}

	}

}
