package no.uka.findmyapp.android.rest.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import android.util.Log;

import no.uka.findmyapp.android.rest.datamodels.core.ServiceModel;

public class UkappServiceFactory {
	
	public static Map<String, ServiceModel> serviceModels;
	
	public static ServiceModel createServiceModel(UkappsServices service, String[] params) throws URISyntaxException, IllegalAccessException, InstantiationException {
		ServiceModel sm = serviceModels.get(service.getMapperName());
		Log.v("ASDA", sm.getUri().toString());
		String tempUri = sm.getUri().toString().replace("?", "%s");
		sm.setUri(new URI(String.format(tempUri, params)));
		Log.v("ASDA2", sm.getUri().toString());
		
		return sm;
	}
}
