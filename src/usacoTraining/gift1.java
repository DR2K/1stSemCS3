package usacoTraining;
/*
ID: devdeep1
TASK: gift1
LANG: JAVA
 */
import java.io.*;
import java.util.*;
public class gift1 {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> people = new TreeMap<>();
        ArrayList<String> peoplenames = new ArrayList<>();
        BufferedReader input = new BufferedReader(new FileReader("gift1.in"));
        BufferedWriter output = new BufferedWriter(new FileWriter("gift1.out"));
        int numEntries = Integer.parseInt(input.readLine());
        for (int x = 0; x < numEntries; x++){
            String namme = input.readLine();
            people.put(namme, 0);
            peoplenames.add(namme);
        }
        for (int x = 0; x < numEntries; x++) {
            String name = input.readLine();
            String withdrawAndPeople = input.readLine();
            int withdrawal = Integer.parseInt(withdrawAndPeople.substring(0, withdrawAndPeople.length() - 2));
            int dist = Integer.parseInt(withdrawAndPeople.substring(withdrawAndPeople.length() - 1));
            if (dist!=0)
                people.put(name, people.get(name) - withdrawal + (withdrawal % dist));
            else
                people.put(name, people.get(name) - withdrawal);
            for (int person = 0; person < dist; person++) {
                String per = input.readLine();
                if (people.get(per) == null)
                    people.put(per, withdrawal / dist);
                else
                    people.put(per, people.get(per) + (withdrawal / dist));
            }
        }
        for (String s:peoplenames)
            output.write(s + " " + people.get(s) + "\n");
        output.close();
        input.close();
    }
}
