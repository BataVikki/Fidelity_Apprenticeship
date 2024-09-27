import java.util.Scanner;

class Game
{
    private String Name;
    private int MaxNoPlayer;
    public String getName()
    {
        return Name;
    }
    public int getMaxNoPlayer()
    {
        return MaxNoPlayer;
    }
    public void setName(String Name)
    {
        Name = Name;
    }
    public void setMaxNoPlayer(int maxNoPlayer)
    {
        MaxNoPlayer = maxNoPlayer;
    }
    public String toString()
    {
        return "Maximum number of players: " + MaxNoPlayer;
    }
}
class GamewithTimeLimit extends Game
{
    private int TimeLimit;
    public int getTimeLimit()
    {
        return TimeLimit;
    }
    public void setTimeLimit(int timeLimit)
    {
        TimeLimit = timeLimit;
    }
    public String toString()
    {
        return super.toString();
    }
}
public class Gamelnheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        System.out.println("Enter the name of the game : ");
        game.setName(sc.next());
        System.out.println("Enter the maximum number of players : ");
        game.setMaxNoPlayer(sc.nextInt());

        GamewithTimeLimit game2 = new GamewithTimeLimit();
        System.out.println("Enter the game: ");
        game2.setName(sc.next());
        System.out.println("Enter Maximum number of players: ");
        game2.setMaxNoPlayer(sc.nextInt());
        System.out.println("Enter the timelimit of the game: ");
        game2.setTimeLimit(sc.nextInt());

        System.out.println(game.toString());
        System.out.println(game2.toString());





    }
}
