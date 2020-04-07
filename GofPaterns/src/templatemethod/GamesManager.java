package templatemethod;

public class GamesManager {

    public static void main (String [] args){
        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode){
            case CHESS :
                game = new com.designpatterns.templatemethod.Chess();
                break;
            case MONOPOLY :
                game = new com.designpatterns.templatemethod.Monopoly();
                break;
            default :
                throw new IllegalStateException();
        }

        game.playOneGame(2);
    }

}
