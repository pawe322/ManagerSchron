package schronisko;

import java.util.*;

public class ManagerSchron 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner in;
		String a;
		int i=0;
		ArrayList<String> Lzwierz = new ArrayList<String>();
		
		in = new Scanner(System.in);
		
		System.out.println("Witaj w schronisku! Co chcesz zrobiæ?");
		do
		{
			do
			{
				System.out.println("\na - dodaj zwierzaka");
				System.out.println("b - usuñ zwierzaka");
				System.out.println("status - stan schroniska");
				a=in.next();
				switch(a)
				{
					case "a": 
						if(Lzwierz.size()==5)
						{
							a="z";
							System.out.println("Schronisko jest pe³ne.");
						}
						i=1;
						break;
					case "b": 
						i=2;
						break;
					case "status": 
						System.out.println("Obecnie w schornisku znajduje sie: "+Lzwierz);
						if (Lzwierz.size()<5) System.out.println("W schonisku jest jeszcze miejsce.");
							else if (Lzwierz.size()==5) System.out.println("Schronisko jest pe³ne.");
						break;
					default:
						System.out.println("Nie ma takiej opcji.");
						break;
				}
			}while(!(a.equals("a")||a.equals("b")));
			
			System.out.println("Podaj rodzaj zwierzêcia.");
			a=in.next();
			if (i==1) Lzwierz.add(a);
			if (i==2) Lzwierz.remove(a);
		
		}while(true);
		
	}

	
}
