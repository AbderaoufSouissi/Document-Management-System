package com.ars.dms_backend.domain;



public class RequestContext {
    public static final ThreadLocal<Long> USER_ID = new ThreadLocal<>();

    private RequestContext() {}


    public static void start() {
        USER_ID.remove();
    }

    public static void setUserId(Long userId) {
        USER_ID.set(userId);
    }

    public static Long getUserId() {
        return USER_ID.get();
    }

}
