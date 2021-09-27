/**
* Deterministic Finite Automaton - LFT course project - Path 7 option
* 
* @author  Eugenio Donvito
* @version 1.4.4
* @since   2019-06-12 
* 
*/

public class op_7 {

    public static boolean scan(String s) {

	    int state = 0;
	    int i = 0;

	    do {

		    final char ch = s.charAt(i++);

		    switch (state) {

	            case 0:
	                System.out.println("0");
			        if (ch == 'b')
			            state = 1;
			        else if (ch == 'a')
			            state = 0;
			        else
			            state = -1;
			        break;

		        case 1:
		            System.out.println("1");
			        if (ch == 'b')
			            state = 2;
			        else if (ch == 'a')
			            state = 0;
			        else
			            state = -1;
			        break;

			    case 2:
			        System.out.println("2");
			        if (ch == 'b')
			            state = -1;
			        else if (ch == 'a')
			            state = 0;
			        else
			            state = -1;
			        break;
			        
		    }

        } while (state > 0 && i < s.length());

        return state == 0;
    }
}
