import java.util.Scanner;
import java.util.Random;

class Game
{
    int computer;
    public Game(){
        Random rand=new Random();
        computer=rand.nextInt(100);
        System.out.println("Guess the Number From 1 to 100");
    }
    public int computerNo(){
        return computer;
    }
}
public class number_game {
    static int takeUserInput(){
        int user;
        System.out.println("Enter No");
        Scanner sc=new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }
    static void isCorrectnumber(int i, int j){
        if (i==j){
            System.out.println("Correct No. is Guess");
        }
        else if (i>j){
            System.out.println("Your No. is greater than Computer No. ");
        }
        else {
            System.out.println("Your No. is smaller than Computer No.");
        }
    }
    public static void main(String args[]){
        int user=0,computer=0,itteration=0;
        Game g=new Game();
        do {
            user=takeUserInput();
            computer=g.computerNo();
            isCorrectnumber(user,computer);
            itteration++;
        }while (user!=computer);
        System.out.println("You Guess No in "+ itteration +" Itteration");
    }
}
