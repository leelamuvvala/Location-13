package location;

import javax.swing.*;

import java.awt.*;

/** 
* ������, �������������� ���� ������.
* @author Pokrovskaya Oksana
*/
public class ImagePanel extends JPanel {

	private Location location = null;
	//������� ����� ��� ��������� ����
    private int wPen = 5;
	//������� ����� ��� ��������� ������� �����
    private int bPen = 1;
	//������� ����� ��� ��������� �������� �������
    private int borderPen = 8;
	/** ���������� ��������, ��������� ��� ��������� ������� ������ */
	private int bar = 10;
	/** ������� - ������� ����� ������� ����� � ����� ����� */
	private int m = 3;
	/** ���������� �����, ����������� �� ����������� */
	private int hBars;
	/** ���������� �����, ����������� �� ��������� */
	private int vBars;
	/** ������ ������ */
	private int width;
	/** ������ ������ */
	private int height;
	
	/** ������������ ������� */
	private int maxM = 10;
	/** ����������� ������� */
	private int minM = 1;
	
	/**
	 * @return �������
	 */
	public int getM() {
		return m;
	}
	
	/**
	 * ���������� �������.
	 * @param m1 ����� �������� ��������
	 */
	public void setM(int m1) {
		width += (hBars / m) * (m1 - m);
		height += (vBars / m) * (m1 - m);
		setMinimumSize(new Dimension(width, height));
		setPreferredSize(new Dimension(width, height));
		m = m1;
	}


    	/** 
     	* @param width ������ ���� ��� ���������
     	* @param height ������ ���� ��� ���������
     	*/
    	ImagePanel(int w, int h, Location l) {
			super();
	
			width = w;
			height = h;
	
			//������ ���������� ������
			Dimension size = new Dimension(width, height);
			setMaximumSize(size);
			setMinimumSize(size);
			
			location = l;
	
			//������������ ���������� �����, ����������� �� ����������� � ���������
			hBars = width / bar;
			vBars = height / bar;
    	}

    	public void update(Graphics gr) {
    		paintComponent(gr);
    	}

    	public void paintComponent(Graphics gr) {
        	super.paintComponent(gr);
			Graphics2D g = (Graphics2D) gr;
	
			//������������� ������� �����
			BasicStroke b = new BasicStroke(bPen); 
			g.setStroke(b);
			g.setColor(Color.GRAY);
			for (int i = 0; i < vBars; i++)
				g.drawLine(0, bar * i, width, bar * i);
			for (int i = 0; i < hBars; i++)
				g.drawLine(bar * i, 0, bar * i, height);
	
			Plan plan = location.getPlan();
	
			//������������ ���������� ������
			/*if (location.hasOpenFile()) {
				for (int i = 0; i < location.frames.length; i++)
					for (int j = 0; j < location.frames[0].length; j++)
						if (!location.frames[i][j].isUsed())
							fillColor(location.frames[i][j].getX1() * m * bar, 
							location.frames[i][j].getY1() * m * bar,
							location.frames[i][j].getX2() * m * bar, 
							location.frames[i][j].getY2() * m * bar);
			}*/
	
			
			//������������ �����
			g.setColor(Color.BLACK);
			BasicStroke w = new BasicStroke(wPen); 
			g.setStroke(w);
			if (location.hasOpenFile())
				for (int i = 0; i < plan.getWalls().length; i++) {
					g.drawLine((int) plan.getWall(i).getX1() * m * bar, 
							(int) plan.getWall(i).getY1() * m * bar, 
							(int) plan.getWall(i).getX2() * m * bar, 
							(int) plan.getWall(i).getY2() * m * bar);
				}

			//������������ ������� ������
			Color green = new Color((float) 0.0, (float) 1.0, (float) 0.0, (float) 0.5);
			g.setColor(green);
			BasicStroke brd = new BasicStroke(borderPen); 
			g.setStroke(brd);
			if (location.hasOpenFile()) {
				Border border = plan.getBorder();
				for (int i = 0; i < border.getDotes().length - 1; i++) {
					g.drawLine(border.getDote(i)[0] * m * bar, 
					border.getDote(i)[1] * m * bar, 
					border.getDote(i + 1)[0] * m * bar, 
					border.getDote(i + 1)[1] * m * bar);
				}
			}
	
			//������������ ������ ���������
			/*g.setStroke(b);
			g.setColor(Color.RED);
			if (location.hasOpenFile()) {
				for (int i = 0; i < location.hDotesNum; i++)
					g.drawLine(location.hDotes.get(i) * m * bar, 0, 
					location.hDotes.get(i) * m * bar, height);
				for (int i = 0; i < location.vDotesNum; i++)
					g.drawLine(0, location.vDotes.get(i) * m * bar, 
					width, location.vDotes.get(i) * m * bar);
			}*/
		

			//������������ ��������� ������
			/*if (location.hasOpenFile()) {
				g.setColor(Color.BLUE);
				//g.setStroke(brd);
				for (int i = 0; i < location.finalFramesNum; i++)
					g.drawRect(location.finalFrames[i].getX1() * m * bar + 5,
						location.finalFrames[i].getY1() * m * bar + 5,
					((location.finalFrames[i].getX2() - location.finalFrames[i].getX1()) * m * bar) - 10,
	 				((location.finalFrames[i].getY2() - location.finalFrames[i].getY1()) * m * bar) - 10);
			}*/
			
			//������������ �������� ������
			if (location.hasOpenFile()) {
				g.setStroke(b);
				g.setColor(Color.red);
				Tail[] t = location.getTails();
				for (int i = 0; i < location.getTailsNum(); i++)
					g.drawRect((int) t[i].getX1() * m * bar,
							(int) t[i].getY1() * m * bar,
							(int) (t[i].getX2() - t[i].getX1()) * m * bar,
							(int) (t[i].getY2() - t[i].getY1()) * m * bar);
			}
 	}

    	/** 
     	* ��������� ������ �������������.
     	*/
	public void fillColor(int x1, int y1, int x2, int y2) {
		Color c = new Color((float) 0.0, (float) 0.0, (float) 0.1, (float) 0.5);
		Graphics2D g = (Graphics2D) this.getGraphics();
		g.setColor(c);
		g.fillRect(x1, y1, x2 - x1, y2 - y1);
	}
}
