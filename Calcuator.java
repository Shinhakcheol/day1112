package method;

public class Calcuator {

	// 두 정수를 입력 받고 + 결과를 리턴하는 메서드

	public int plus(int a, int b) {
		// return; 리턴 키워드만 사용하면 안됨
		return a+b;
	}
	public double plus(double a, double b) {
		// return; 리턴 키워드만 사용하면 안됨
		return a+b;
	}

	public int minus(int a, int b) {
		return a-b;
	}

	public int mul(int a, int b) {
		return a*b;
	}

	public double div(int a, int b) {
		if(b==0) {
			return 0.0;
		}
		return (double)a/b;
	}

}
