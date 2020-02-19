package main;

import entrypoint.SystemFacade;
import entrypoint.environment.DevelopmentEnvironment;
import entrypoint.environment.ServerEnvironment;
import entrypoint.environment.UserEnvironment;

public class Client {

	public static void main(String[] args) {
		System.out.println("*** Starting DEV environment ***");
		dev();
		System.out.println("\n*** Starting SERVER environment***");
		server();
		System.out.println("\n*** Starting USER environment ***");
		user();
		System.out.println("\n\nSUCCESS!");
	}
	
	public static void dev() {
		SystemFacade devFacade = new DevelopmentEnvironment();
		devFacade.startSystem();
	}
	
	public static void server() {
		SystemFacade serverFacade = new ServerEnvironment();
		serverFacade.startSystem();
	}
	
	public static void user() {
		SystemFacade userFacade = new UserEnvironment();
		userFacade.startSystem();
	}
	
}
