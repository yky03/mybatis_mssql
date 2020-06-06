package fxk.daemon.smartwhere;
 
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
/**
 * Handles requests for the application home page.
 *
 * Controller annotation: Controller�� ����ϰ��� �ϴ� Ŭ������ @Controller ������̼��� ����Ͽ� ����մϴ�.
 * servlet-context.xml�� �ִ� context:component-scan �� ��ϵǾ� ��û�� ���� ȣ��˴ϴ�.
 */
@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    /*
     * RequestMapping�� Controller�� �޼���� URL�� ������ �� ����Ѵ�.
     * value: ����Ʈ �Ӽ��̱� ������, ����� �����Ѵٸ� �� �κ��� �����ϰ� URL�� �Է� �����ϴ�.
     * method: GET, POST �� HTTP Request method�� ���� Ÿ���� ������ �� �ִ�.
     * params: HTTP Request�� ������ �Ķ���� ǥ���̴�. */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        return "home";
    }
    /*
     * 27~32 ������ �������ڸ�,
     * URL �ּ� "/" �� ȣ��Ǿ�����, home()�޼ҵ尡 ȣ��ȴ�.
     * home()�޼ҵ�� �Ķ���ͷ� locale�� ������ ������, 29�� ��ɹ��� ���� �ֿܼ� �αװ� ��µȴ�.
     * �׸��� 31�� ��ɹ��� ���� String Ÿ���� home2�� ���ϵȴ�.
     * HomeController2�� ����Ǹ� Front Controller�� ���� ������ View�� ȣ���ϰ� �ȴ�.
     * -->servlet-context.xml �� InternalResourceViewResolver������ ����
     * Ȩ��Ʈ�ѷ����� ���ϵ� ���� �տ� /WEB-INF/views/�� �ٰ�, �ڿ� .jsp�� �ٴ� View�� �����ϰԵȴ�.
     * ��������� /WEB-INF/views/home2.jsp �� ȣ��Ǿ� ����ڿ��� ��������.
     * */ 

}