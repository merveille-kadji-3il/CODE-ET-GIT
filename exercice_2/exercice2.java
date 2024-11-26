public class GestionnaireNotes {

    /**
    * Affichage de la note et des moyennes
    * @param nomEtudiant nom de l'étudiant
    * @param notes notes de l'étudiant
    */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        afficherNote(nomEtudiant,note); // Affichage des notes
        
        sommeNote(note); //somme des notes

        afficheMoyenne(moyenne); // Affichage moyenne
    }

    /**
     * Methode pour afficher la note 
     * @param nomEtudiant qui donne le nom de l'étudiant
     * @param note qui donne la note de l'étudiant 
     */
    public static void afficherNote(String nomEtudiant, int note){
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Methode pour calculer la somme
     * @param note Note de l'étudiant 
     */
    public static void sommeNote(int note){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
    }

    /**
     * Methode pour afficher la moyenne
     * @param somme Somme totale de toutes les notes
     */
    public static void afficheMoyenne(int somme){
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
