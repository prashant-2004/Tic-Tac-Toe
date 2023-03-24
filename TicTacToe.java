import java.util.Scanner;
import java.util.Random;
class TicTacToe 
{
	boolean flag=false;
	Scanner sc;
	String board[][]= {
					
					{"  ","|","  ","|","  "},
					{"--","-","--","-","--"},
					{"  ","|","  ","|","  "},
					{"--","-","--","-","--"},
					{"  ","|","  ","|","  "},
					
					};
	int userSymbol,compSymbol;
	String cross="X";
	String dot="O";
	TicTacToe()
	{
		sc=new Scanner(System.in);
	}
	void board()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	void getSymbol()
	{
		System.out.println("X for User and O for Computer");
		System.out.println("Enter position on which you want to draw X : ");
		userSymbol=sc.nextInt();
	}
	void putX()
	{
		switch(userSymbol)
		{
			case 1:
				if(board[0][0]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();				
				}
				
				else
				board[0][0]="X ";
				break;
			
			case 2:
				if(board[0][2]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[0][2]="X ";
				break;

			case 3:
				if(board[0][4]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[0][4]="X ";
				break;

			case 4:
				if(board[2][0]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[2][0]="X ";
				break;

			case 5:
				if(board[2][2]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[2][2]="X ";
				break;

			case 6:
				if(board[2][4]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[2][4]="X ";
				break;

			case 7:
				if(board[4][0]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[4][0]="X ";
				break;

			case 8:
				if(board[4][2]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[4][2]="X ";
				break;

			case 9:
				if(board[4][4]!="  ")
				{
					System.out.println("position is not empty");
					board();
					getSymbol();
					putX();
				}
				else
				board[4][4]="X ";
				break;
			default : 
				System.out.println("Please,Enter valid position");
		}
	}
	boolean putO()
	{
		if(board[0][0]!="  "&& board[0][2]!="  "&& board[0][4]!="  "&& 
		   board[2][0]!="  "&& board[2][2]!="  "&& board[2][4]!="  "&&
		   board[4][0]!="  "&& board[4][2]!="  "&& board[4][4]!="  ")
		{
			flag=true;
			return flag;
		}
		else
		{
			int min=1;
			int max=9;
			int diff=max-min;
			Random random=new Random();
			compSymbol=random.nextInt(diff+1);
			compSymbol+=min;
			// System.out.println(compSymbol);
			switch(compSymbol)
			{
				case 1:
					if(board[0][0]=="  ")
						board[0][0]="O ";
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;
				
				case 2:
					if(board[0][2]=="  ")
						board[0][2]="O ";

					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;

				case 3:
					if(board[0][4]=="  ")
						board[0][4]="O ";	
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;	
					// break;

				case 4:
					if(board[2][0]=="  ")
						board[2][0]="O ";	
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;

				case 5:
					if(board[2][2]=="  ")
						board[2][2]="O ";	
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;

				case 6:
					if(board[2][4]=="  ")
						board[2][4]="O ";
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;

				case 7:
					if(board[4][0]=="  ")
						board[4][0]="O ";
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;

				case 8:
					if(board[4][2]=="  ")
						board[4][2]="O ";	
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;

				case 9:
					if(board[4][4]=="  ")
						board[4][4]="O ";	
					else
					{
						putO();
						// System.out.println("position is not empty");
					}
					return flag;
					// break;
				default : 
					System.out.println("Please,Enter valid position");
					return flag;
			}
		}
	}

	public static void main(String args[])
	{
		boolean b=false,win=false,lose=false;
		// int i=1;
		TicTacToe ttt=new TicTacToe();
		while(ttt.board[0][0]=="  " || ttt.board[0][2]=="  " || 
			ttt.board[0][4]=="  "||ttt.board[2][0]=="  "||ttt.board[2][2]=="  "||
			ttt.board[2][4]=="  "||ttt.board[4][0]=="  "||ttt.board[4][2]=="  "||ttt.board[4][4]=="  ")
		{
			ttt.board();
			ttt.getSymbol();
			ttt.putX();
			b=ttt.putO();

			if(ttt.board[0][0]!="  " ||ttt.board[0][2]!="  " || ttt.board[0][4]!="  "||ttt.board[2][0]!="  "||ttt.board[2][2]!="  "||ttt.board[2][4]!="  "||ttt.board[4][0]!="  "||ttt.board[4][2]!="  "||ttt.board[4][4]!="  ")
			{
				if((ttt.board[0][0]=="X " &&ttt.board[0][2]=="X " && ttt.board[0][4]=="X ")||
					(ttt.board[2][0]=="X "&&ttt.board[2][2]=="X " && ttt.board[2][4]=="X ")||
					(ttt.board[4][0]=="X "&&ttt.board[4][2]=="X " && ttt.board[4][4]=="X ")||
					(ttt.board[0][0]=="X " &&ttt.board[2][0]=="X "&& ttt.board[4][0]=="X ")||
					(ttt.board[0][2]=="X " &&ttt.board[2][2]=="X "&& ttt.board[4][2]=="X ")||
					(ttt.board[0][4]=="X " &&ttt.board[2][4]=="X "&& ttt.board[4][4]=="X ")||
					(ttt.board[0][0]=="X "&&ttt.board[2][2]=="X " && ttt.board[4][4]=="X ")||
					(ttt.board[0][4]=="X "&&ttt.board[2][2]=="X " && ttt.board[4][0]=="X "))	
				{
					ttt.board();
					System.out.println("You Win....!!!");		
					win=true;
					break;
				}
				else if((ttt.board[0][0]=="O " &&ttt.board[0][2]=="O " && ttt.board[0][4]=="O ")||
					    (ttt.board[2][0]=="O " &&ttt.board[2][2]=="O " && ttt.board[2][4]=="O ")||
					    (ttt.board[4][0]=="O " &&ttt.board[4][2]=="O " && ttt.board[4][4]=="O ")||
						(ttt.board[0][0]=="O " &&ttt.board[2][0]=="O " && ttt.board[4][0]=="O ")||
						(ttt.board[0][2]=="O " &&ttt.board[2][2]=="O " && ttt.board[4][2]=="O ")||
						(ttt.board[0][4]=="O " &&ttt.board[2][4]=="O " && ttt.board[4][4]=="O ")||
					    (ttt.board[0][0]=="O " &&ttt.board[2][2]=="O " && ttt.board[4][4]=="O ")||
					    (ttt.board[0][4]=="O " &&ttt.board[2][2]=="O " && ttt.board[4][0]=="O "))
				{
					ttt.board();	
					System.out.println("You Lose...!!!");		
					lose=true;
					break;
				}
				
			}
		}
		if(b&&!win&&!lose)
		{
			ttt.board();
			System.out.println("Match Draw...!!!");
		}
	}
}