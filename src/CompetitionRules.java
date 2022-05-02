public class CompetitionRules {
    /**
     * implementazione del pattern Singleton
     * competitionRules viene direttamente inizializzato
     */
    private static CompetitionRules competitionRules = new CompetitionRules();
    /**
     * le tre regole della competizione
     */
    private String competitionRoule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRoule2 = "Learn every day!";
    private String competitionRoule3 = "Be the best team!";

    /**
     * costruttore privato
     */
    private CompetitionRules() {}

    /**
     * metodo pubblico getter
     * @return all'oggetto della classe instanziato precedentemente in maniera privata
     */
    public static CompetitionRules getInstance(){
        return competitionRules;
    }

    /**
     * Stampa le regole non visibili (perché private) della competizione
     */
    public void printRules(){
        System.out.println("~ COMPETITION RULES ~\n1) "+competitionRoule1+"\n2) "+competitionRoule2+"\n3) "+competitionRoule3);
    }

}
