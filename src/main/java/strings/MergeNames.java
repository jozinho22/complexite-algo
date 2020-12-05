package strings;

public class MergeNames {

	public static String[] mergeNames(String[] tab1, String[] tab2) {

		int count = tab1.length + tab2.length;
		int toRemove = 0;
		
		String[] reponseWithNullValues = new String[count];
		for (int i = 0; i < tab1.length; i++) {
			reponseWithNullValues[i] = tab1[i];
		}

		for (int i = 0; i < tab1.length; i++) {
			for (int j = 0; j < tab2.length; j++) {
				if (!isPresent(tab2[i], reponseWithNullValues) && !tab1[i].equals(tab2[j])) {
					reponseWithNullValues[tab1.length + i] = tab2[i];
				} else {
					continue;
				}
			}
		}
				
		for(String s : reponseWithNullValues) {
			if(s == null) {
				toRemove++;
			}
		}
		
		String[] reponseF = new String[count - toRemove];
		int j =0;
	
		for(int i = 0; i < reponseWithNullValues.length; i++) {
			if(reponseWithNullValues [i] != null) {
				reponseF[j++] = reponseWithNullValues[i];
			}
		}
		return reponseF;

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
