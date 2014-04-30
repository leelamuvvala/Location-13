package location;

/** 
* ������������ ������� �������. 
* @author Pokrovskaya Oksana
*/
public class Station {

	/** �������� */
	private int x;
	/** �������� */
	private int y;

	/** ������� ���� ������� */
	private int s;

	public Station() {
		x = 0;
		y = 0;
		s = 0;
	}

	/** 
	* @param x1 �������� 
	* @param y1 �������� 
	* @param s1 ������� ���� �������
	*/
	public Station(int x1, int y1, int s1) {
		x = x1;
		y = y1;
		s = s1;
	}

	/** 
	* ������������ ���� �������.
	* @param tail ������, � ������� ���������� ���������� ���� ������� 
	*/
	public void explode(Tail tail) {
		//...
	}

}
