package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		JLabel l1,l2;
		JTextField t;
		JPasswordField p;
		JButton b;
		String adi="Ali";
		String sifre="12345";
		
		
		
		l1=new JLabel("Kullanıcı Adı");
		l1.setBounds(100,50,200,50);
		t=new JTextField();
		t.setBounds(100, 100, 200, 50);
		l2=new JLabel ("Şifre");
		l2.setBounds(100, 150, 200, 50);
		p=new JPasswordField();
		p.setBounds(100,200,200,50);
		b=new JButton("Giriş");
		b.setBounds(100, 250, 200, 50);
		b.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass=new String (p.getPassword());
				if(adi.equals(t.getText())&& sifre.equals(pass)) {
					System.out.println("Giriş Yapıldı");
					f.setVisible(false);
				}else
					System.out.println("Htalı adı && şifre");
			}
		});
		
		
		
		f.add(p);
		f.add(b);
		f.add(l2);
		f.add(t);
		f.add(l1);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
		
		
	}
}
