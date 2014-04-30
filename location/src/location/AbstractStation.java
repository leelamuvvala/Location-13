package location;

/** 
* ������������ ������� �������. 
* @author Pokrovskaya Oksana
*/
public abstract class AbstractStation {

	/** �������� */
	private int x;
	/** �������� */
	private int y;

	/** ������� ���� ������� */
	private int s;

	public AbstractStation() {
		x = 0;
		y = 0;
		s = 0;
	}

	/** 
	* @param x1 �������� 
	* @param y1 �������� 
	* @param s1 ������� ���� �������
	*/
	public AbstractStation(int x1, int y1, int s1) {
		x = x1;
		y = y1;
		s = s1;
	}

	/** 
	* ������������ ���� �������.
	* @param tail ������, � ������� ���������� ���������� ���� ������� 
	*/
	public abstract void explode(Tail tail);

}
