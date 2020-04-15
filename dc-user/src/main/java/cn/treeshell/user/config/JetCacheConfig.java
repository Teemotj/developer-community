package cn.treeshell.user.config;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.context.annotation.Configuration;

/**
 * JetCache 配置类
 * @Author: panjing
 * @Date: 2020/3/25 21:48
 */
@EnableMethodCache(basePackages = "cn.treeshell.user")
@EnableCreateCacheAnnotation
@Configuration
public class JetCacheConfig {

}
