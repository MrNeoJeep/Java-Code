package demo.USTS.chapter9;

import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Text9_3 {

	public static void main(String[] args) {
		// 将JFrame区域分成大小相等的2*2块，分别装入4幅图片，鼠标进入哪个区域，就在该区域显示一幅图片,移出后则不显示图片
		imageGui im = new imageGui();
		im.setVisible(true);
	}

}

class imageGui extends JFrame implements MouseMotionListener 
{
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	
	public imageGui() {
		this.setTitle("图片展示");
		this.setLayout(new GridLayout(2,2));
		this.setSize(400,400);
		this.setVisible(true);
		
		button1 = new JButton("image1");
		button2 = new JButton("image2");
		button3 = new JButton("image3");
		button4 = new JButton("image4");
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		ImageIcon img1=new ImageIcon("D:\\Picture\\壁纸\\image1.png");
		ImageIcon img2=new ImageIcon("D:\\Picture\\壁纸\\image2.png");
		ImageIcon img3=new ImageIcon("D:\\Picture\\壁纸\\image3.jpg");
		ImageIcon img4=new ImageIcon("D:\\Picture\\壁纸\\image4.jpg");
		JLabel imgLabel1 = new JLabel(img1);
		JLabel imgLabel2 = new JLabel(img2);
		JLabel imgLabel3 = new JLabel(img3);
		JLabel imgLabel4 = new JLabel(img4);
		button1.addMouseListener(new MouseListener() {
			
			
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
			}
			
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
		
			}
			
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		
	}
	

	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		
	}


	
}