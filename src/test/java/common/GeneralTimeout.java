package common;

import java.time.Duration;

public class GeneralTimeout {
    public static final Duration COMMON = Duration.ofSeconds(5000);
    public static final Duration SHORT = Duration.ofSeconds(1000);
    public static final Duration BIG = Duration.ofSeconds(10000);
    public static final Duration SUPER_BIG = Duration.ofSeconds(20000);
    public static final Duration HUGE = Duration.ofSeconds(40000);
}
