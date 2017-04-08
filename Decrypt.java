/*
Q3.Your team has interpreted five strange message words from radio
communication which were encrypted.
YIFHHVOH
ZNHGVIWZN
UIZMPUFIG
SVZGSILD
AFIRXS
After decrypting, the cryptographist found that, the letter E is actually letter
V, Z is actually A and A is actually Z. Also they found out that all the other
letters fit accordingly into the English alphabet. What they have done was,
they reverse the alphabet and use for the secret communication.
In the meantime your team has intercepted many more messages with the
same letter replacement format. Since hand conversion of large number of
messages is a difficult task, you are assigned to come up with a solution to
this problem using programming.
Write a Java program to display the correct words in the command line when
you give encrypted words as a command line argument. You have to
correctly identify the above mentioned five secret words. 
*/

class Decrypt{
	public static void main(String args[]){
		String message = args[0];
		message = message.toLowerCase();
		String dMessage = "";
		char l;
		for(int i = 0; i < message.length(); i++){
				l = message.charAt(i);
				int position = 26-((int) l - (int) 'a' + 1);
				dMessage += (char)(position + (int) 'a');
		}
		dMessage = dMessage.toUpperCase();
		System.out.println("Decrypted message is "+dMessage);
	}
}



