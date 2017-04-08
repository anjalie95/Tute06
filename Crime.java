/*
Q1.You are a programmer who is working in an Intelligence Agency which is
situated in Europe. You have assigned to a team which is tracking the illegal
works carried out by a fresh terrorist organization in the Central Europe. Spy
agents of your team have found that their Modus operandi (MO) - Mode of
Operation - is doing crimes on dates of a particular month where the date is
a prime number. You have assigned to write a program to find out whether
there will be a crime for a given date. The maximum number you may have
is 31.
*/
import java.util.Scanner;
class Crime{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int date;
		int m=0;
		System.out.print("Input the date : ");
		date = scanner.nextInt();
		m = date/2;
		if(1<=date && date<=31){
			if(date==1){
				System.out.println("There won't be a crime");
			}else{
				if(date==2 | date==3){
					System.out.println("There will be a crime");
				}else{
					for(int i=2;i<=m;i++){
						if(date%i==0){
							System.out.println("There won't be a crime");
							break;
						}else{
							System.out.println("There will be a crime");
							break;
						}
					}
				}
			}
		}else{
			System.out.println("Invalid date");
		}
	}
}
		
						
