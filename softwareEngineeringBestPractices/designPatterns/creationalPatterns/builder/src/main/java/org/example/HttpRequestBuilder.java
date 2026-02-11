package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder {
    public enum Method {
        GET, POST, PUT, DELETE
    }

    private final Method method;
    private final String url;
    private final Map<String, String> headers;
    private String body;
    private final int timeout;

    private HttpRequestBuilder(Builder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.headers = Collections.unmodifiableMap(new HashMap<>());
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    public static class Builder {
        private Method method;
        private String url;
        private Map<String, String> headers;
        private String body;
        private int timeout;

        public Builder(Method method, String url) {
            this.method = method;
            this.url = url;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequestBuilder build() {
            return new HttpRequestBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "HttpRequestBuilder{" +
                "method=" + method +
                ", url='" + url + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}
