package web.smartmanagement.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import web.smartmanagement.utils.JwtUtils;

@Component
@Slf4j
//返回值是true则放行，返回值是false则不放行
public class TokenIntorceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //1.获取请求路径
        String requestURI = request.getRequestURI();


        //2.判断是否是登录请求，如果是登录请求，则放行
        if (requestURI.contains("/login")) {
            return true;
        }

        //3.获取请求头中的令牌(token)
        String token = request.getHeader("token");

        //4.判断令牌是否为空,如果为空则返回401状态码
        if (token == null) {
            log.info("请求头中没有token令牌");
            response.setStatus(401);
            return false;

        }
        //5.解析令牌，如果解析失败则返回401状态码
        try {
            JwtUtils.parseToken(token);
        } catch (Exception e) {
            log.error("解析令牌失败", e);
            response.setStatus(401);
            return false;
        }




        return true;
    }
}
