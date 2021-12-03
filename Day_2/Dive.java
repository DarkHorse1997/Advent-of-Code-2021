package Day_2;

import java.io.*;

public class Dive {
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Day_2/input.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Day_2/dive.out")));
        String st;
        int position = 0;
        int depth = 0;

        while ((st = r.readLine()) != null) {
            String[] input = st.split(" ");
            if (input[0].equals("forward")) {
                position += Integer.parseInt(input[1]);
            } else if (input[0].equals("down")) {
                depth += Integer.parseInt(input[1]);
            } else if (input[0].equals("up")) {
                depth -= Integer.parseInt(input[1]);
            }

        }

        pw.println(position * depth);

        r.close();
        pw.close();
    }
}
