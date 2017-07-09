package exercise.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Session storage using Redis. Session expires after 60 seconds
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
public class SessionConfig {


}
