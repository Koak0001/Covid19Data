import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Filehandler {
    private ArrayList<Covid19Data> data;

    public Filehandler() {
        data = new ArrayList<>();

    }

    public void readData(){
        File file = new File("keyGroupsAges.csv");
        try (Scanner scanner = new Scanner(file, StandardCharsets.ISO_8859_1)) {
            scanner.nextLine(); // skip header line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                if (values.length == 7) {
                    String region = values[0];
                    String ageGroups = values[1];
                    int confirmedCases = Integer.parseInt(values[2].trim());
                    int casualties = Integer.parseInt(values[3].trim());
                    int admittedICU = Integer.parseInt(values[4].trim());
                    int admitted = Integer.parseInt(values[5].trim());
                    String date = values[6];

                    // create covid19data object and add to Array
                    Covid19Data covid19Data = new Covid19Data(region, ageGroups, confirmedCases, casualties, admittedICU, admitted, date);
                    data.add(covid19Data);
                } else {
                    // handle unviable lines of the csv file
                    // Maybe log the error or skip the line
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // Handle cases where parsing to integer fails
            e.printStackTrace();
        }

    }
    public void printData() {
        for (Covid19Data d : data) {
            System.out.println(d);
        }
    }
}
