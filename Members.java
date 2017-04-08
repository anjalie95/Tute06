/*
Q2.While tracking this organization, your team has found that, this
organization was started with an odd number of members. Each member
has to recruit a new member after one month of joining to the terrorist
group. That means, the number of members of this organization will be
doubled in each month. As the programmer of this team, you are assigned
to write a program to find,
 * The initial number of members in this organization and
 * The number of months this organization has been running when the
current amount of members is given as a command line argument.
*/

import java.util.Scanner;
class Members{
	public static void main(String args[]){
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the current amount of members : ");
		int m = scanner.nextInt();
		if(m%2==1){
			System.out.println("Initial number of members in the organization are "+m); 
			System.out.println("The number of months this organization has been running is 0"); 
		}else{           
			for(int i=0;m>1;i++){
				m -= m/2;
				count += 1;
				if(m%2==1){
					System.out.println("Initial number of members in the organization are "+m);
					System.out.println("The number of months this organization has been running is "+count);
					break;
				}
			}	
		}
	}
}
