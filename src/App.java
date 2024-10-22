public class App {

    public static void main(String[] args){
        // initialisation d'une limite à 100
        int limit = 100;

        // boucle qui commence à 0 et tant que 
        // est inférieur à la limite il va s'incrémenter 
        for (int i = 0; i < limit; i++) {
            // si 
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // méthode 
    public static boolean isPrime(int num) {
        // elle vérifie si un nombre est premier ou pas
        // création du paramètre numb
        boolean prime = true;

        // on fait appel à la classe Math et à sa méthode square root

        for(int i = 2; i <= Math.sqrt(num); i++) {
            // il initialise à  i à 2 parce que si il laissait 1 
            // tout nombre étant divisible par 1 ça rendrait inutile la boucle

            // on fait appel à Math.sqrt(num) 
            // et on vérifie si i est inférieur à cette valeur
            float flottingNumber = (float)num / i;


            // il vérifie si le floattingNumber est entier 
            // et si il l'est il donne la valeur false à prime
            if( flottingNumber == Math.round(flottingNumber)) {
                prime = false;
                break;
            }
        }

    public static void password(String[] args) {    

        
    }
}