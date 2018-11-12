package pl.devwannabe.ascii_art;

public class AsciiArtApp {

    public static void main(String[] args) {
        final String BLUE = "\u001B[34m";
        final String RESET_COLOR = "\u001B[0m";

        AsciiArt asciiArt = new AsciiArt();

        System.out.println(BLUE +
                asciiArt.makeAsciiArt('@',"Fire Up Pro !!!") +
                RESET_COLOR
        );
    }
}