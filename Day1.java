import java.io.*;
import java.util.ArrayList;

public class Day1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("input.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("day1-sonar-sweep-part-2.out")));
        String st;
        int increaseCount = 0;
        ArrayList<Integer> sumArray = new ArrayList<>();

        while ((st = r.readLine()) != null) {
            int currentValue = Integer.parseInt(st);
            sumArray.add(currentValue);

        }
        for (int i = 3; i < sumArray.size(); i++) {
            if (sumArray.get(i) > sumArray.get(i - 3)) {
                increaseCount++;
            }
        }
        pw.println(increaseCount);

        r.close();
        pw.close();
    }
}