#!/usr/bin/env bash

JAVA_HOME=~/.jdks/openjdk-17.0.1

${JAVA_HOME}/bin/java \
	--module-path jars \
	--module org.diligentsnail.consoleconsumer/org.diligentsnail.consoleconsumer.Main
