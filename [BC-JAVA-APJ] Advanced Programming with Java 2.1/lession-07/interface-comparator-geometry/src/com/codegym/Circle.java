package com.codegym;

    public class Circle {
        private double radius;
        private String color;
        private boolean filled;

        public Circle() {
            this.radius = 1.0;
            this.color = "Green";
            this.filled = true;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            this.radius = radius;
            this.color = color;
            this.filled = filled;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Radius: "+radius+"  "+
                    "Color: "+color+"  "+
                    "Filled: "+filled;
        }
    }
