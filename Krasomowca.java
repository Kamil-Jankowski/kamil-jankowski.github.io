public class Krasomowca {
	public static void main (String[] args) {

// trzy grupy s��w, kt�re b�d� wybierane do zdania		
		String[] listaSlow1 = {"Architektura wielowarstwowa", "30 000 metr�w", "Rozwi�zanie B-do-B", "Aplikacja kliencka", "Interfejs internetowy", "Inteligentna karta", "Rozwi�zanie dynamiczne", "Sze�� sigma", "Przenikliwo��"};
		
		String[] listaSlow2 = {"zwi�ksza mo�liwo�ci", "poprawia atrakcyjno��", "pomna�a warto��", "opracowana dla", "bazuj�ca na", "rozproszona", "sieciowa", "skoncentrowana na", "podniesiona na wy�szy poziom", "skierowanej", "udost�pniona"};

		String[] listaSlow3 = {"procesu.", "punktu wpisywania.", "rozwi�zania.", "strategii.", "paradygmatu.", "portalu.", "witryny.", "wersji.", "misji."};

// okre�lenie ile jest s��w w ka�dej z list
		int lista1Dlugosc = listaSlow1.length;
		int lista2Dlugosc = listaSlow2.length;
		int lista3Dlugosc = listaSlow3.length;

// generacja trzech losowych s��w (lub zwrot�w)
		int rnd1 = (int) (Math.random() * lista1Dlugosc);
		int rnd2 = (int) (Math.random() * lista2Dlugosc);
		int rnd3 = (int) (Math.random() * lista3Dlugosc);

// stworzenie zdania
		String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

// wy�wietlenie zdania
		System.out.println("To jest to, czego nam trzeba: " + zdanie);
	}
}