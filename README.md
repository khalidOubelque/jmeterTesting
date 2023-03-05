# jmeterTesting

# Monitoring Spring Boot Application With Micrometer, Prometheus And Grafana Using Custom Metrics + Some Jmeter testing

I will demonstrate how a Spring Boot web application can be monitored using Micrometer which exposes metrics from our application, Prometheus which stores the metric data, and Grafana to visualize the data in graphs.
Also i will do some performance testing using Jmeter.

## Micrometer
Micrometer provides a simple facade over the instrumentation clients for the most popular monitoring systems, allowing you to instrument your JVM-based application code without vendor lock-in. Think SLF4J, but for metrics.
It is possible to instantiate these types of meters from MeterRegistry:
  * Counter: reports merely a count over a specified property of an application
  * Gauge: shows the current value of a meter
  * Timers: measures latencies or frequency of events
  * DistributionSummary: provides distribution of events and a simple summary
  
## Prometheus
Prometheus stores our metric data in time series in memory by periodically pulling it via HTTP. The data can be visualized by a console template language, a built-in expression browser, or by integrating Grafana (which we will do after setting up Prometheus).
In this demo, we will run Prometheus locally in a Docker container and we, therefore, need some configurations in a prometheus.yml file that you can place anywhere on your hard drive:
