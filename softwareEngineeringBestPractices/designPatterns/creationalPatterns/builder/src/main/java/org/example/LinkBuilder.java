package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LinkBuilder {

    private final String host;
    private final int port;
    private final String path;
    private final Map<String, String> params;

    private LinkBuilder(Builder builder) {
        this.host = builder.host;
        this.port= builder.port;
        this.path = builder.path;
        this.params = Collections.unmodifiableMap(new HashMap<>());
    }

    public static class Builder {
        private String host;
        private int port;
        private String path;
        private Map<String, String> params = new HashMap<>();

        public Builder host(String host) {
            this.host = host;
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

        public Builder addParams(String key, String value) {
            this.params.put(key, value);
            return this;
        }

        public LinkBuilder build() {
            return new LinkBuilder(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder link = new StringBuilder("");

        link.append("https://")
                .append(host)
                .append(":")
                .append(port)
                .append("/")
                .append(path);

        if(!params.isEmpty()) {
            for(Map.Entry<String, String> entry : params.entrySet()) {
                link.append(entry.getKey()).append("=").append(entry.getValue()).append("?");
            }
            link.deleteCharAt(link.length()-1);
        }

        return link.toString();
    }
}
