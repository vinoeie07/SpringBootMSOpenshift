package EurekaServer.discoveryserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ServerResource {

	@GetMapping
	public String OpenShiftHello() {
		return "Testing Openshift Cloud provided by Red Hat";
	}
}
