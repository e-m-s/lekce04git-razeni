import com.engeto.computers.Computer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sortComputers();
        sortIntegers();
    }

    private static void sortComputers() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Xyz", LocalDate.of(2020, 1, 1), 1500));
        computers.add(new Computer("Abc", LocalDate.of(2019, 1, 1), 2500));
        computers.add(new Computer("Def", LocalDate.of(2018, 1, 1), 2000));

        // Nelze - nevím, podle čeho řadit: Collections.sort(computers);
        // Po doplnění Comparable do Computer už to jde:
        System.out.println("Před seřazením: " + computers);
        Collections.sort(computers);
        System.out.println("Po seřazení (výchozí řazení):" + computers);
        //Collections.sort(computers, Comparator.comparing(Computer::getPurchaseDate));
        computers.sort(Comparator.comparing(Computer::getPurchaseDate));
        System.out.println("Po seřazení (podle data pořízení): " + computers);
        computers.sort(Comparator.comparing(Computer::getPurchaseDate));
        System.out.println("Po seřazení (podle popisu sestupně): " + computers);
        computers.sort(Comparator.comparing(Computer::getDescription, Comparator.reverseOrder()));
        //computers.sort();
    }

    private static void sortIntegers() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);

        System.out.println("Před seřazením: " + integers);
        Collections.sort(integers);
        System.out.println("Po seřazení: " + integers);
    }

}