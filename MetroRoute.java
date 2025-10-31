
import java.util.*;

public class MetroRoute {
public static void main(String[] args) {
    String[] green = {"A", "B", "C", "J", "K", "L"};
    String[] red = {"I", "C", "D", "E", "F", "G", "M", "N", "H"};

    List<String> junctions = new ArrayList<>();

    for (String g : green) {
        for (String r : red) {
            if (g.equals(r)) {
                junctions.add(g);
            }
        }
    }
    System.out.println("Junction Stations: " + junctions);

    int krishToC = Arrays.asList(green).indexOf("C") - Arrays.asList(green).indexOf("A");
    int cToE = Arrays.asList(red).indexOf("E") - Arrays.asList(red).indexOf("C");

    int totalStations = krishToC + cToE;
    System.out.println("Number of junctions Krish should travel: " + totalStations);
}
}
