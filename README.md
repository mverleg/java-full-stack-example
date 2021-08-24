# Java full-stack

## Status

This project does not work yet, not even close.

## Goal

Use Java for both the server and the client. The client in this case is a vanilla browser, with Java compiled to Javascript and/or WebAssembly. No Java Applets!

* Java version: 8 for client and common code, anything for server
* Server: Spring, I guess
* Client: TeaVM with Flavour
* Communication: json (type-safe) over websocket
* Build tool: `maven`

## Build client

If you have Java versions between 8 and 11, you can just run

    mvn clean package

then you will find the html, css and js files in the `client/target/*-SNAPSHOT/` directory.

If you have a newer Java version, it might not work, even when setting source, target, release etc. You may get the error:

    Unsupported class file major version $number

If that is the case, use a lower Java version. An easy way to do that is with this single Docker command to build:

    docker run --rm -it -v "$(pwd)":/usr/src/mymaven -v /tmp/$USER/.m2:/root/.m2 -w /usr/src/mymaven maven:3.8.2-openjdk-11 mvn clean package

## Sources

* http://teavm.org/docs/flavour/custom-components.html
* https://github.com/konsoletyper/teavm-flavour-minesweeper

