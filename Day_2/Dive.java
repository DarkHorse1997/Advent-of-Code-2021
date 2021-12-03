package Day_2;

import java.io.*;

public class Dive {
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Day_2/input.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Day_2/dive.out")));
        String st;
        int position = 0;
        int depth = 0;
        int aim = 0;

        while ((st = r.readLine()) != null) {
            String[] input = st.split(" ");
            int X = Integer.parseInt(input[1]);
            if (input[0].equals("forward")) {
                position += X;
                depth += aim * X;
            } else if (input[0].equals("down")) {
                aim += X;
            } else if (input[0].equals("up")) {
                aim -= X;
            }

        }

        pw.println(position * depth);

        r.close();
        pw.close();
    }
}
