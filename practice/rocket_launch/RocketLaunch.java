package practice.rocket_launch;

public class RocketLaunch {

	private boolean ignitionStatus,oxygenStatus,networkStatus,powerStatus,engineStatus;
	
	public boolean isIgnitionStatus() {
		return ignitionStatus;
	}

	public void setIgnitionStatus(boolean ignitionStatus) {
		this.ignitionStatus = ignitionStatus;
	}

	public boolean isOxygenStatus() {
		return oxygenStatus;
	}

	public void setOxygenStatus(boolean oxygenStatus) {
		this.oxygenStatus = oxygenStatus;
	}

	public boolean isNetworkStatus() {
		return networkStatus;
	}

	public void setNetworkStatus(boolean networkStatus) {
		this.networkStatus = networkStatus;
	}

	public boolean isPowerStatus() {
		return powerStatus;
	}

	public void setPowerStatus(boolean powerStatus) {
		this.powerStatus = powerStatus;
	}

	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public RocketLaunch(boolean ignitionStatus,boolean oxygenStatus,boolean networkStatus,boolean powerStatus,boolean engineStatus) {
		// TODO Auto-generated constructor stub
		setIgnitionStatus(ignitionStatus);
		setOxygenStatus(oxygenStatus);
		setNetworkStatus(networkStatus);
		setPowerStatus(powerStatus);
		setEngineStatus(engineStatus);
	}
	
	public void checkForLaunch() {
		for(int i=5;i>=0;i--) {
			System.out.println("T - "+i);
			
			if(i==5) {
				if(isIgnitionStatus()) {
					System.out.println("Ignition Checked");
				}
				else {
					System.out.println("Ignition Failed!!!!!");
					System.out.println("Rocket Not Launched Check For Ignation!!!!");
					return;
				}
			}
			
			else if(i==4) {
				if(isOxygenStatus()) {
					System.out.println("Oxygen Checked");
				}
				else {
					System.out.println("Oxygen Failed!!!!!");
					System.out.println("Rocket Not Launched Check For Oxygen!!!!");
					return;
				}
			}
			
			else if(i==3) {
				if(isNetworkStatus()) {
					System.out.println("Network Checked");
				}
				else {
					System.out.println("Network Failed!!!!!");
					System.out.println("Rocket Not Launched Check For Network!!!!");
					return;
				}
			}
			
			else if(i==2) {
				if(isPowerStatus()) {
					System.out.println("Power Checked");
				}
				else {
					System.out.println("Power Failed!!!!!");
					System.out.println("Rocket Not Launched Check For Power!!!!");
					return;
				}
			}
			
			else if(i==1) {
				if(isEngineStatus()) {
					System.out.println("Engine Checked");
				}
				else {
					System.out.println("Engine Failed!!!!!");
					System.out.println("Rocket Not Launched Check For Engine!!!!");
					return;
				}
			}
			
			else {
				System.out.println("Everthing is Correct!!!!\nIGNITION ON\nROCKET LAUNCHED");
				String rocket = 
			            "      ^\n" +
			            "     / \\\n" +
			            "    /___\\\n" +
			            "   |     |\n" +
			            "   |  R  |\n" +
			            "   |  O  |\n" +
			            "   |  C  |\n" +
			            "   |  K  |\n" +
			            "   |  E  |\n" +
			            "   |  T  |\n" +
			            "   |_____|\n" +
			            "   |  L  |\n"+
			            "   |  A  |\n"+
			            "   |  U  |\n"+
			            "   |  N  |\n"+
			            "   |  C  |\n"+
			            "   |  H  |\n"+
			            "   |  E  |\n"+
			            "   |  D  |\n"+
			            "   |     |\n"+
			            "   |_____|\n"+
			            "   //   \\ \n"+
			            "  //     \\ \n";
			        
			        System.out.println(rocket);
			}
			
		}
	}

}
