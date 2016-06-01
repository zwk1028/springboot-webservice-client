package com.gstar;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ClientPasswordCallback implements CallbackHandler {

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		/*int usage = pc.getUsage();
		System.out.println("Identifier: " + pc.getIdentifier() + " , usage: " + pc.getUsage());
        if(usage == WSPasswordCallback.USERNAME_TOKEN) {
        	pc.setIdentifier("admin");
        	//pc.setPassword("password");
        } else if(usage== WSPasswordCallback.SIGNATURE) {
	        pc.setPassword("keyPassword");
        }*/
		pc.setPassword("3734c4c7cf0d374796f1e1bbf8f46c84");
	}

}
