package com.example.EnterpriseLektion3MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.C;
import test.B;
import test.A;
import test.MyFinalClass;

@SpringBootApplication
public class EnterpriseLektion3MvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseLektion3MvcApplication.class, args);

		A fc = new B();
		fc.aPrint();

		B fc2 = new B();

		fc2.bPrint();
		fc2.aPrint();

		C cc = new C();

		cc.aPrint();
		cc.cPrint();
		cc.bPrint();

		MyFinalClass mfc = new MyFinalClass();

		mfc.aPrint();
		mfc.bPrint();
		mfc.cPrint();
		mfc.finalPrint();


		C a = new MyFinalClass();

		if (a instanceof A) {

			System.out.println("true");
			System.out.println(a.getClass());
		} else {
			System.out.println("false");
			System.out.println(a.getClass());
		}

	}

}
