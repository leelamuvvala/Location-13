package location;

/** 
* ������������ �����. 
* @author Pokrovskaya Oksana
*/
public class Wall {
	/** �������� ������� ����� */
	private int x1;
	/** �������� ������� ����� */
	private int y1;
	/** �������� ������� ����� */
	private int x2;
	/** �������� ������� ����� */
	private int y2;

	public Wall() {
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}

	/** 
	* @param x11 �������� ������� �����
	* @param y11 �������� ������� �����
	* @param x21 �������� ������� �����
	* @param y21 �������� ������� �����
	*/
	public Wall(int x11, int y11, int x21, int y21) {
		//���� ������� �� ���������� ����� �� ����
		if (!((x11 == x21) || (y11 == y21))) {
			//add exeption
		}
		x1 = x11;
		x2 = x21;
		y1 = y11;
		y2 = y21;
	}

    	/** 
    	* �������� �������� ������� �����.
    	*/
	public int getX1() {
		return x1;
	}

    	/** 
    	* �������� �������� ������� �����.
    	*/
	public int getX2() {
		return x2;
	}

    	/** 
    	* �������� �������� ������� �����.
    	*/
	public int getY1() {
		return y1;
	}

    	/** 
    	* �������� �������� ������� �����.
    	*/
	public int getY2() {
		return y2;
	}
}
