package ex13E01interface;

abstract class PersonalNumberStorageAbs{
	public abstract void addPersonalInfo(String idNum, String name);
	public abstract String searchPersonalInfo(String idNum);
}

class PersonalInfoDTO{
	private String name;
	private String idNum;
	
	public PersonalInfoDTO(String name, String idNum) {
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
class PersonalNumberStorageExt extends PersonalNumberStorageAbs{
	
	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageExt(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}
	
	@Override
	public void addPersonalInfo(String idNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoDTO(name, idNum);
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
public class E02AbstractToInterface1 {
	
	public static void main(String[] args) {
		
		PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10);
		
		storage.addPersonalInfo("890228-912371", "유재영");
		storage.addPersonalInfo("890228-234526", "유이고");
		
		System.out.println(storage.searchPersonalInfo("890228-912371"));
		System.out.println(storage.searchPersonalInfo("890228-764541"));
	}
}























