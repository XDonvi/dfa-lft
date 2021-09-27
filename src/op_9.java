/**
* Deterministic Finite Automaton - LFT course project - Path 9 option
* 
* @author  Eugenio Donvito
* @version 1.4.4
* @since   2019-06-12 
* 
*/

public class op_9 {
	
	public static boolean scan(String s){
		
		int state = 0;
		int sostitution = 0;
		int i = 0;
		
		while (state>-1 && i < s.length()) {

	    	final char ch = s.charAt(i++);
	    	
	    	switch (state) {
				case 0:
					if ( ch == 'E' || ch == 'e') {
						sostitution = 0;
						state = 1;
					} else {
						sostitution = 1;
						state = 1;
					}
					break;
				
				case 1:
					if (((sostitution == 0) && (ch == 'U' || ch == 'u')) || ((sostitution == 1) && (ch == 'U' || ch == 'u')))
						state = 2;
					else if (sostitution == 0)
						state = 8;
					else if ((sostitution == 0) && (ch == 'E' || ch == 'e'))
						state = 1;
					else
						state = 1;

					break;

				case 2:
					if (ch == 'G' || ch == 'g')
						state = 3;
					else if (sostitution == 0){
						sostitution = 1;
						state = 8;
					} else 
						state = 1;
					break;
					
				case 3:
					if (ch == 'E' || ch == 'e')
						state = 4;
					else if (sostitution == 0){
						sostitution = 1;
						state = 9;
					} else 
						state = 1;
					break;
					
				case 4:
					if (ch == 'N' || ch == 'n')
						state = 5;
					else if (sostitution == 0){
						sostitution = 1;
						state = 10;
					} else 
						state = 1;
					break;

				case 5:
					if (ch == 'I' || ch == 'i')
						state = 6;
					else if (sostitution == 0){
						sostitution = 1;
						state = 11;
					} else 
						state = 1;
					break;

				case 6:
					if (ch == 'O' || ch == 'o')
						state = 7;
					else if (sostitution == 0){
						sostitution = 1;
						state = 7;
					} else 
						state = 1;
					break;

				case 7:
					state = 7;
					break;

				//sobstitution states
				case 8:
					if (ch == 'G' || ch == 'g')
						state = 3;
					else {
						sostitution = 0;
						state = 1;
					}
					break;

				case 9:
					if (ch == 'E' || ch == 'e')
						state = 4;
					else {
						sostitution = 0;
						state = 1;
					}
					break;

				case 10:
					if (ch == 'N' || ch == 'n')
						state = 5;
					else {
						sostitution = 0;
						state = 1;
					}
					break;

				case 11:
					if (ch == 'I' || ch == 'i')
						state = 6;
					else {
						sostitution = 0;
						state = 1;
					}
					break;
			}
		}

		return state == 7;
	}
}
