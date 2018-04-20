package tictacto;

import java.util.Scanner;

public class Game {
	private char x;
	private char o;
	private int boardSize = 0;
	private String[] board;
	
	public Game(){
		this.x = 'x';
		this.o = 'o';
		boardCreate();
		
	}
	
	public void boardCreate(){
		System.out.println("How big do you want this board?");
		Scanner scanner = new Scanner(System.in);
		this.boardSize = scanner.nextInt();
		System.out.println(boardSize);
		
	}
	public static void main(String[] args) {
		new Game();
		
	}

}
