package nl.markv.demo.javafullstack.client.components;

import org.teavm.flavour.templates.BindElement;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.templates.Slot;
import org.teavm.flavour.widgets.AbstractWidget;

@BindTemplate("components/hello.html")
@BindElement(name = "say-hello")
public class HelloWorldComponent extends AbstractWidget {
	public HelloWorldComponent(Slot slot) {
		super(slot);
	}
}

