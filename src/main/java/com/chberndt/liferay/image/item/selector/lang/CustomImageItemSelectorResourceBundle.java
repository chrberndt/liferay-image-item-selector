package com.chberndt.liferay.image.item.selector.lang;

import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

/**
 * @author Christian Berndt
 */
@Component(property = "language.id=", service = ResourceBundle.class)
public class CustomImageItemSelectorResourceBundle extends ResourceBundle {

	@Override
	public Enumeration<String> getKeys() {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", getClass());

		return resourceBundle.getKeys();
	}

	@Override
	protected Object handleGetObject(String key) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", getClass());

		return resourceBundle.getObject(key);
	}

}