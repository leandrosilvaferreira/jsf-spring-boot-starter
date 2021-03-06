package com.github.persapiens.jsfboot.primefaces;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Test
public class PrimefacesPropertiesTest {

	public void testTheme() {
		PrimefacesProperties primefacesProperties = new PrimefacesProperties();
        primefacesProperties.setTheme("omega");

		assertThat(primefacesProperties.getTheme()).isEqualTo("omega");
	}

	public void testCaptchaPrivateKey() {
		PrimefacesProperties primefacesProperties = new PrimefacesProperties();
        primefacesProperties.getCaptcha().setPrivateKey("myPrivateKey");

		assertThat(primefacesProperties.getCaptcha().getPrivateKey()).isEqualTo("myPrivateKey");
	}

}
