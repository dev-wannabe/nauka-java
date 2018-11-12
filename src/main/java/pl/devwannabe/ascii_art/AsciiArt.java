package pl.devwannabe.ascii_art;

import java.util.ArrayList;
import java.util.List;

public class AsciiArt {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!";
    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;

    public String makeAsciiArt(char asciArt, String input) {

        String output = "";
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
                output += asciiArtAlphabet().get(i).substring(numberOfLetter * WIDTH, numberOfLetter * WIDTH + WIDTH);
            }
            output += "\n";
        }
        output = replaceChar(asciArt, output);
        return output;
    }

    public String replaceChar(char newChar, String asciiArt) {
        String output = "";
        for (int i = 0; i < asciiArt.length(); i++) {
            if (asciiArt.charAt(i) == '#') {
                output += newChar;
            } else {
                output += asciiArt.charAt(i);
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