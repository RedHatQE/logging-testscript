(defproject com.redhat.qe/logging-testscript "1.0.2"
  :description "A Test script class that initializes java.util.logging and reads in properties from a properties file."
  :java-source-path "src"
  :dependencies [[com.redhat.qe/comparisons "1.0.0"]]
  :javac-options {:debug "on"})
