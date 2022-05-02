public class Competition {
    public static void main(String[] args) {
        CompetitionRules competitionRules = CompetitionRules.getInstance();
        competitionRules.printRules();

        Team teamA = new Team();
        teamA.teamName = "Fever Develhope";

        teamA.p1.name = "Marco";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 3;

        teamA.p2.name = "Roberta";
        teamA.p2.programmingLanguage = "C#";
        teamA.p2.yearsOfExperience = 4;

        Team teamB = new Team();
        teamB.teamName = "Develhope Faculty Club";

        teamB.p1.name = "Maria";
        teamB.p1.programmingLanguage = "Java";
        teamB.p1.yearsOfExperience = 6;

        teamB.p2.name = "Giacomo";
        teamB.p2.programmingLanguage = "C#";
        teamB.p2.yearsOfExperience = 2;

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}
