package com.example.energydashboard.model;


public class ChartOptions {

    private boolean responsive = true;
    private boolean maintainAspectRatio = false;
    private Scales scales;

    public ChartOptions() {
        this.scales = new Scales();
    }

    public boolean isResponsive() {
        return responsive;
    }

    public void setResponsive(boolean responsive) {
        this.responsive = responsive;
    }

    public boolean isMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    public void setMaintainAspectRatio(boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
    }

    public Scales getScales() {
        return scales;
    }

    public void setScales(Scales scales) {
        this.scales = scales;
    }

    public static class Scales {

        private Axis x;
        private Axis y;

        public Scales() {
            this.x = new Axis();
            this.y = new Axis();
        }

        public Axis getX() {
            return x;
        }

        public void setX(Axis x) {
            this.x = x;
        }

        public Axis getY() {
            return y;
        }

        public void setY(Axis y) {
            this.y = y;
        }

        public static class Axis {

            private boolean display = true;
            private Title title;

            public Axis() {
                this.title = new Title();
            }

            public boolean isDisplay() {
                return display;
            }

            public void setDisplay(boolean display) {
                this.display = display;
            }

            public Title getTitle() {
                return title;
            }

            public void setTitle(Title title) {
                this.title = title;
            }

            public static class Title {
                private boolean display = true;
                private String text;

                public Title() {
                }

                public boolean isDisplay() {
                    return display;
                }

                public void setDisplay(boolean display) {
                    this.display = display;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }
            }
        }
    }
}