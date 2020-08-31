import java.util.ArrayList;
import java.util.List;

public class Partition {
    /**
     * Retourne une liste composée de sous listes avec aux maximum {@code taille}
     * éléments tirés de la {@code liste}
     * L'utilisation se fait comme suit :
     * <pre>{@code
     *      Partition.partition(liste, taille);
     * }</pre>
     *
     * @param liste  liste d'éléments à partitionner
     * @param taille nombre d'éléments dans les sous listes
     * @return Retourne une liste composée de sous listes
     * @throws IllegalArgumentException pour une taille inférieure ou égale à 0
     *                        ({@code taille <= 0}) ou pour une liste vide
     * @throws NullPointerException pour une liste nulle
     *
     */
    public static <T> List<List<T>> partition(List<T> liste, int taille) {
        int nombreListes;
        List<List<T>> partitions = new ArrayList<>();
        if (liste == null)
            throw new NullPointerException(" 'liste' ne doit pas être null");
        if (liste.isEmpty())
            throw new IllegalArgumentException(" 'liste' ne doit pas être vide");
        if (taille <= 0)
            throw new IllegalArgumentException(" 'taille' doit être supérieure à 0");


        nombreListes = liste.size() / taille;

        if (liste.size() % taille != 0)
            nombreListes++;


        for (int i = 0; i < nombreListes; i++) {

            int debut = i * taille;
            int fin = i * taille + taille;
            if (fin > liste.size())
                fin = liste.size();
            partitions.add(new ArrayList<>(liste.subList(debut, fin)));

        }

        return partitions;
    }



}
