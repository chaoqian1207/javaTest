package aa;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;


public class bb 
{
	private JFrame jfrmMain;
	private Container con;
	
	private JMenuBar jmnbTop;
	
	private JMenu jfrmFile;
	private JMenuItem jfriNew;
	private JMenuItem jfriOpen;
	private JMenuItem jfriSave;
	private JMenuItem jfriExit;
	
	private JMenu jfrmEdit;
	
	private JMenuItem jfriCopy;
	private JMenuItem jfriPaste;
	private JMenuItem jfriReplace;
	
	private JMenu jfrmForm;
	private JMenuItem jfriAuto;//�Զ�����
	private JMenuItem jfriFont;
	
	
    private JPopupMenu popMenu;
	private JMenuItem jfriCopy1;
	private JMenuItem jfriPaste1;	
	private JMenuItem jfriSave1;
	private JMenuItem jfriExit1;
	
	
	private JButton jbtExit;
	
	
	public bb()
	{
		initFrame();
		dealAction();
		
	}
	
	

	public static final void showMsg(JFrame jfrm, String mess)
	{
		JOptionPane.showMessageDialog(jfrm, mess, "ϵͳ��ܰ��ʾ", 
				JOptionPane.CLOSED_OPTION);
	}
	

	private void dealAction()
	{
	      jbtExit.addActionListener
	      (
		      new ActionListener()
		     {
		     	public void actionPerformed(ActionEvent e)
			    {
		     		showMsg(jfrmMain, "ȷ��Ҫ�˳���");
			         jfrmMain.dispose();
			         
			    }
			
		     }	
	     );
	      
	      
	      jfrmMain.addMouseListener
			(     new MouseListener()
					{
						public void mouseClicked(MouseEvent e) {}
						public void mouseReleased(MouseEvent e) {}
						public void mouseEntered(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						
						public void mousePressed(MouseEvent e) 
						{
							if (e.getButton()==3)
								popMenu.show(jfrmMain, e.getX(), e.getY());
						}
					}
			);
	      
	}

	
	
	private void initFrame()
	{
	   Font normalFont=new Font("����",Font.PLAIN,16);
	   jfrmMain=new JFrame("���±�");
	   
	   con = jfrmMain.getContentPane();
	   con.setLayout(null);
	   jfrmMain.setSize(900, 500);
	   jfrmMain.setLocation(40,80);
	
	   jmnbTop = new JMenuBar();
	   
	   
	   jfrmFile =new JMenu("�ļ�");
	   jfriNew =new JMenuItem("�½�");
	   jfriOpen =new JMenuItem("��");
	   jfriSave=new JMenuItem("����");
	   jfriExit =new JMenuItem("�˳�");
	   jfrmFile.add(jfriNew);
	   jfrmFile.addSeparator();
	   jfrmFile.add(jfriOpen);
	   jfrmFile.addSeparator();
	   jfrmFile.add(jfriSave);
	   jfrmFile.addSeparator();
	   jfrmFile.add(jfriExit);
	   jmnbTop.add(jfrmFile);
	   
	   jfrmEdit =new JMenu("�༭");
	   jfriCopy =new JMenuItem("����");
	   jfriPaste =new JMenuItem("ճ��");
	   jfriReplace =new JMenuItem("�滻");
	   
	   jfrmEdit.add(jfriCopy);
	   jfrmEdit.addSeparator();
	   jfrmEdit.add(jfriPaste);
	   jfrmEdit.addSeparator();
	   jfrmEdit.add(jfriReplace);
	   jfrmEdit.addSeparator();
	   jmnbTop.add(jfrmEdit);
	   
	   
	   
	   
	   
	   jfrmForm =new JMenu("��ʽ");
	   jfriAuto =new JMenuItem("�Զ�����");
	   jfriFont =new JMenuItem("����");
	   jfrmForm.add(jfriAuto);
	   jfrmForm.addSeparator();
	   jfrmForm.add(jfriFont);
	   jmnbTop.add(jfrmForm);
	   
	   popMenu=new JPopupMenu();
	   jfriCopy1 =new JMenuItem("����");
	   jfriPaste1=new JMenuItem("ճ��");
	   jfriSave1=new JMenuItem("����");
	   jfriExit1=new  JMenuItem("�˳� ");
	   popMenu.addSeparator();
	   popMenu.add(jfriCopy1);
	   popMenu.addSeparator();
	   popMenu.add(jfriPaste1);
	   popMenu.addSeparator();
	   popMenu.add(jfriSave1);
	   popMenu.addSeparator();
	   popMenu.add(jfriExit1);
	   jfrmMain.add(popMenu);
	   
	   jfrmMain.setJMenuBar(jmnbTop);
	   jfrmMain.setVisible(true);

	   jfrmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   jbtExit=new JButton("�˳�");
	   jbtExit.setFont(normalFont);
	   jbtExit.setBounds(650, 350, 90, 35);
	   con.add(jbtExit);
	   
	}

	
	public static void main(String[] args)
	{
	   new bb();

	}

}
