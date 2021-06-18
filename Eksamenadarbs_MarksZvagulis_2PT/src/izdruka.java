import java.util.Scanner;

public class izdruka {
	//saliktas vertibas priekš pareizās atbildes
	static int par=0;
	//ir izveidoti kas skaitis nepareizam atbildem
	static int jaut1=0, jaut2=0, jaut3=0, jaut4=0, jaut5=0, jaut6=0, jaut7=0, jaut8=0, jaut9=0, jaut10=0;
	//izveidots char, priekš atbildēm
	static char cau;
	//Izveidots Scanner, priekš atbildēm
	static Scanner lol = new Scanner(System.in);
	public static void jauta1() {
		System.out.println("kāds cikls ir do while cikls?");
		//ir "do" jo, ja lietotājs atbild ar nepareizo burtu, tad jautās vēlreiz līdz ko atbild
		do {
		//izprintēs 4 atbilžu variantus
		System.out.println("a: beigu nosacījuma");
		System.out.println("b: sākuma nosacījuma");
		System.out.println("c: cikls ar skaitītāju");
		System.out.println("d: mehāniskais cikls");
		System.out.print("jusu atbilde:");
		//ierakstot atbildi, tas ņems tikai pirmo burtu, ja gadījumā ieraksta vārdu vai 2 burtus un vairāk
		cau=lol.next().charAt(0);
		cau=Character.toLowerCase(cau);
		//sāks pārbaudīt atbildes
		switch(cau) {
		case 'a':
			//pareizā atbilde pasaka ka ir pareizi un ieskaita punktu par pareizo
			System.out.println("pareizi");
			par+=1;
			
		break;
		case 'b': case 'c': case 'd':
			//nepareizā atbilde pasaka ka ir nepareizi, ieskaita punktu ka ir nepareizi
			System.out.println("nepareizi");
			jaut1+=1;
		break;
		}
		//šis pārbauda vai nav cits ievadīts burts
		}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
		System.out.println(" ");
		jauta2();
	}
	public static void jauta2() {
	System.out.println("kuros gadījumos ir labāk izmantot do while ciklu?");
	do {
	System.out.println("a: precīzi zinot cik daudz atkārtosies cikls");
	System.out.println("b: kad vēlas");
	System.out.println("c: nezinot cik daudz atkārtosies cikls");
	System.out.println("d: vienmēr ir vajadzīgs");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'b': case 'd': case 'a':
		System.out.println("nepareizi");
		jaut2+=1;
	break;
	case 'c':
		System.out.println("pareizi");
		par+=1;
	break;
	
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta3();
	}
	public static void jauta3() {

	System.out.println("kam ir jābūt tukšā laukuma vietā?");
	System.out.println("do{");
	System.out.println("instrukcijas");
	System.out.println("}while(_________);");
	do {
		
	System.out.println("a: instrukcijas");
	System.out.println("b: tikai atstarpe");
	System.out.println("c: for cikls");
	System.out.println("d: nosacījums");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {

	case 'b': case 'c': case 'a':
		System.out.println("nepareizi");
		jaut3+=1;
	break;
	
	case 'd':
		System.out.println("pareizi");
		par+=1;
		
	break;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta4();
	}
	public static void jauta4() {
	
	System.out.println("ja nosacījums ir true, kas notiks tālāk?");
	do {
		
	System.out.println("a: pildīs instrukcijas vēlreiz");
	System.out.println("b: cikls beigsies");
	System.out.println("c: restartēs programmu");
	System.out.println("d: pārbaudīs vēlreiz instrukcijas rezultātu");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'a':
		System.out.println("pareizi");
		par+=1;
		
	break;
	case 'b': case 'c': case 'd':
		System.out.println("nepareizi");
		jaut4+=1;
	break;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta5();
	}
	public static void jauta5() {
	
	System.out.println("kas mainās while cikla un do while cikla darbībā?");
	do {
	System.out.println("a: nekas neimainās, strādā identiski");
	System.out.println("b: do while dara instrukcijas pirmās");
	System.out.println("c: while cikls pārbauda nosacījumu vēlāk");
	System.out.println("d: while ciklam nav nosacījumi");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'a': case 'd': case 'c':
		System.out.println("nepareizi");
		jaut5+=1;
	break;
	case 'b':
		System.out.println("pareizi");
		par+=1;
		
	break;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta6();
	}
	public static void jauta6() {

	System.out.println("ja pirmajā ciklā ir false, kas notiks?");
	do {
		
	System.out.println("a: neturpinās ciklu");
	System.out.println("b: apstādinās programmu");
	System.out.println("c: izpildīs visu instrukciju vismaz vienu reizi");
	System.out.println("d: pildīs instrukcijas vēlreiz");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'a': case 'b': case 'd':
		System.out.println("nepareizi");
		jaut6+=1;
	break;
	case 'c':
		System.out.println("pareizi");
		par+=1;
		
	break;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta7();
	}
	public static void jauta7() {

	System.out.println("kāpēc do while ciklam ir sintakse?");
	do {
	System.out.println("a: dekorācija");
	System.out.println("b: apstādina ciklu");
	System.out.println("c: sāks jaunu ciklu");
	System.out.println("d: izveido do while ciklu");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'a': case 'd': case 'c':
		System.out.println("nepareizi");
		jaut7+=1;
	break;
	case 'b':
		System.out.println("pareizi");
		par+=1;
	
	break;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta8();
	}
	public static void jauta8() {

	System.out.println("kas ir īpašs ar do while uz c++ un/vai Java?");
	do {
	System.out.println("a: instrukcija drīkst būt nekā");
	System.out.println("b: atkārto ciklu mūžīgi");
	System.out.println("c: uz Java var būt tikai do");
	System.out.println("d: uz c++ ir uz laika cikls");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'a':
		System.out.println("pareizi");
		par+=1;
	
	break; 
	case 'b': case 'd': case 'c':
		System.out.println("nepareizi");
		jaut8+=1;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta9();
	}
	public static void jauta9() {

	System.out.println("a sākuma vērtība ir 1, cik daudzas reizes atkārtosies cikls ja beigās lai izprintē 17?");
	do {
	System.out.println("a: 17 reizes");
	System.out.println("b: 13 reizes");
	System.out.println("c: 16 reizes");
	System.out.println("d: 15 reizes");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'c':
		System.out.println("pareizi");
		par+=1;
	
	break;
	case 'b': case 'd': case 'a':
		System.out.println("nepareizi");
		jaut9+=1;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	jauta10();
	}
	public static void jauta10() {
	System.out.println("kas ir nosacījums uz do while?");
	do {
	System.out.println("a: int izteiksme");
	System.out.println("b: String izteiksme");
	System.out.println("c: char izteiksme");
	System.out.println("d: boolean izteiksme");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
	cau=Character.toLowerCase(cau);
	switch(cau) {
	case 'a': case 'c': case 'b':
		System.out.println("nepareizi");
		jaut10+=1;
	break;
	case 'd':
		System.out.println("pareizi");
		par+=1;
	break;
	}
	}while(cau!='a' && cau!='b' && cau!='c' && cau!='d');
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Pareizas atbildes: "+par);
	if(jaut1==1){
		System.out.println("kāds cikls ir do while cikls?");
		jaut1--;
	}if(jaut2==1){
		System.out.println("kuros gadījumos ir labāk izmantot do while ciklu?");
		jaut2--;
	}if(jaut3==1){
		System.out.println("kam ir jābūt tukšā laukuma vietā?");
		jaut3--;
	}if(jaut4==1){
		System.out.println("ja nosacījums ir true, kas notiks tālāk?");
		jaut4--;
	}if(jaut5==1){
		System.out.println("kas mainās while cikla un do while cikla darbībā?");
		jaut5--;
	}if(jaut6==1) {
		System.out.println("ja pirmajā ciklā ir false, kas notiks?");
		jaut6--;
	}if(jaut7==1){
		System.out.println("kāpēc do while ciklam ir sintakse?");
		jaut7--;
	}if(jaut8==1){
		System.out.println("kas ir īpašs ar do while uz c++ un/vai Java?");
		jaut8--;
	}if(jaut9==1){
		System.out.println("a sākuma vērtība ir 1, cik daudzas reizes atkārtosies cikls ja beigās lai izprintē 17?");
		jaut9--;
	}if(jaut10==1){
		System.out.println("kas ir nosacījums uz do while?");
		jaut10--;
	}
	System.out.println(" ");
	starts.main(null);
	}
}