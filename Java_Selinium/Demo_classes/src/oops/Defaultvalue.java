package oops;

public class Defaultvalue {

	int num;
	char ch;
	boolean b;
	String name;
	byte by;
	short sh;
	float fl;
	double db;
	long lg;

	private void value() {
		System.out.println(num);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(name);
		System.out.println(by);
		System.out.println(sh);
		System.out.println(fl);
		System.out.println(db);
		System.out.println(lg);

	}

	public static void main(String[] args) {

		Defaultvalue v = new Defaultvalue();
		v.value();

	}

}
