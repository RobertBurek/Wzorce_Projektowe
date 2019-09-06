package pl.robertburek.flyweight.checkFigures;

/**
 * Created by Robert Burek
 */
public abstract class ChessPiece {

    String name;
    String numberPosition;
    String letterPosition;
    Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }
    }

    public Color getColor() {
        return color;
    }
}
