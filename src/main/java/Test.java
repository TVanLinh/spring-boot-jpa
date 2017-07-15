import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import page.Page;
import page.PageService;

/**
 * Created by linhtran on 14/07/17.
 */
public class Test {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123456"));
        Page page = PageService.getPage(11,6,5);
        System.out.println(page);
    }
}
