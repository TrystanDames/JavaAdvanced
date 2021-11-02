import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Desktop\\JavaAdvanced\\Soccer\\src\\main\\resources\\result.txt");
        Scanner sc = null;
        String match, team1, team2, team3, team4, score1, score2, score3, score4;
        int leagueTotal = 0;
        TreeMap<String, Integer> scoreboard = new TreeMap<>();

        String[] sides, l1, l2, l3, l4;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {

            Map<String, Integer> map = new TreeMap<>();
            leagueTotal = 0;
            match = sc.nextLine();
            sides = match.split(",");
            l1 = sides[0].split(" ");
            team1 = l1[0];
            score1 = l1[1];

            l2 = sides[1].split(" ");
            team2 = l2[0];
            score2 = l2[1];

//            l3 = sides[0].split(" ");
//            team3 = l3[0];
//            score3 = l3[1];
//
//            l4 = sides[1].split(" ");
//            team4 = l4[0];
//            score4 = l4[1];
//
//            l5 = sides[4].split(" ");
//            team5 = l5[0];
//            score5 = l5[1];
//
//            l6 = sides[5].split(" ");
//            team6 = l6[0];
//            score6 = l6[1];

            int teamScore1 = Integer.parseInt(score1);
            int teamScore2 = Integer.parseInt(score2);
//            int teamScore3 = Integer.parseInt(score3);
//            int teamScore4 = Integer.parseInt(score4);
//            int teamScore5 = Integer.parseInt(score5);
//            int teamScore6 = Integer.parseInt(score6);


            if (teamScore1 > teamScore2) {
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 3);
            } else if (teamScore1 < teamScore2) {
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 3);
            } else {
                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 1);
                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 1);
            }

//            if (teamScore3 > teamScore4) {
//                scoreboard.put(team3, scoreboard.getOrDefault(team3, leagueTotal) + 3);
//            } else if (teamScore3 < teamScore4) {
//                scoreboard.put(team4, scoreboard.getOrDefault(team4, leagueTotal) + 3);
//            } else {
//                scoreboard.put(team3, scoreboard.getOrDefault(team3, leagueTotal) + 1);
//                scoreboard.put(team4, scoreboard.getOrDefault(team4, leagueTotal) + 1);
//            }
////
//            if (teamScore2 > teamScore4) {
//                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 3);
//            } else if (teamScore2 < teamScore4) {
//                scoreboard.put(team4, scoreboard.getOrDefault(team4, leagueTotal) + 3);
//            } else {
//                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 1);
//                scoreboard.put(team4, scoreboard.getOrDefault(team4, leagueTotal) + 1);
//            }
//
//            if (teamScore3 > teamScore2) {
//                scoreboard.put(team3, scoreboard.getOrDefault(team3, leagueTotal) + 3);
//            } else if (teamScore1 < teamScore2) {
//                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 3);
//            } else {
//                scoreboard.put(team3, scoreboard.getOrDefault(team3, leagueTotal) + 1);
//                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 1);
//            }
//
//            if (teamScore1 > teamScore3) {
//                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 3);
//            } else if (teamScore1 < teamScore3) {
//                scoreboard.put(team3, scoreboard.getOrDefault(team3, leagueTotal) + 3);
//            } else {
//                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 1);
//                scoreboard.put(team3, scoreboard.getOrDefault(team3, leagueTotal) + 1);
//            }
//
//            if (teamScore4 > teamScore1) {
//                scoreboard.put(team4, scoreboard.getOrDefault(team4, leagueTotal) + 3);
//            } else if (teamScore3 < teamScore1) {
//                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 3);
//            } else {
//                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 1);
//                scoreboard.put(team4, scoreboard.getOrDefault(team4, leagueTotal) + 1);
//            }
        }

            LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

            scoreboard.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .sorted(Map.Entry.comparingByKey())
                    .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

            System.out.println("Rankings: " + reverseSortedMap);

    }
}

