package com.example.energydashboard.model;

import java.util.List;

import java.util.List;

public class ChartData {

    private List<String> labels;
    private List<Dataset> datasets;

    // Constructor
    public ChartData(List<String> labels, List<Dataset> datasets) {
        this.labels = labels;
        this.datasets = datasets;
    }

    // Default constructor
    public ChartData() {}

    // Getters and Setters
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
    }

    // Dataset class to represent a dataset in the chart
    public static class Dataset {

        private String label;
        private List<Integer> data;
        private String borderColor;

        // Constructor
        public Dataset(String label, List<Integer> data, String borderColor) {
            this.label = label;
            this.data = data;
            this.borderColor = borderColor;
        }

        // Getters and Setters
        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public List<Integer> getData() {
            return data;
        }

        public void setData(List<Integer> data) {
            this.data = data;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(String borderColor) {
            this.borderColor = borderColor;
        }
    }
}
