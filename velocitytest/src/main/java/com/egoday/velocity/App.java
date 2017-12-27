package com.egoday.velocity;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class App {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("resource.loader", "class");
		p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		Velocity.init(p);

		VelocityContext context = new VelocityContext();
		context.put( "name", "Nombre App - Intermedio - Asunto final" );

		Template template = Velocity.getTemplate("text.vm");
		StringWriter sw = new StringWriter();
		template.merge( context, sw );

		System.out.println(sw.toString());
	}
}
