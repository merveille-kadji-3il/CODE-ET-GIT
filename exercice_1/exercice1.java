public class FactureManager {
    //fonction pour la reduction alimentaire
    public void reduc_alimentaire(){
        total -= total * 0.05; // Réduction de 5%
    }

    // fonction pour la réduction électronique
    public void reduc_electronique(){
        total -= total * 0.1; // Réduction de 10%
    }

    // fonction pour la reduction de luxe
    public void reduc_luxe(){
        total -= total * 0.15; // Réduction de 15%
    }

        // Calcul le total d'une facture
        /**
         * @param typeProduit le type du produit (alimentaire, électronique, luxe)
         * @param quantite la quantité de produit
         * @param prixUnitaire le prix unitaire du produit
         */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire){
        double total = quantite * prixUnitaire;
        if (total > 1000){
                total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
        return total;
    }

    /**
     * retourne le pourcentage de réduction applicable selon le type de produit
     */

    public double obtenirReduction(){
            switch (typeProduit) {
                case "Alimentaire" :
                    calculerFacture.reduc_alimentaire();
                    break;
                case "Electronique" :
                    calculerFacture.reduc_electronique();
                    break;
                case "Luxe"
                    calculerFacture.reduc_luxe();
                    break;
            };
    }
}
