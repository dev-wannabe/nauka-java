package pl.devwannabe.adventofcode.day2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Computer {


    public List<Integer> restoreProgram() {
        int opCode;
        int inputA;
        int inputB;
        int output;

        String[] input = getInputData("src/main/resources/inputDataDay2").split(",");
        List<Integer> gravityAssistProgram = Arrays.asList(input).stream()
                .map(element -> Integer.parseInt(element))
                .collect(Collectors.toList());
        gravityAssistProgram.set(1, 12);
        gravityAssistProgram.set(2, 2);

        for (int i = 0; i < gravityAssistProgram.size() - 3; i++) {
            opCode = gravityAssistProgram.get(i);
            inputA = gravityAssistProgram.get(i + 1);
            inputB = gravityAssistProgram.get(i + 2);
            output = gravityAssistProgram.get(i + 3);

            if (opCode == 1) {
                gravityAssistProgram.set(output, gravityAssistProgram.get(inputA) + gravityAssistProgram.get(inputB));
                i += 3;
            }
            if (opCode == 2) {
                gravityAssistProgram.set(output, gravityAssistProgram.get(inputA) * gravityAssistProgram.get(inputB));
                i += 3;
            }
            if (opCode == 99) {
                break;
            }
        }
        return gravityAssistProgram;
    }

    private String getInputData(String filePath) {
        Path path = Paths.get(filePath);
        try {
            return Files.readString(path, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println("Error during reading filePath");
            return "";
        }
    }

}
