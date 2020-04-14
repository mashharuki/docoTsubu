package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class NoAppScopeAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
	//System.out.println("警告：格納は禁止されています！");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
	// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
	// TODO 自動生成されたメソッド・スタブ
	}
}