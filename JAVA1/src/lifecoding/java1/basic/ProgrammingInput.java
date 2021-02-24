package lifecoding.java1.basic;
import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class ProgrammingInput {
	
	public static void main(String[] args) {
		
		// ����ڰ� �Է��� ���� ���� �ٸ� ������ �ϰ� ��. swing��� �����. (import Ȯ���ϱ�.)
		String id = JOptionPane.showInputDialog("Enter a ID");
		// �� �� �־��� �� �ֵ��� �ϱ�.
		String bright = JOptionPane.showInputDialog("Enter a ID");
		
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
		
		// ��⸦ ������ �� ����.
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		// moodLamp.setBright(10); // 10%�� ���
		moodLamp.setBright(Double.parseDouble(bright)); // �Է��� bright ���� double(�Ǽ�)�� �������.
		moodLamp.on();
	}

}
