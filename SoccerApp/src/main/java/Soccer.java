import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Soccer {

    public static void main(String[] args) {

        Soccer theLeague = new Soccer();


        Team[] theTeams = theLeague.createTeams
                ("Manchester United,Liverpool,Real Madrid,Barcelona,Juventus,Paris Saint-Germain");



        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\User\\Desktop\\JavaAdvanced\\SoccerApp\\result.txt");
        Scanner sc = null;
        String match;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            match = sc.nextLine();
//            System.out.println(match);
        }

    }

    public Team[] createTeams(String teamNames) {

        StringTokenizer teamNameTokens = new StringTokenizer(teamNames);
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for (int i =0; i < theTeams.length; i++){
            theTeams[i] = new Team(teamNameTokens.nextToken());
        }


        return theTeams;
    }
}
