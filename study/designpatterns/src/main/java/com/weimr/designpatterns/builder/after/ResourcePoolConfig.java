package com.weimr.designpatterns.builder.after;

import org.apache.commons.lang.StringUtils;

public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    private ResourcePoolConfig(Builder builder){
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build(){
            if(StringUtils.isBlank(name)){
                throw new IllegalArgumentException("name should not be empty.");
            }
            if(maxIdle > maxTotal){
                throw new IllegalArgumentException("...");
            }
            if(minIdle > maxTotal || minIdle > maxIdle){
                throw new IllegalArgumentException("...");
            }
            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name){
            if(StringUtils.isBlank(name)){
                throw new IllegalArgumentException("name should not be empty.");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal){
            if(maxTotal < 0){
                throw new IllegalArgumentException("maxTotal should be positive.");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle){
            if(maxIdle < 0){
                throw new IllegalArgumentException("maxIdle should be positive.");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle){
            if(minIdle < 0){
                throw new IllegalArgumentException("minIdle should be positive.");
            }
            this.minIdle = minIdle;
            return this;
        }
    }
}