package com.example.dozerDemo;

public class DestinationBean {

	private String ING_destName;
	private String ING_destAddress;

	public String getING_destName() {
		return ING_destName;
	}

	public void setING_destName(String iNG_destName) {
		ING_destName = iNG_destName;
	}

	public String getING_destAddress() {
		return ING_destAddress;
	}

	public void setING_destAddress(String iNG_destAddress) {
		ING_destAddress = iNG_destAddress;
	}

	@Override
	public String toString() {
		return ING_destName + "," + ING_destAddress;
	}

}
