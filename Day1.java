import java.io.*;

public class Day1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("input.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("day1-sonar-sweep.out")));
        String st;
        int increaseCount = 0;
        int prevValue = 0;

        while ((st = r.readLine()) != null) {
            int currentValue = Integer.parseInt(st);
            if (currentValue > prevValue) {
                increaseCount++;
            }
            prevValue = currentValue;
        }
        pw.println(increaseCount - 1);

        r.close();
        pw.close();
    }
}