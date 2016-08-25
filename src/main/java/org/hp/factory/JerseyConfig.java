package org.hp.factory;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by Keyur on 25-08-2016.
 */
@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		packages("org.hp.rest");
	}
}
