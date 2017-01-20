package org.springframework.content.commons.repository;

import java.io.InputStream;
import java.io.Serializable;

public interface ContentRepositoryInvoker {

    Class<?> getDomainClass();

    Class<? extends Serializable> getContentIdClass();

	InputStream invokeGetContent();

}
