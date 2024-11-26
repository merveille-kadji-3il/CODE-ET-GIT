public class StockManager {

    /**
     * Gestion des stocks
     * @param typeOperation le type d'opération
     * @param produit produit en stock
     * @param quantite quantité en stock
     * @param stock le stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        
        switch(typeoOperation){
            case "ajout";
            ajout(produit,stock); //ajout au stock
            break;

            case "retrait";
            retrait(produit,stock); //retrait au stock
            break;

            default:  System.out.println("opérationinconnue.");
            break;
        
        }
    }

    /**
    * Methode pour ajouter un produit dans le stock
    * @param donne le nom du produit
    * @param stock, quantité de stock après l'ajout
    */
    public static void ajout(String produit, double stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
    * Methode pour retirer un produit dans le stock
    * @param produit, donne le nom du produit
    * @param stock, quantité de stock après le retrait
    */
    public static void retrait(String produit, double stock){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }

}

   
