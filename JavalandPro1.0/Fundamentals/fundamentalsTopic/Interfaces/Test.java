package fundamentalsTopic.Interfaces;

import fundamentalsTopic.HelloWorld.StsticVariables;

public class Test {

	public static void main(String[] args) {
		Honda h  =  new Honda();
		h.go();
		h.stop();
		int num = StsticVariables.num;
		System.out.println(num);

	}

}
