import java.util.Scanner;

public class starts {

	public static void main(String[] args) {
		//string atbilde ir izveidota prieks jautajumiem
		String atbilde;
		Scanner lol = new Scanner(System.in);
		System.out.println("vai vçlaties atbildçt uz jautâjumiem?");
		//saks jautat ja vai ne, turpinas jautat kamer nav atbildets ne
		do {
			System.out.print("ievadiet vârdu (ja, ne): ");
			//sanem atbildi
			atbilde=lol.next();
			//parvers to par lowercase, gadijuma ja ir uzrakstits ar lieliem burtiem
			atbilde=atbilde.toLowerCase();
			//izveidota atstarpe prieks jautajumiem
			System.out.println(" ");
			//switch parbauda vai ir atbildets pec nosacijumiem
			switch(atbilde) {
			//ja ir atbildets ja, tad ies uz izdruka.java pirmo jautajumu
			case "ja":
				izdruka.jauta1();
			break;
			case "ne":
				//iziet no sistemas, praktiski beidzot darbibu
				System.exit(1);
			break;
			}
			//turpinâs jautât kamçr nav atbildçts vârds ne
		}while(atbilde!="ne");
		lol.close();
	}
}