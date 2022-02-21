package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass()); // @Slf4j로 가능(롬복)

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        log.trace("trace log = {}, {}", name, name);
        log.debug("trace log = {}, {}", name, name);
        log.info("info log = {}", name);
        log.warn("info log = {}", name);
        log.error("info log = {}", name);
        return "ok";
    }
}
