package ch12;

import java.util.ArrayList;
import java.util.List;

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();

		// ArrayList<Product> tvList2 = new ArrayList<Tv>(); // Type mismatch 에러

		List<Tv> tvList2 = new ArrayList<Tv>(); // 지네릭 타입이 아닌 클래스 타입 간에 다형성을 적용하는 것은 가능

		// 지네릭 타입을 조상으로 해두고 자손 타입들을 넣는 것은 가능
		productList.add(new Tv());
		productList.add(new Audio());

		tvList.add(new Tv());
		tvList.add(new Tv());

		printAll(productList);
		// printAll(tvList); 지네릭 타입이 맞지 않아 컴파일 에러 발생
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
