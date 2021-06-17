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
		System.out.println("kurš no šiem nav Eiropas savienotās valsts?");
		//ir "do" jo, ja lietotājs atbild ar nepareizo burtu, tad jautās vēlreiz līdz ko atbild
		do {
		//izprintēs 4 atbilžu variantus
		System.out.println("a: Serbija");
		System.out.println("b: Kipra");
		System.out.println("c: Latvija");
		System.out.println("d: Andora");
		System.out.print("jusu atbilde:");
		//ierakstot atbildi, tas ņems tikai pirmo burtu, ja gadījumā ieraksta vārdu vai 2 burtus un vairāk
		cau=lol.next().charAt(0);
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
	System.out.println("kurā gadā pirmo reizi nolaidās uz mēnesi?");
	do {
	System.out.println("a: 1972");
	System.out.println("b: 1969");
	System.out.println("c: 1966");
	System.out.println("d: 1959");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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

	System.out.println("cik daudz ferrari uzvarēja le mans pirms ford uzveica?");
	do {
		
	System.out.println("a: 4");
	System.out.println("b: 9");
	System.out.println("c: 15");
	System.out.println("d: 6");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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
	
	System.out.println("kurā gadā sākās industrālā revolūcija?");
	do {
		
	System.out.println("a: 1760");
	System.out.println("b: 1695");
	System.out.println("c: 1903");
	System.out.println("d: 1836");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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
	
	System.out.println("no kurienes nāca roltoni?");
	do {
	System.out.println("a: Vjetnama");
	System.out.println("b: Japāna");
	System.out.println("c: Koreja");
	System.out.println("d: Brazīlija");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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

	System.out.println("cik daudzas reizes Luis Suarez iekoda futbolas spēlē?");
	do {
		
	System.out.println("a: 7");
	System.out.println("b: 0");
	System.out.println("c: 3");
	System.out.println("d: 1");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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

	System.out.println("Buggatti pieder vienam mašīnas uzņēmumam, kurš tas ir?");
	do {
		
	System.out.println("a: Audi");
	System.out.println("b: Volkswagen");
	System.out.println("c: Volvo");
	System.out.println("d: Nissan");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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

	System.out.println("kāds ir pilnais nosaukums ceļa zīmei ķieģelis?");
	do {
	System.out.println("a: iebraukt aizliegts");
	System.out.println("b: apstāties");
	System.out.println("c: bīstami");
	System.out.println("d: braukt aizliegts");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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

	System.out.println("kad iznāca mūzika no rick astley - never gonna give you up?");
	do {
	System.out.println("a: 2003");
	System.out.println("b: 1990");
	System.out.println("c: 1987");
	System.out.println("d: 1998");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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
	System.out.println("kurā gadā pirmo reizi spēlēja futbolu?");
	do {
	System.out.println("a: 1873");
	System.out.println("b: 1922");
	System.out.println("c: 1954");
	System.out.println("d: 1869");
	System.out.print("jusu atbilde:");
	cau=lol.next().charAt(0);
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
		System.out.println("kurš no šiem nav Eiropas savienotās valsts?");
		jaut1--;
	}if(jaut2==1){
		System.out.println("kurā gadā pirmo reizi nolaidās uz mēnesi?");
		jaut2--;
	}if(jaut3==1){
		System.out.println("cik daudz ferrari uzvarēja le mans pirms ford uzveica?");
		jaut3--;
	}if(jaut4==1){
		System.out.println("kurā gadā sākās industrālā revolūcija?");
		jaut4--;
	}if(jaut5==1){
		System.out.println("no kurienes nāca roltoni?");
		jaut5--;
	}if(jaut6==1) {
		System.out.println("cik daudzas reizes Luis Suarez iekoda futbolas spēlē?");
		jaut6--;
	}if(jaut7==1){
		System.out.println("Buggatti pieder vienam mašīnas uzņēmumam, kurš tas ir?");
		jaut7--;
	}if(jaut8==1){
		System.out.println("kāds ir pilnais nosaukums ceļa zīmei ķieģelis?");
		jaut8--;
	}if(jaut9==1){
		System.out.println("kad iznāca mūzika no rick astley - never gonna give you up?");
		jaut9--;
	}if(jaut10==1){
		System.out.println("kurā gadā pirmo reizi spēlēja futbolu?");
		jaut10--;
	}
	System.out.println(" ");
	starts.main(null);
	}
}