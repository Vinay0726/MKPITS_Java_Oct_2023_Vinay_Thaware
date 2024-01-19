package com.mkpits.interfaces;

import java.io.IOException;

public interface VinzBank {

	void createAccount() throws IOException;
	void deposit() throws IOException;
	void withDrawal() throws IOException;
	void CheckBalance();
	void Details();
	
}
