package org.example;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

public class UrlBuilder {

    private final String host;
    private final int port;
    private final String path;
    private final Map<String, String> params;


    private UrlBuilder(Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.path = builder.path;
        this.params = Collections.unmodifiableMap(new HashMap<>(builder.params));
    }

    public static class Builder {
        private String host;
        private int port;
        private String path;
        private Map<String, String> params = new HashMap<>();


        public Builder host(String name) {
            this.host = name;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder addParam(String key, String value) {
            this.params.put(key, value);
            return this;
        }

        public UrlBuilder build() {
            return new UrlBuilder(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder url = new StringBuilder("");

        url.append("https://")
                .append(host)
                .append(":")
                .append(port)
                .append("/")
                .append(path);

        if(!params.isEmpty()) {
            url.append("?");
            for(Map.Entry<String, String> entry : params.entrySet()) {
                url.append(entry.getKey())
                        .append("=")
                        .append(entry.getValue())
                        .append("&");
            }
            url.deleteCharAt(url.length()-1);
        }
        return url.toString();
    }
}
