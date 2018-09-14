package com.backend.ws;

public class ResourceObject {
	String name;
	long id;
	
	public ResourceObject(String objName, long objId) {
		this.name = objName;
		this.id = objId;
	}

	public String getObjName() {
		return name;
	}

	public long getObjId() {
		return id;
	}

	@Override
	public String toString() {
		return "ResourceObject [objName=" + name + ", objId=" + id + "]";
	}
	
	

}
