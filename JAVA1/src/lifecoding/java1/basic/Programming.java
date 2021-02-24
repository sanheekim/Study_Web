package lifecoding.java1.basic;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class Programming {
	
	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
		// Elevator call
		// myElevator��� ������ �ݵ�� Elevator��� ������Ÿ�Կ� �ش�Ǵ� �����͸� �� �� ����.
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); // 1������ �ö� ��ư ����. ���������͸� 1������ ������� ��.
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
	}

}
