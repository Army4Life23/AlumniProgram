
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class InOut {

    private Scanner in;
    private File alumniFile;
    private Scanner alumniFileIn;
    private PrintWriter alumniSaved;
    private File eventFile;
    private Scanner eventFileIn;
    private PrintWriter eventSaved;
    private TreeMap<Integer, Object> alumniMap;
    private TreeMap<Integer, Object> eventMap;

    /**
     * Initiate File, Scanner and PrintWriter
     * 
     * @throws FileNotFoundException
     */
    public InOut() throws FileNotFoundException {
        alumniFile = new File("alumni.txt");
        alumniFileIn = new Scanner(alumniFile);
        eventFile = new File("events.txt");
        eventFileIn = new Scanner(eventFile);
        in = new Scanner(System.in);
    }

    public void existingEvents() {
        eventMap = new TreeMap<>();
        Events e = new Events();
        while (eventFileIn.hasNextLine()) {
            String line = eventFileIn.nextLine();
            String[] s = line.split(",");
            int id = Integer.parseInt(s[0]);
            String name = s[1];
            String time = s[2];
            int room = Integer.parseInt(s[3]);
            int numberOfParticipants = Integer.parseInt(s[4]);
            String startDate = s[5];
            String list = eventFileIn.nextLine();
            String[] listArr = list.split(",");
            ArrayList<String> att = new ArrayList<>();
            for (int i = 0; i < listArr.length; i++) {
                att.add(listArr[i]);
            }
            e = new Events(id, name, time, room, numberOfParticipants, startDate, att);
            eventMap.put(id, e);
        }
    }

    public void existingAlumni() {
        alumniMap = new TreeMap<>();
        Alumni a = new Alumni();
        while (alumniFileIn.hasNextLine()) {
            String line = alumniFileIn.nextLine();
            String[] s = line.split(",");
            int id = Integer.parseInt(s[0]);
            String name = s[1];
            String address = s[2];
            String major = s[3];
            String gradYear = s[4];
            String job = s[5];
            String organization = s[6];
            a = new Alumni(id, name, address, major, gradYear, job, organization);
            alumniMap.put(id, a);
        }
    }

    /**
     * Get User Text Input
     * 
     * @return User input : nextLine
     */
    public String stringInput() {
        return in.nextLine();
        
    }

    /**
     * Get User Integer Input
     * 
     * @return User input : int
     */
    public int intInput() {
        return in.nextInt();
    }

    /**
     * Get User Double Input
     * 
     * @return User input : double
     */
    public double doubleInput() {
        return in.nextDouble();
    }

}
