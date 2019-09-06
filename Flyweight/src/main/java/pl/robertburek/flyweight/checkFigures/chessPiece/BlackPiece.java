package pl.robertburek.flyweight.checkFigures.chessPiece;

import pl.robertburek.flyweight.checkFigures.ChessPiece;

/**
 * Created by Robert Burek
 */
public class BlackPiece extends ChessPiece {

    public BlackPiece(String name, String numberPosition, String letterPosition) {
        super(name, numberPosition, letterPosition, "black");
    }
}
