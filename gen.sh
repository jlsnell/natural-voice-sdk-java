#!/usr/bin/env bash

set -e

echo "Clean source under src/main/java"
cp src/main/java/io/swagger/client/Configuration.java .
cp src/main/java/io/swagger/client/model/Point.java .
cp src/main/java/io/swagger/client/model/Polygon.java .
rm -rf src/main/java/io

echo "Generate source code"
mvn clean generate-sources

echo "Move generate code to source folder"
cp -r target/generated-sources/swagger/src/main/java/*  src/main/java/
cp Configuration.java src/main/java/io/swagger/client/
cp Point.java src/main/java/io/swagger/client/model/
cp Polygon.java src/main/java/io/swagger/client/model/

rm Configuration.java
rm Point.java
rm Polygon.java

echo "Clean up generated folder"
#rm -rf target