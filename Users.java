public class Users {
	String name;
	String id;
	String sex;
	int age;
	


	public Users(){
		this("","","",0);
	}
	
	public Users(String n , String id , String s , int a){
		name = n;
		id = id;
		sex = s;
		age = a;
	}
	
	void setName(String n){
		name = n;
	}
	
	void setAge(int a){
		age = a;
	}
	void setId(String n){
		id = n;
	}


	void setSex(String s){
		sex = s;
	}	
	
	String getName(){
		return name;
	}
	
	String getId(){
		return id;
	}
	
	int getAge(){
		return age;
	}
	
	String getSex(){
		return sex;
	}
}