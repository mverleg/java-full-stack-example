package nl.markv.demo.javafullstack.client;

import org.teavm.flavour.templates.Templates;

public class Main {
	public static void main(String[] args) {
		Templates.bind(new SearchComponent(15, 15), "minefield");
	}
}
