package pl.robertburek.flyweight.checkFigures.chessPiece;

import pl.robertburek.flyweight.checkFigures.ChessPiece;

/**
 * Created by Robert Burek
 */
public class WhitePiece extends ChessPiece {

    public WhitePiece(String name, String numberPosition, String letterPosition) {
        super(name, numberPosition, letterPosition, "white");
    }
}
