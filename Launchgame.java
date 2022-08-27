//GUESSER GAME PROJECT
import java.util.Scanner;

class Guesser{
	int guessNum;
	
	public int guessNumber() {
		// here the Guesser store a no in his mind called guessNum
		System.out.println("Guesser Please Guess the Number beetween range 0 to 10");
		Scanner scan = new Scanner(System.in);
		guessNum = scan.nextInt();
		// now guesser tells his number to the umpire
		do{
			if(guessNum <0 || guessNum > 10){ 
				System.out.println("Wrong Number! Guess Again!");
				guessNum = scan.nextInt();
			}
		}while(guessNum <0 || guessNum > 10);
		return guessNum;	
	}
}
class Player{
	// Here we create blueprint of the multiple players
	int pguessNum; // if we want to take guessNum then no issue because it is in new class
	public int guessNumPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Guess the Number");
		pguessNum = sc.nextInt();
		return pguessNum;
		
	}
}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser() {  //
		Guesser gnum=new Guesser();      // to access Guesser Class we have to create OBJECT gnum
		numFromGuesser = gnum.guessNumber(); //method call
	}
	public void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNumPlayer();
		numFromPlayer2 = p2.guessNumPlayer();
		numFromPlayer3 = p3.guessNumPlayer();
	}
	public void compare() {
		if(numFromGuesser == numFromPlayer1 ) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser==numFromPlayer3 ) {
				System.out.println("Game is tied between all three Players");
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 and Player2 won the game");
			}
			else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 and Player3 won the game");
			}
			else {
				System.out.println("Player1 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer2 ) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player2 and Player3 won the game");
			}
			else {
				System.out.println("Player2 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer3 ) {
			if(numFromGuesser == numFromPlayer1) {
				System.out.println("Player1 and Player3 won the game");
			}
			else {
				System.out.println("Player1 won the game");
			}
		}
//MODIFICATION
   //in this scenario if a player is nearby the GUESSER number then he have a chance to win this game
		
		else if((numFromGuesser !=numFromPlayer1)&&(numFromGuesser !=numFromPlayer2)&&(numFromGuesser!=numFromPlayer3)){
			if(numFromPlayer1>numFromPlayer2 && numFromPlayer1>numFromPlayer3) {
				System.out.println("Player1 won the game");
			}
			else if(numFromPlayer2>numFromPlayer1 && numFromPlayer2>numFromPlayer3) {
				System.out.println("Player2 won the game");
			}
			else {
				System.out.println("Player3 won the game");
			}
				
		}
		else {
			System.out.println("Game Over! Bye Bye!");
		}
	}
}
public class Launchgame {
	
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
