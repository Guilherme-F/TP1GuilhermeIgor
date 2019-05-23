import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int hm = 0, ok;
		System.out.print("Escolha 1 ou 2 \n");
		ok = STDIN_SCANNER.nextInt();
		if(ok == 1) {
			hm = 200;
		} else if(ok == 2) {
			hm = 100;
		} else {
			System.out.print("Numero invalido");
		}
		for(ok = 1; ok < hm; ok = ok + 2) {
			System.out.println(ok);
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
