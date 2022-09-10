package suchit2;

public class PassingData {
	public void sendData() {
		getData();
	}

	public void getData(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

class mainDriver {

	public static void main(String[] args) {
		PassingData a = new PassingData();
		a.sendData();
		System.out.println("hello");

	}
}

//o/p---> program will execute properly without any error and there will be no output also
