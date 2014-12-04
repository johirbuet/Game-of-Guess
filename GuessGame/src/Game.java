import java.util.Scanner;


public class Game {
	private static Board board;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		boolean again=true;
		while(run&&again){
			System.out.println("Enter the name of player:");
			String player=sc.next();
			board=new Board(player);
		while(run){
			int randStr=(int) (Math.random()*board.districtBD.length);
			System.out.print(board.getString(randStr).charAt(0));
			for(int i=0;i<board.getString(randStr).length()-2;i++)
				System.out.print("*");
			System.out.println(board.getString(randStr).charAt(board.getString(randStr).length()-1));
			//sc.nextLine();
			System.out.println("Can you guess the name:");
			String guess=sc.next();
			if(guess.equals(board.getString(randStr)))
			{
				System.out.println("Excellent! You are right");
				board.addScore();
			}
			else
			{
				System.out.println("You are wrong. The rigtht word is "+board.getString(randStr));
				System.out.println(board.getName()+"'s Score is "+board.getScore());
				board.setMaxScore(board.getScore(), board.getMaxScore());
				System.out.println("Max Score is= "+board.getMaxScore());
				System.out.println("Try again? yes/no");
				String str=sc.next();
				if(str.equals("no"))
				{
					run=false;
					again=false;
				}
				else
				{
					run=true;
					break;
					
				}
				
			}
		}
		}
	}
}
