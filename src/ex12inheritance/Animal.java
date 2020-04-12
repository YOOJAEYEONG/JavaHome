package ex12inheritance;
/*
연습문제] Animal 클래스정의 
	동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
	멤버변수 : 
		동물의 종류(포유류, 어류, 조류 등)->species
		나이->age
		성별->gender
	멤버메소드 : 
		showAnimal() : 멤버변수를 출력하는 용도
	인자생성자 : 
		멤버변수 3개 모두를 초기화할수 있도록 정의
	
	※1차완성후 species를 private로 선언후 적절히 수정한다.
 */
public class Animal {
	
	private String species, gender;
	private int age;

	
	public Animal(String species, String gender, int age) {
		
		this.species = species;
		this.gender = gender;
		this.age = age;
	}
	
	public void showAnimal() {
		System.out.println(species);
		System.out.println(gender);
		System.out.println(age);
	}

	public String getSpecies() {
		return species;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
