package location;

/** 
* ������������ ������. 
* @author Pokrovskaya Oksana
*/
public class Tail {

	/** �������� ������ �������� ���� */
	private double x1;
	/** �������� ������ �������� ���� */
	private double y1;
	/** �������� ������� ������� ���� */
	private double x2;
	/** �������� ������� ������� ���� */
	private double y2;

	/** ������ ������� ������������� */
	private Law laws;

	public Tail() {
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		laws = null;
	}

	/** 
	* @param x11 �������� ������ �������� ���� (< x21)
	* @param y11 �������� ������ �������� ���� (> y21)
	* @param x21 �������� ������� ������� ����
	* @param y21 �������� ������� ������� ����
	*/
	public Tail(int x11, int y11, int x21, int y21) {
		//���� ���������� ����
		if ((x21 <= x11) || (y11 <= y21))
			//add exeption
		x1 = x11;
		x2 = x21;
		y1 = y11;
		y2 = y21;
	}

	public Tail(double x11, double y11, double x21, double y21) {
		// TODO Auto-generated constructor stub
		x1 = x11;
		x2 = x21;
		y1 = y11;
		y2 = y21;
	}

	/** 
	* �������� �������� ������ �������� ����.
	*/
public double getX1() {
	return x1;
}

	/** 
	* �������� �������� ������� ������� ����.
	*/
public double getX2() {
	return x2;
}

	/** 
	* �������� �������� ������ �������� ����.
	*/
public double getY1() {
	return y1;
}

	/** 
	* �������� �������� ������� ������� ����.
	*/
public double getY2() {
	return y2;
}

}
