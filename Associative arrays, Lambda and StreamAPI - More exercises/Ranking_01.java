package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI.MoreExercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class Ranking_01 {

    static class Contest {
        String name, password;
        Integer points;

        private Contest(String name, String password) {
            this.name = name;
            this.password = password;
        }

        private Contest(String name, Integer points) {
            this.name = name;
            this.points = points;
        }

        private Contest() {

        }


        public String GetName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> contests = new HashMap<>();

        String input = scan.nextLine();
        while (!input.equals("end of contests")) {

            String[] contestData = input.split(":");
            contests.put(contestData[0], contestData[1]);

            input = scan.nextLine();
        }


        Map<String, Contest> studentResults = new HashMap<>();

        input = scan.nextLine();
        while (!input.equals("end of submissions")) {
            String[] currentInput = input.split("=>");

            Contest currentContest = new Contest(currentInput[0], currentInput[1]);


            if (contests.containsKey(currentContest.name)
                    && contests.get(currentContest.name).equals(currentContest.password)) {

                if (studentResults.get(currentInput[2]).points != null
                && currentContest.points > studentResults.get(currentInput[2]).points) {

                    currentContest = new Contest(currentInput[0], Integer.parseInt(currentInput[3]));
                    studentResults.put(currentInput[2], currentContest);
                    input = scan.nextLine();
                    continue;
                }
                currentContest = new Contest(currentInput[0], Integer.parseInt(currentInput[3]));
                studentResults.put(currentInput[2], currentContest);

            }


            input = scan.nextLine();
        }



    }

    static Map<String,Contest> sort (Map<String,Contest> map){
        Map <String,Contest> finalMap = new HashMap<>();
        Contest maxPointContest = new Contest();

        for (Map.Entry<String, Contest> entry : map.entrySet()) {
            int maxPoints= Integer.MIN_VALUE;
            String maxPointName="";

            if (entry.getValue().points>maxPoints){
                maxPointName = entry.getKey();
                maxPointContest = entry.getValue();
            }
            finalMap.put(maxPointName,maxPointContest);
            map.remove(maxPointName);
        }

        return finalMap;
    }

}
