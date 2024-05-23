import com.engeto.computers.Computer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sortComputers();
        sortIntegers();
    }

    private static void sortComputers() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Xyz", LocalDate.of(2020, 1, 1), 1.5));
        computers.add(new Computer("Abc", LocalDate.of(2019, 1, 1), 2.5));
        computers.add(new Computer("Def", LocalDate.of(2018, 1, 1), 2.0));

        // Nelze - nevím, podle čeho řadit: Collections.sort(computers);
        // Po doplnění Comparable do Computer už to jde:
        System.out.println("Před seřazením: " + computers);
        Collections.sort(computers);
        System.out.println("Po seřazení: " + computers);
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