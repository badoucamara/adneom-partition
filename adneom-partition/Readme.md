# SUJET MAISON TEST JAVA / ADNEOM

####  Le but du projet est de pouvoir écrire une méthode "partition" qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.



La méthode partition se trouve dans la classe src/org/camara/adneom/Partition
Elle prend en paramètre la liste d'éléments qu'on souhate partitionner et la taille maximale des  sous-listes.

- Cette taille doit être supérieure à 0 sinon notre méthode jette une IllegalArgumentException
- La liste passée en argument ne doit pas être nulle sinon sinon notre méthode jette une NullPointerException
- La liste passée en argument ne doit pas être vide sinon sinon notre méthode jette une IllegalArgumentException

**EXEMPLES** :

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]

partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]

partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

L'utilisation se fait comme suit :
    
           Partition.partition(liste, taille);

Le projet contient une classe PartitionTest qui contient quelques cas de tests spécifiques réalisés avec Junit4
