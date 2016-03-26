package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@RequestMapping("devicemanagement/gateways/*")
	public String deviceManagement() {
		return "DeviceManagement for Gateways. This should be secured!";
	}

	@RequestMapping
	public String other() {
		return "Other resource";
	}
}
