import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class StarWars {
    public static ArrayList<Urhajo> urhajoLista = new ArrayList<>();

    public static void urhajok(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line = bufferedReader.readLine();
        while (line != null) {
            String[] beTomb = line.split(" ");
            String classNev = beTomb[0];
            int ismetles = Integer.parseInt(beTomb[1]);
            switch (classNev) {
                case "XWing":
                    XWing xWing = new XWing();
                    for (int i = 0; i < ismetles; i++) {
                        xWing.hiperUgras();
                    }
                    urhajoLista.add(xWing);
                    break;
                case "MilleniumFalcon":
                    MilleniumFalcon milleniumFalcon = new MilleniumFalcon();
                    for (int i = 0; i < ismetles; i++) {
                        milleniumFalcon.hiperUgras();
                    }
                    urhajoLista.add(milleniumFalcon);
                    break;
            }

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }

    public static void hangar() {
        for (Urhajo urhajo : urhajoLista) {
            System.out.println(urhajo);
        }
    }

    public static void main(String[] args) throws IOException {
        urhajok("file.txt");
        hangar();
    }
}
