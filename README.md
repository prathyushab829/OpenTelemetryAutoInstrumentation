Make sure OT collector running
To run OT collector use "./otelcol-contrib --config=otelcontrib.yml"

To run springboot for autoinstrumentation use below command
java -javaagent:path/to/opentelemetry-javaagent.jar
-Dotel.exporter.otlp.endpoint=http://localhost:4317 
-jar target/springBootOT.jar