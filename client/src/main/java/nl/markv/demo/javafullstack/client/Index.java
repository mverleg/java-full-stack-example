package nl.markv.demo.javafullstack.client;

import org.teavm.flavour.templates.Templates;

public class Index {
	public static void main(String[] args) {
		Templates.bind(new SearchInputComponent(), "search-input");
		Templates.bind(new SearchResultComponent(), "search-result");
	}
}
