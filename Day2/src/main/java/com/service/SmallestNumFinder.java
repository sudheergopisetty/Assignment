package com.service;

public class SmallestNumFinder {

	public double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
