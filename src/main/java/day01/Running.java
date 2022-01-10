package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Running {

    Path path = Path.of("src/test/resources/running.csv");

    private List<String> getFile(Path path) {
        List<String> list = null;
        try (Scanner scanner = new Scanner(Path.of("src/test/resources/running.csv"))){
            list = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        list.remove(list.get(0));
        return list;
    }

    public double getFullDistance(int month, int year) {
        double fullDistance = 0;
        for (String line: getFile(path)) {
            if (matchMonth(line, month, year)) {
                fullDistance += getDistance(line);
            }
        }
        return fullDistance;
    }

    private boolean matchMonth(String line, int month, int year) {
        String[] parts = line.split(" km;");
        String[] partsDate = parts[1].split("-");
        int actualYear = Integer.parseInt(partsDate[0]);
        int actualMonth = Integer.parseInt(partsDate[1]);
        return  (actualYear == year && actualMonth == month);
    }

    private double getDistance(String line) {
        String[] parts = line.split(" km;");
        return Double.parseDouble(parts[0]);
    }
}
