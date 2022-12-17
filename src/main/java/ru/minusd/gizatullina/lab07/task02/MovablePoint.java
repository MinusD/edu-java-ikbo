package ru.minusd.gizatullina.lab07.task02;

    public class MovablePoint implements Movable {
        private double x;
        private double y;

        public MovablePoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public MovablePoint() {
        }

        @Override
        public void moveUp(double y) {
            this.y += y;
        }

        @Override
        public void moveRight(double x) {
            this.x += x;
        }

        @Override
        public void moveDown(double y) {
            this.y -= y;
        }

        @Override
        public void moveLeft(double x) {
            this.x -= x;
        }
    }
