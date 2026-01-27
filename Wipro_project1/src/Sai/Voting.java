package Sai;

public class Voting {
	private int age;
	private String name;
	private boolean canvote;
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setCanvote(boolean canvote) {
	this.canvote=true;
}
public boolean getCanvote() {
	return canvote;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting v=new Voting();
		v.setAge(18);
		v.setName("lohit");
		v.setCanvote(false);
		System.out.println(v.getAge());
		System.out.println(v.getName());
		System.out.println(v.getCanvote());

	}

}
