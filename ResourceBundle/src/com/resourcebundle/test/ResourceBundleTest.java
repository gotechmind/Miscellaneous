package com.resourcebundle.test;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	public static void main(String args[]) {
		Locale[] locales = new Locale[] {
				Locale.GERMAN,
				Locale.US
		};
		Arrays.asList(locales).forEach(ResourceBundleTest::resouceBundle);

	}

	public static void resouceBundle(Locale locale) {
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", locale);  
		System.out.println("Locale = \'" + locale + "\' message is =\'"+bundle.getString("message")+ "\'");  
	}
}
