package MyProject;

import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {
		String[] game = {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위, 바위, 보 중 하나를 입력하세요(exit를 입력하면 종료) : ");
		String answer = sc.nextLine();

		int com = (int)(Math.random()*3); //0<=x<3 사이의 임의의 정수
		
			if(answer.equals(game[0])) {
				if(com==0) {
					System.out.print("비겼습니다. 컴퓨터와 같은 걸 내셨습니다.");
				}else if(com==1){
					System.out.print("지셨습니다. 컴퓨터는 "+game[com]+"입니다.");
				}else if(com==2){
					System.out.print("이겼습니다. 컴퓨터는 "+game[com]+"입니다.");
				}
			}
			
			if(answer.equals(game[1])) {
				if(com==0) {
					System.out.print("이겼습니다. 컴퓨터는 "+game[com]+"입니다.");
				}else if(com==1){
					System.out.print("비겼습니다. 컴퓨터와 같은 걸 내셨습니다.");
				}else if(com==2){
					System.out.print("지셨습니다. 컴퓨터는 "+game[com]+"입니다.");
				}
			}
			
			if(answer.equals(game[2])) {
				if(com==0) {
					System.out.print("지셨습니다. 컴퓨터는 "+game[com]+"입니다.");
				}else if(com==1){
					System.out.print("이겼습니다. 컴퓨터는 "+game[com]+"입니다.");
				}else if(com==2){
					System.out.print("비겼습니다. 컴퓨터와 같은 걸 내셨습니다.");
				}
			} 

			if(answer.equals("exit")) {
					System.out.println("Game Exit...");
					}

	}//main


}


