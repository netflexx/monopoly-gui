package BackEnd;

import java.util.Scanner;

import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl;

public class Monopoly extends Thread {
	Die die = new Die();
	Board board;
	int t;
	int x,y;
	String name;
	public String name1;
	String name2;
	int money,num=0;
	public int maxSteps;
	public int[][] money_array = new int[4][60];
	public int[][] location_array = new int[4][60];
	public int[][] die_array = new int[4][40];
	
//	int[] player1_money = new int[50];
//	int[] player1_money = new int[50];
//	int[] player1_money = new int[50];
	public Monopoly() {	
	}
	public int getJ(int t) {
//		System.out.println(t);
		return this.t = t;
	}
//	public void printout(Player player) {
//		System.out.println(player);
//		return this.name=player;	
//		return player;
//	}
	public void rungame() throws InterruptedException {

		System.out.println("\tMonopoly\n");
		board = new Board(t);
		startGame();
	}

	public void startGame() throws InterruptedException {
		System.out.println("Game start!");
		System.out.println("========");
//		for (int i=0; i<40;i++) {
//			player1_money[i]=10;
//		}
		while (!isGameEnd() && !board.hasWinner()){
//			Thread.sleep(100);
			if(!board.getCurrentPlayer().isBrokeOut()){
				int face = board.getCurrentPlayer().tossDie(die);
				board.movePlayer(board.getCurrentPlayer(), face);
//				printout(board.getCurrentPlayer().name);
//				printout(board.getCurrentPlayer());
				
				y=board.getCurrentPlayer().getID();
				x=board.getCurrentPlayer().totalWalk;
				  
				money_array[y][x]    = board.getCurrentPlayer().getMoney().getMoney() ;
				location_array[y][x] = board.getCurrentPlayer().getCurrentPosition() ;
				die_array[y][x]      = face;
				System.out.println("Die rolled "+die_array[y][x] );
				
				System.out.println(y+ " " +x);
				System.out.println("Current money "+money_array[y][x]);
				maxSteps = x;

				
//				System.out.println(board.getCurrentPlayer().getID());
//				System.out.println(board.getCurrentPlayer().totalWalk);
//				System.out.println(board.getCurrentPlayer().getMoney().getMoney());
				
				System.out.println("POS is "+board.getCurrentPlayer().getCurrentPosition());
//				System.out.println("Money is "+board.getCurrentPlayer().getMoney().getMoney());
//				maxSteps = board.getCurrentPlayer().getCurrentPosition();
				
			}
			board.nextTurn();
		}
		System.out.println("========");
		if(board.hasWinner()){
			name1 = board.getWinner().getName() + " wins. Last one staning!";
		}else{
			name1 = board.getMaxMoneyPlayer().getName() + " wins. Being the richeeessst!";
		}
		System.out.println("Game over!");
	}
	
	public boolean isGameEnd() {
		for(Player player:board.getPlayers()){
			if(player.getTotalWalk() < 20){ return false; }
		}
		return true;
	}
}
