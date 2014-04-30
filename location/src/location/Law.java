package location;

/** 
* ������������ ���������� ����� ������������� � ������. 
* @author Pokrovskaya Oksana
*/
public class Law {
	/** �������������� �������� */
	private int a;
	/** ��������� */
	private int q;
	/** ������� �������, � ������� ������ ����� */
	private Station station;

	public Law() {
		a = 0;
		q = 0;
		station = null;
	}
	
	/** 
	* @param a1 �������������� ��������
	*/
	public Law(int a1) {
		a = a1;
		q = 0;
		station = null;
	}

	/** 
	* @param a1 �������������� ��������
	* @param s1 ������� �������
	*/
	public Law(int a1, Station s1) {
		a = a1;
		q = 0;
		station = s1;
	}

	/** 
	* @param a1 �������������� ��������
	* @param s1 ������� �������
	* @param q1 ���������
	*/
	public Law(int a1, int q1, Station s1) {
		a = a1;
		q = q1;
		station = s1;
	}

	/** 
	* @param s1 ������� �������
	*/
	public Law(Station s1) {
		station = s1;
	}


	/** 
	* @param a1 �������������� ��������
	* @param q1 ���������
	*/
	public Law(int a1, int q1) {
		a = a1;
		q = q1;
		station = null;
	}
	
	/** 
	* �������� �������������� ��������.
	* @param a1 �������������� ��������
	*/
	public void chA(int a1) {
		a = a1;
	}
	
	/** 
	* �������� ���������.
	* @param q1 ���������
	*/
	public void chQ(int q1) {
		q = q1;
	}
	
	/** 
	* �������� ������� �������.
	* @param s1 ������� �������
	*/
	public void chStation(Station s1) {
		station = s1;
	}
}
