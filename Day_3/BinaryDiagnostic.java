package Day_3;

import java.io.*;
import java.util.ArrayList;

public class BinaryDiagnostic {
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Day_3/input.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Day_3/dive.out")));
        String st;
        ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> zeroes = new ArrayList<>();
        boolean flag = true;

        while ((st = r.readLine()) != null) {

            for (int i = 0; i < st.length(); i++) {
                if (flag) {
                    char c = st.charAt(i);
                    if (c == '0') {
                        zeroes.add(i, 1);
                        ones.add(i, 0);
                    } else {
                        ones.add(i, 1);
                        zeroes.add(i, 0);
                    }
                } else {
                    char c = st.charAt(i);
                    if (c == '0') {
                        zeroes.set(i, zeroes.get(i) + 1);
                    } else {
                        ones.set(i, ones.get(i) + 1);
                    }
                }
            }
            flag = false;

        }
        String most = "";
        String least = "";
        for (int i = 0; i < ones.size(); i++) {
            if (ones.get(i) > zeroes.get(i)) {
                most += "1";
                least += "0";
            } else {
                most += "0";
                least += "1";
            }

        }
        pw.println(Integer.parseInt(most, 2) * Integer.parseInt(least, 2));

        r.close();
        pw.close();
    }
}
