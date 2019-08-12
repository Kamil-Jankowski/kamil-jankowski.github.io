## Chapter 1 - JAVA Head First
### Here you can find all excercises:

Moja Pierwsza Aplikacja:
```java
class MojaPierwszaAplikacja
{
	public static void main(String[] args)
	{
		System.out.println("Ja rzadze!");
		System.out.println("Swiatem!");
	}
}
```

***

Ćwiczenie 1A:
```java
class Cwiczenie1A {
	public static void main (String[] args) {
		int x = 1;
		while (x < 10) {
			if (x > 3) {
			System.out.println("Wielkie X");
			}
		x = x + 1;
		}
	}
}
```
***
Ćwiczenie 1B:
```java
class Cwiczenie1B {
	public static void main (String[] args) {
		int x = 5;
		while (x > 1) {
			x = x - 1;
			if (x < 3) {
			System.out.println("Malutkie x");
			}
		}
	}
}
```
***
DooBee:
```java
class DooBee{
        public static void main(String[] args){
                int x = 1;
                while (x  < 3) {
                        System.out.print("Doo");
                        System.out.print("Bee");
                        x++;
                }
                if(x == 3) {
                        System.out.print("Do");
                }
        }
}
```
***
Układanka:
```java
class Ukladanka {

	public static void main (String[] args) {

		int x = 3;
		
		while (x > 0) {
			if (x > 2) { System.out.print("a"); }
			x = x - 1;
			System.out.print("-");
			if (x == 1) { 
				System.out.print("d");
				x = x - 1;
			}
			if (x == 2) { System.out.print("b c"); }
		}
	}
}
```
***
Piosenka o piwie:
```java
class PiosenkaOPiwie {

	public static void main (String[] args) {

		int iloscButelek = 99;
		String slowo = "bottles";

		while (iloscButelek > 0) {
			if (iloscButelek == 1) {
				slowo = "bottle";
			}
			System.out.println("");
			System.out.println(iloscButelek + " " + slowo + " of beer on the wall.");
			System.out.println(iloscButelek + " " + slowo + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			iloscButelek = iloscButelek - 1;
			if (iloscButelek > 0) {
				if (iloscButelek == 1) {
					slowo = "bottle";
				}
				System.out.println(iloscButelek + " " + slowo + " of beer.");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
		}
	}
}
```
***
Krasomówca:
```java
public class Krasomowca {
	public static void main (String[] args) {

// trzy grupy słów, które będą wybierane do zdania		
		String[] listaSlow1 = {"Architektura wielowarstwowa", "30 000 metrów", "Rozwiązanie B-do-B", "Aplikacja kliencka", "Interfejs internetowy", "Inteligentna karta", "Rozwiązanie dynamiczne", "Sześć sigma", "Przenikliwość"};
		
		String[] listaSlow2 = {"zwiększa możliwości", "poprawia atrakcyjność", "pomnaża wartość", "opracowana dla", "bazująca na", "rozproszona", "sieciowa", "skoncentrowana na", "podniesiona na wyższy poziom", "skierowanej", "udostępniona"};

		String[] listaSlow3 = {"procesu.", "punktu wpisywania.", "rozwiązania.", "strategii.", "paradygmatu.", "portalu.", "witryny.", "wersji.", "misji."};

// określenie ile jest słów w każdej z list
		int lista1Dlugosc = listaSlow1.length;
		int lista2Dlugosc = listaSlow2.length;
		int lista3Dlugosc = listaSlow3.length;

// generacja trzech losowych słów (lub zwrotów)
		int rnd1 = (int) (Math.random() * lista1Dlugosc);
		int rnd2 = (int) (Math.random() * lista2Dlugosc);
		int rnd3 = (int) (Math.random() * lista3Dlugosc);

// stworzenie zdania
		String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

// wyświetlenie zdania
		System.out.println("To jest to, czego nam trzeba: " + zdanie);
	}
}
```
***
Zagadkowy basen:
```java
class ZagadkowyBasen {
	public static void main (String[] args) {
		int x = 0;
		while (x<4) {
			System.out.print("a");
			if (x<1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (x<1) {
				System.out.print("asz");
				x = x - 1;
			}
			if (x==1) {
				System.out.print("talek");
			}
			if (x>1) {
				System.out.print("tyczny");
			}
			System.out.println("");
			x = x + 2;
		}
	}
}
```
