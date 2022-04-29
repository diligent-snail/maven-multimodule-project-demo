#!/usr/bin/env bash

JAVA_HOME=~/.jdks/openjdk-17.0.1
PATH_TO_FX=/tmp/javafx-sdk-17.0.2

${JAVA_HOME}/bin/java \
	--module-path jars:${PATH_TO_FX}/lib \
	--module org.diligentsnail.javafxconsumer/org.diligentsnail.javafxconsumer.SampleApplication
