package web.smartmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import web.smartmanagement.interceptor.TokenIntorceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private TokenIntorceptor tokenIntorceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
//        registry.addInterceptor(tokenIntorceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns(
//                        "/",
//                        "/login",
//                        "/index.html",
//                        "/**/*.html",
//                        "/**/*.js",
//                        "/**/*.css",
//                        "/**/*.png",
//                        "/**/*.jpg",
//                        "/**/*.jpeg",
//                        "/**/*.gif",
//                        "/**/*.ico",
//                        "/**/*.svg",
//                        "/**/*.woff",
//                        "/**/*.woff2",
//                        "/**/*.ttf",
//                        "/**/*.eot"
//                );
    }
}