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
 * Controller annotation: Controller로 사용하고자 하는 클래스에 @Controller 어노테이션을 명시하여 사용합니다.
 * servlet-context.xml에 있는 context:component-scan 에 등록되어 요청에 따라 호출됩니다.
 */
@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    /*
     * RequestMapping은 Controller의 메서드와 URL을 맵핑할 때 사용한다.
     * value: 디폴트 속성이기 때문에, 밸류만 정의한다면 앞 부분은 생략하고 URL만 입력 가능하다.
     * method: GET, POST 등 HTTP Request method에 따라 타입을 지정할 수 있다.
     * params: HTTP Request로 들어오는 파라미터 표현이다. */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        return "home";
    }
    /*
     * 27~32 라인을 설명하자면,
     * URL 주소 "/" 가 호출되었을때, home()메소드가 호출된다.
     * home()메소드는 파라미터로 locale을 가지고 있으며, 29번 명령문에 의해 콘솔에 로그가 출력된다.
     * 그리고 31번 명령문에 의해 String 타입의 home2가 리턴된다.
     * HomeController2가 종료되면 Front Controller에 의해 적절한 View를 호출하게 된다.
     * -->servlet-context.xml 의 InternalResourceViewResolver구문을 보면
     * 홈컨트롤러에서 리턴된 값의 앞에 /WEB-INF/views/가 붙고, 뒤에 .jsp가 붙는 View를 맵핑하게된다.
     * 결론적으로 /WEB-INF/views/home2.jsp 가 호출되어 사용자에게 보여진다.
     * */ 

}