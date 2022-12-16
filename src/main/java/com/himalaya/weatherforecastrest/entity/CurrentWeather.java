package com.himalaya.weatherforecastrest.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CurrentWeather implements Serializable {
    private String description;
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;

    public CurrentWeather(String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed) {
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
    }

    public String description() {
        return description;
    }

    public CurrentWeather setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal temperature() {
        return temperature;
    }

    public CurrentWeather setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
        return this;
    }

    public BigDecimal feelsLike() {
        return feelsLike;
    }

    public CurrentWeather setFeelsLike(BigDecimal feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public BigDecimal windSpeed() {
        return windSpeed;
    }

    public CurrentWeather setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }
}
