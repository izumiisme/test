package person;

public class Test{

	public static void main(String[]args){

	Person taro=new Person();
	Person jiro=new Person();
	Person hanako=new Person();
	Person aibo=new Person();
	Person asimo=new Person();
	Person pepper=new Person();



	taro.name="山田太郎";
	taro.age=20;
	taro.phoneNumber="09012345678";
	taro.address="東京都";

	jiro.name="木村次郎";
	jiro.age=18;
	jiro.phoneNumber="09087654321";
	jiro.address="神奈川県";

	hanako.name="鈴木花子";
	hanako.age=16;
	hanako.phoneNumber="08011112222";
	hanako.address="千葉県";

	aibo.name="aibo";

	asimo.name="asimo";

	pepper.name="pepper";


	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);

	System.out.println(jiro.name);
	System.out.println(jiro.age);
	System.out.println(jiro.phoneNumber);
	System.out.println(jiro.address);

	System.out.println(hanako.name);
	System.out.println(hanako.age);
	System.out.println(hanako.phoneNumber);
	System.out.println(hanako.address);


	taro.talk();
	taro.walk();
	taro.run();

	aibo.talk();
	asimo.walk();
	pepper.run();


	}

}
