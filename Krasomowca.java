public class Krasomowca {
	public static void main (String[] args) {

// trzy grupy s³ów, które bêd¹ wybierane do zdania		
		String[] listaSlow1 = {"Architektura wielowarstwowa", "30 000 metrów", "Rozwi¹zanie B-do-B", "Aplikacja kliencka", "Interfejs internetowy", "Inteligentna karta", "Rozwi¹zanie dynamiczne", "Szeœæ sigma", "Przenikliwoœæ"};
		
		String[] listaSlow2 = {"zwiêksza mo¿liwoœci", "poprawia atrakcyjnoœæ", "pomna¿a wartoœæ", "opracowana dla", "bazuj¹ca na", "rozproszona", "sieciowa", "skoncentrowana na", "podniesiona na wy¿szy poziom", "skierowanej", "udostêpniona"};

		String[] listaSlow3 = {"procesu.", "punktu wpisywania.", "rozwi¹zania.", "strategii.", "paradygmatu.", "portalu.", "witryny.", "wersji.", "misji."};

// okreœlenie ile jest s³ów w ka¿dej z list
		int lista1Dlugosc = listaSlow1.length;
		int lista2Dlugosc = listaSlow2.length;
		int lista3Dlugosc = listaSlow3.length;

// generacja trzech losowych s³ów (lub zwrotów)
		int rnd1 = (int) (Math.random() * lista1Dlugosc);
		int rnd2 = (int) (Math.random() * lista2Dlugosc);
		int rnd3 = (int) (Math.random() * lista3Dlugosc);

// stworzenie zdania
		String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

// wyœwietlenie zdania
		System.out.println("To jest to, czego nam trzeba: " + zdanie);
	}
}