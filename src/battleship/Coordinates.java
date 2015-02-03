package battleship;

/**
 * @version 1.0 beta
 * @author Konstantin Garkusha
 */
class Coordinates {
    final int number;
    final int letter;

    public Coordinates(int number, int letter) {
        this.number = number;
        this.letter = letter;
    }

    @Override
    public int hashCode() {
        return 31 + ( number / letter);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Coordinates))
            return false;
        Coordinates c = (Coordinates) obj;
        return (this.number == c.number) && (this.letter == c.letter);
    }
}