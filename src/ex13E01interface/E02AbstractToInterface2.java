package ex13E01interface;


interface PersonalNumberStorageInter{
	void addPersonalInfo(String idNum, String name);
	String searchPersonalInfo(String idNum);
}

class PersonalInfoVO{
	private String name;
	private String idNum;
	
	public PersonalInfoVO(String name, String idNum) {
		this.name = name;
		this.idNum = idNum;
	}
	
	String getName() {
		return name;
	}
	String getIdNum() {
		return idNum;
	}
}
class PersonalNumberStorageImpl implements PersonalNumberStorageInter{
	
	PersonalInfoVO[] personalArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
	}
	
	@Override
	public void addPersonalInfo(String idNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoVO(name, idNum);
		numOfPerInfo++;
	}
	@Override
	public String searchPersonalInfo(String idNum) {
		for(int i =0 ; i<numOfPerInfo ; i++) {
			if(idNum.compareTo(personalArr[i].getIdNum())==0) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
}
public class E02AbstractToInterface2 {
	
	public static void main(String[] args) {
		
		PersonalNumberStorageImpl storage = new PersonalNumberStorageImpl(10);
		
		storage.addPersonalInfo("890228-912371", "유재영");
		storage.addPersonalInfo("890228-234526", "유이고");
		
		System.out.println(storage.searchPersonalInfo("890228-912371"));
		System.out.println(storage.searchPersonalInfo("890228-764541"));
	}
}























