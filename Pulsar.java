package accessible;

public class Pulsar {

	public static void main(String[] args) {
	
					
				// TODO Auto-generated method stub
					System.out.println("features of bike:");
					
					access.MyBike bike=new access.MyBike();
					//here created fully qualified name to access the object of the
					//class mybike from the package my
					bike.gears();//displays the get methods for the objects provided
					bike.breaks();
					bike.clutch();
					bike.kickrod();
					bike.fueltank();
			}
			}
