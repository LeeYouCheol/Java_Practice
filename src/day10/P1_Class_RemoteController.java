package day10;

import java.util.Scanner;

public class P1_Class_RemoteController {

	public static void main(String[] args) {
		/* 메뉴를 출력 후 메뉴에 맞는 기능을 동작하도록 코드를 작성하세요.
		 * 메뉴
		 * 1. 채널 UP
		 * 2. 채널 DPWN
		 * 3. 채널 변경
		 * 4. 볼륨 UP
		 * 5. 볼륨 DOWN
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 6
		 * TV를 켰습니다.
		 * 메뉴
		 * 1. 채널 UP
		 * 2. 채널 DPWN
		 * 3. 채널 변경
		 * 4. 볼륨 UP
		 * 5. 볼륨 DOWN
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 3
		 * 채널 입력 : 100
		 * 채널 : 100
		 * 메뉴
		 * 1. 채널 UP
		 * 2. 채널 DPWN
		 * 3. 채널 변경
		 * 4. 볼륨 UP
		 * 5. 볼륨 DOWN
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 7
		 * */
		Scanner scan = new Scanner(System.in);
		RemoteController rm = new RemoteController(1,10);
		int menu = -1;
		do {
			System.out.println("-----------------------------------");
			System.out.println("메뉴");
			System.out.println("1. 채널 Up");
			System.out.println("2. 채널 Down");
			System.out.println("3. 채널 변경");
			System.out.println("4. 볼륨 Up");
			System.out.println("5. 볼륨 Down");
			System.out.println("6. 전원");
			System.out.println("7. 시스템 종료");
			System.out.println("-----------------------------------");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				rm.channelUp();
				break;
			case 2:
				rm.channelDown();
				break;
			case 3:
				System.out.println("채널을 입력하세요 : ");
				int ch = scan.nextInt();
				rm.channelMove(ch);
				break;
			case 4:
				rm.volumeUp();
				break;
			case 5:
				rm.volumeDown();
				break;
			case 6:
				rm.turn();
				break;
			case 7:
				System.out.println("시스템 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}while(menu != 7);
	}

}
// TV리모컨 클래스를 생성하고, 객체를 생성 후 기능들을 테스트해보세요
class RemoteController{
	//리모컨에 필요한 필드값(필드 멤버) : 전원, 채널, 볼륨
	boolean power;
	int channel;
	int volume;
	int minVolume = 0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel = 99;
	
	/* 기능 : Tv를 켜는 메소드
	 * 매개변수 : -
	 * 리턴타입 : -
	 * 메소드명 : turnOn
	 * */
	private void turnOnOnn() {
		power = true;
		System.out.println("Tv를 켰습니다.");
	}
	private void turnOnOff() {
		power = false;
		System.out.println("Tv를 껐습니다.");
	}
	/* 기능 : Tv를 키거나 끄는 메소드
	 * 매개변수 : -
	 * 리턴타입 : -
	 * 메소드명 : turn
	 * */
	void turn() {
		power = !power;
		if(power) {
			System.out.println("TV를 켰습니다.");
		}else {
			System.out.println("TV를 껐습니다.");
		}
	}
	/* 기능 : 소리를 올리고 내리는 기능
	 * 매개변수 : -
	 * 리턴타입 : void
	 * 메소드명 : volumeControl
	 * */
	void volumeUp() {
		if(power) {
			if(volume < maxVolume) {
				volume++;
			}
			System.out.println("소리 : " + volume);
		}
	}
	void volumeDown() {
	if(power) {
		if(volume > minVolume) {
			volume--;
			}
		System.out.println("소리 : " + volume);
		}
	}
	/* 기능 : 채널을 올리고 내리는 메소드
	 * 매개변수 : -
	 * 리턴타입 : void
	 * 메소드명 : channelControl
	 * */
	void channelUp() {
		if(power) {
			if(channel < maxChannel) {
				channel++;
			}
			System.out.println("채널 : " + channel);
		}
	}
	void channelDown() {
		if(power) {
			if(channel > minChannel) {
				channel--;
			}
			System.out.println("채널 : " + channel);
		}
	}
	/* 기능 : 입력한 채널로 이동하는 기능
	 * 매개변수 : int ch
	 * 리턴타입 : void
	 * 메소드명 : channelMove
	 * */
	void channelMove(int ch) {
		if(power) {
			if(ch < minChannel) {
				channel = minChannel;
			}else if(ch > maxChannel) {
				channel = maxChannel;
			}else {
				channel = ch;
			}
			System.out.println("채널 : " + channel);
		}
	}
	public RemoteController() {
		channel = minChannel;
		volume = minVolume;
	}
	public RemoteController(int ch, int v) {
		if(ch >= minChannel && ch <= maxChannel) {
			channel = ch;
		}else {
			channel = minChannel;
		}
		if(v > minVolume && v < maxVolume) {
			volume = v;
		}else {
			volume = minVolume;
		}
	}
}