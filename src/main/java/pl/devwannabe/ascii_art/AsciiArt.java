package pl.devwannabe.ascii_art;

import java.util.ArrayList;
import java.util.List;

public class AsciiArt {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!";
    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;

    public String makeAsciiArt(char asciiArtChar, String input) {

        String asciiArtString = "";
        int numberOfLetter = 0;
        input = input.toUpperCase();

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < input.length(); j++) {
                if (ALPHABET.indexOf(input.charAt(j)) != -1) {
                    numberOfLetter = ALPHABET.indexOf(input.charAt(j));
                }
                if (ALPHABET.indexOf(input.charAt(j)) == -1) {
                    numberOfLetter = 27;
                }
                asciiArtString += asciiArtAlphabet().get(i).substring(numberOfLetter * WIDTH, numberOfLetter * WIDTH + WIDTH);
            }
            asciiArtString += "\n";
        }
        asciiArtString = replaceAsciiArtChar(asciiArtChar, asciiArtString);
        return asciiArtString;
    }

    private String replaceAsciiArtChar(char newAsciiArtChar, String asciiArtString) {
        String output = "";
        for (int i = 0; i < asciiArtString.length(); i++) {
            if (asciiArtString.charAt(i) == '#') {
                output += newAsciiArtChar;
            } else {
                output += asciiArtString.charAt(i);
            }
        }
        return output;
    }

    private List<String> asciiArtAlphabet() {
        List<String> ascii = new ArrayList<>();
        ascii.add(" #   ##    ##  ##   ###  ###   ##  # #  ###   ##  # #  #    # #  ###   #   ##    #   ##    ##  ###  # #  # #  # #  # #  # #  ###   #         ");
        ascii.add("# #  # #  #    # #  #    #    #    # #   #     #  # #  #    ###  # #  # #  # #  # #  # #  #     #   # #  # #  # #  # #  # #    #  # #        ");
        ascii.add("###  ##   #    # #  ##   ##   # #  ###   #     #  ##   #    ###  # #  # #  ##   # #  ##    #    #   # #  # #  ###   #    #    #    #         ");
        ascii.add("# #  # #  #    # #  #    #    # #  # #   #   # #  # #  #    # #  # #  # #  #     ##  # #    #   #   # #  # #  ###  # #   #   #               ");
        ascii.add("# #  ##    ##  ##   ###  #     ##  # #  ###   #   # #  ###  # #  # #   #   #      #  # #  ##    #   ###   #   # #  # #   #   ###   #         ");
        return ascii;
    }

}