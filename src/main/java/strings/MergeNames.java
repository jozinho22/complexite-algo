package strings;

/*
 * Fusionner deux tableaux de String avec comme hypothèse 
 * que les deux tableaux n'en contiennent déjà pas
 */
public class MergeNames {

	public static String[] mergeNames(String[] tab1, String[] tab2) {

		int count = tab1.length + tab2.length;
		
		// création du tableau comprenant des valeurs nulles
		String[] mergeWithNulls = new String[count];
		// remplissage avec les éléments du 1er tableau
		for (int i = 0; i < tab1.length; i++) {
			mergeWithNulls[i] = tab1[i];
		}

		// Comparaison un à un pour ajouter les valeurs inexistantes du 2nd tableau
		for (int i = 0; i < tab1.length; i++) {
			for (int j = 0; j < tab2.length; j++) {
				if (!isPresent(tab2[j], mergeWithNulls) && !tab1[i].equals(tab2[j])) {
					mergeWithNulls[tab1.length + i] = tab2[j];
				} else {
					continue;
				}
			}
		}
		
		int toRemove = 0;
		
		// Comptage du nombre de valeurs nulles
		for(String s : mergeWithNulls) {
			if(s == null) {
				toRemove++;
			}
		}
	
		// Création du tableau avec la bonne dimension
		String[] merge = new String[count - toRemove];
		
		int j = 0;
		
		// Remplissage
		for(int i = 0; i < mergeWithNulls.length; i++) {
			if(mergeWithNulls[i] != null) {
				merge[j++] = mergeWithNulls[i];
			}
		}
		
		return merge;

	}

	public static boolean isPresent(String s, String[] tab) {

		for (String str : tab) {
			if (str != null) {
				if (str.equals(s)) {
					return true;
				}
			}
		}
		return false;
	}

}
