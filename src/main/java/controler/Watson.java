package controler;

import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.cloud.sdk.core.service.security.IamOptions.Builder;
import com.ibm.watson.discovery.v1.Discovery;

public class Watson {

	
	IamOptions options = new IamOptions.Builder()
			.apiKey("RDfYUmhQaWUIejwabCvDdc-iojqH99WwtakQuuJJtttB")
			.build();
		Discovery discoveryy = new Discovery("2019-06-19", options);
		


	
	
}
