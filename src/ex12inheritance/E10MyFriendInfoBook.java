package ex12inheritance;

import java.util.Scanner;

class Friend{
		String name, phone, addr;

		public Friend(String name, String phone, String addr) {
			super();
			this.name = name;
			this.phone = phone;
			this.addr = addr;
		}
		
		public void showAllData() {
			System.out.println("name: " + name);
			System.out.println("phoneNumber : "+ phone);
			System.out.println("addr : " + addr);
		}
		
		public void showBasicInfo() {}
	
}//////////////////////////////////////////////////////////
class HighFriend extends Friend{
	
	String nickname;

	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}

	@Override
	public void showAllData() {
		System.out.println("==========HighFriend    AllDate()");
		super.showAllData();
		System.out.println("nickname : " + nickname);
	}
	
	@Override
	public void showBasicInfo() {
		System.out.println("====HighFriend===");
		System.out.println("nickname : " + nickname);
		System.out.println("phoneNumber : " + phone);
	}
}///////////////////////////////////////////////////////////////
class UnivFriend extends Friend{

	String major;

	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	
	@Override
	public void showAllData() {
		System.out.println("===UnivFriend(AllDataInfo=====");
		super.showAllData();
		System.out.println("major : "+ major);
	}
	
	@Override
	public void showBasicInfo() {
		System.out.println("====UnivFriend====");
		System.out.println("name : "+ name);
		System.out.println("phoneNumber : " + phone);
		
	}
}//////////////////////////////////////////////

class FriendInfoHandler{
	
	private Friend[] myfriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		myfriends = new Friend[num];
		numOfFriends = 0;
	}
	public void addFriend(int choice) {
		
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		
		System.out.println("이름 : ");
		iName = scan.nextLine();
		System.out.println("전화번호 : ");
		iPhone = scan.nextLine();
		System.out.println("주소 : ");
		iAddr = scan.nextLine();
		
		if(choice==1) { // 고딩친구
			System.out.println("별명: ");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myfriends[numOfFriends++] = high;
		}
		else if(choice==2) {
			System.out.println("전공 : ");
			iMajor = scan.nextLine();
			UnivFriend univ = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
	}
	
	public void showAllData() {
		for(int i = 0; i < numOfFriends; i++) {
			myfriends[i].showAllData();
		}
		System.out.println("=======전체정보가 출력되었습니다.====");
	}
	
	public void showSimpleData() {
		for(int i = 0; i<numOfFriends ; i++) {
			myfriends[i].showBasicInfo();
		}
		System.out.println("====간략정보가 출력되었습니다.");
	}
	
	public void searchInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요");
		String searchName = scan.nextLine();
		
		for(int i=0; i<numOfFriends; i++) {
			System.out.println("검색중인 이름" + myfriends[i].name);
			
			if(searchName.compareTo(myfriends[i].name)==0) {
				myfriends[i].showAllData();
				System.out.println("***귀하가 요청하는 정보를 찾았습니다.***");
			}
		}
	}
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하시오:");
		String deleteName = scan.nextLine();
		
		int deleteIndex = -1;
		for(int i=0; i<numOfFriends;i++) {
			if(deleteName.compareTo(myfriends[i].name) == 0) {
				myfriends[i] = null;
				deleteIndex = i;
				numOfFriends--;
			}
		}
		if(deleteIndex == -1) {
			System.out.println("===삭제된 데이터가 없습니다====");
		}
		else {
			for(int i=deleteIndex ; i < numOfFriends ; i++) {
				myfriends[i] = myfriends[i+1];
			}
			System.out.println("==데이터("+deleteIndex+"번)가 삭제되었습니다.");
		}
	}
}
public class E10MyFriendInfoBook{
	
	public static void menuShow() {
		
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1.고딩친구입력");
		System.out.println("2.대딩친구입력");
		System.out.println("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.println("5.검색");
		System.out.println("6.삭제");
		System.out.println("7.프로그램종료");
		System.out.println("8.메뉴선택>>>");
		
	}
	
	public static void main(String[] args) {
		
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while(true) {
			
			menuShow();
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다");
				return;
			}
		}
	}
	
}



























