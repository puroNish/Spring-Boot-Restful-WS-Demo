package com.backend.ws;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@RequestMapping("/restfulOne")
	@CrossOrigin(origins = "http://localhost:4200")
    public ResourceObject[] greeting() {
		ResourceObject resourceObject1 = new ResourceObject("Bugatti", 1);
		ResourceObject resourceObject2 = new ResourceObject("Jaguar", 2);
		ResourceObject resourceObject3 = new ResourceObject("VolksWagon", 3);
		ResourceObject resourceObject4 = new ResourceObject("Toyota", 4);
		ResourceObject resourceObject5 = new ResourceObject("Audi", 5);
		ResourceObject[] resourceObjList= {resourceObject1 ,resourceObject2,resourceObject3,resourceObject4,resourceObject5};
        return resourceObjList;
    }

}
