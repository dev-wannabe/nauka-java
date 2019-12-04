package pl.devwannabe.adventofcode.day1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Fuel {


    public int getFuelRequirements() {

        List<String> massesOfModules = getInputData("src/main/resources/inputDataDay1");
        massesOfModules.forEach(n -> System.out.println(n));

        List<Integer> fuelRequirements = massesOfModules.stream()
                .map(n -> {
                    int input = Integer.parseInt(n) / 3 - 2;
                    int output = input;
                    while (input / 3 - 2 > 0) {
                        output += input / 3 - 2;
                        input = input / 3 - 2;
                    }
                    System.out.println("output" + output);
                    return output;
                })
                .collect(Collectors.toList());
        int sum = fuelRequirements.stream().reduce(0, Integer::sum);

        return sum;
    }

    private List<String> getInputData(String filePath) {
        Path path = Paths.get(filePath);
        try {
            return Files.readAllLines(path, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println("Error during reading filePath");
            return Collections.emptyList();
        }
    }
}
